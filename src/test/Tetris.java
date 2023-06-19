package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Tetris extends JPanel {

    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 22;
    private final int DELAY = 300;

    private Timer timer;
    private boolean isFallingFinished = false;
    private boolean isStarted = false;
    private boolean isPaused = false;
    private int numLinesRemoved = 0;
    private int curX = 0;
    private int curY = 0;
    private Shape curPiece;
    private Shape.Tetrominoes[] board;

    public Tetris() {
        initBoard();
    }

    private void initBoard() {

        setFocusable(true);
        addKeyListener(new TAdapter());

        board = new Shape.Tetrominoes[BOARD_WIDTH * BOARD_HEIGHT];
        clearBoard();

        timer = new Timer(DELAY, new GameCycle());
        timer.start();
    }

    private int squareWidth() {
        return (int) getSize().getWidth() / BOARD_WIDTH;
    }

    private int squareHeight() {
        return (int) getSize().getHeight() / BOARD_HEIGHT;
    }

    private Shape.Tetrominoes shapeAt(int x, int y) {
        return board[(y * BOARD_WIDTH) + x];
    }

    private void start() {

        if (isPaused) {
            return;
        }

        isStarted = true;
        isFallingFinished = false;
        numLinesRemoved = 0;
        clearBoard();

        newPiece();
        timer.start();
    }

    private void pause() {

        if (!isStarted) {
            return;
        }

        isPaused = !isPaused;

        if (isPaused) {
            timer.stop();
        } else {
            timer.start();
        }

        repaint();
    }

    private void doDrawing(Graphics g) {

        var size = getSize();
        int boardTop = (int) size.getHeight() - BOARD_HEIGHT * squareHeight();

        for (int i = 0; i < BOARD_HEIGHT; ++i) {
            for (int j = 0; j < BOARD_WIDTH; ++j) {
                Shape.Tetrominoes shape = shapeAt(j, BOARD_HEIGHT - i - 1);

                if (shape != Shape.Tetrominoes.NoShape) {
                    drawSquare(g, j * squareWidth(),
                            boardTop + i * squareHeight(), shape);
                }
            }
        }

        if (curPiece.getShape() != Shape.Tetrominoes.NoShape) {
            for (int i = 0; i < 4; ++i) {
                int x = curX + curPiece.getX(i);
                int y = curY - curPiece.getY(i);
                drawSquare(g, x * squareWidth(),
                        boardTop + (BOARD_HEIGHT - y - 1) * squareHeight(),
                        curPiece.getShape());
            }
        }
    }

    private void dropDown() {

        int newY = curY;

        while (newY > 0) {
            if (!tryMove(curPiece, curX, newY - 1)) {
                break;
            }
            --newY;
        }

        pieceDropped();
    }

    private void oneLineDown() {

        if (!tryMove(curPiece, curX, curY - 1)) {
            pieceDropped();
        }
    }

    private void clearBoard() {

        for (int i = 0; i < BOARD_HEIGHT * BOARD_WIDTH; ++i) {
            board[i] = Shape.Tetrominoes.NoShape;
        }
    }

    private void pieceDropped() {

        for (int i = 0; i < 4; ++i) {
            int x = curX + curPiece.getX(i);
            int y = curY - curPiece.getY(i);
            board[(y * BOARD_WIDTH) + x] = curPiece.getShape();
        }

        removeFullLines();

        if (!isFallingFinished) {
            newPiece();
        }
    }

    private void newPiece() {

        curPiece = new Shape();
        curPiece.setRandomShape();
        curX = BOARD_WIDTH / 2 + 1;
        curY = BOARD_HEIGHT - 1 + curPiece.minY();

        if (!tryMove(curPiece, curX, curY)) {
            curPiece.setShape(Shape.Tetrominoes.NoShape);
            timer.stop();
            isStarted = false;
        }
    }

    private boolean tryMove(Shape newPiece, int newX, int newY) {

        for (int i = 0; i < 4; ++i) {
            int x = newX + newPiece.getX(i);
            int y = newY - newPiece.getY(i);

            if (x < 0 || x >= BOARD_WIDTH || y < 0 || y >= BOARD_HEIGHT) {
                return false;
            }

            if (shapeAt(x, y) != Shape.Tetrominoes.NoShape) {
                return false;
            }
        }

        curPiece = newPiece;
        curX = newX;
        curY = newY;

        repaint();

        return true;
    }

    private void removeFullLines() {

        int numFullLines = 0;

        for (int i = BOARD_HEIGHT - 1; i >= 0; --i) {
            boolean lineIsFull = true;

            for (int j = 0; j < BOARD_WIDTH; ++j) {
                if (shapeAt(j, i) == Shape.Tetrominoes.NoShape) {
                    lineIsFull = false;
                    break;
                }
            }

            if (lineIsFull) {
                ++numFullLines;

                for (int k = i; k < BOARD_HEIGHT - 1; ++k) {
                    for (int j = 0; j < BOARD_WIDTH; ++j) {
                        board[(k * BOARD_WIDTH) + j] = shapeAt(j, k + 1);
                    }
                }
            }
        }

        if (numFullLines > 0) {
            numLinesRemoved += numFullLines;
            isFallingFinished = true;
            curPiece.setShape(Shape.Tetrominoes.NoShape);
            repaint();
        }
    }

    private void drawSquare(Graphics g, int x, int y, Shape.Tetrominoes shape) {

        Color colors[] = {new Color(0, 0, 0), new Color(204, 102, 102),
                new Color(102, 204, 102), new Color(102, 102, 204),
                new Color(204, 204, 102), new Color(204, 102, 204),
                new Color(102, 204, 204), new Color(218, 170, 0)
        };

        var color = colors[shape.ordinal()];

        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);
        g.setColor(color.brighter());
        g.drawLine(x, y + squareHeight() - 1, x, y);
        g.drawLine(x, y, x + squareWidth() - 1, y);
        g.setColor(color.darker());
        g.drawLine(x + 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + squareHeight() - 1);
        g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + 1);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);

        if (isPaused) {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {

        var msg = "Game Over";
        var smallFont = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics fm = getFontMetrics(smallFont);

        g.setColor(Color.BLACK);
        g.setFont(smallFont);
        g.drawString(msg, (BOARD_WIDTH * squareWidth() - fm.stringWidth(msg)) / 2,
                BOARD_HEIGHT * squareHeight() / 2);
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            if (!isStarted || curPiece.getShape() == Shape.Tetrominoes.NoShape) {
                return;
            }

            int keycode = e.getKeyCode();

            if (keycode == 'P' || keycode == 'p') {
                pause();
                return;
            }

            if (isPaused) {
                return;
            }

            switch (keycode) {
                case KeyEvent.VK_LEFT:
                    tryMove(curPiece, curX - 1, curY);
                    break;
                case KeyEvent.VK_RIGHT:
                    tryMove(curPiece, curX + 1, curY);
                    break;
                case KeyEvent.VK_DOWN:
                    tryMove(curPiece.rotateRight(), curX, curY);
                    break;
                case KeyEvent.VK_UP:
                    tryMove(curPiece.rotateLeft(), curX, curY);
                    break;
                case KeyEvent.VK_SPACE:
                    dropDown();
                    break;
            }
        }
    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            doGameCycle();
        }
    }

    private void doGameCycle() {

        update();

        if (isFallingFinished) {
            isFallingFinished = false;
            newPiece();
        } else {
            oneLineDown();
        }
    }

    private void update() {
        if (isPaused) {
            return;
        }

        if (!isStarted) {
            start();
        }
    }

    public static void main(String[] args) {

        var tetris = new Tetris();
        tetris.initUI();
    }

    private void initUI() {

        var frame = new JFrame("Tetris");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 640);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public class Shape {

        public enum Tetrominoes {
            NoShape, ZShape, SShape, LineShape,
            TShape, SquareShape, LShape, MirroredLShape
        }

        private Tetrominoes pieceShape;
        private int coords[][];
        private int[][][] coordsTable;

        public Shape() {

            coords = new int[4][2];
            setShape(Tetrominoes.NoShape);
        }

        public void setShape(Tetrominoes shape) {

            coordsTable = new int[][][]{
                    {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
                    {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
                    {{0, -1}, {0, 0}, {1, 0}, {1, 1}},
                    {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
                    {{-1, 0}, {0, 0}, {1, 0}, {0, 1}},
                    {{0, 0}, {1, 0}, {0, 1}, {1, 1}},
                    {{-1, -1}, {0, -1}, {0, 0}, {0, 1}},
                    {{1, -1}, {0, -1}, {0, 0}, {0, 1}}
            };

            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 2; ++j) {
                    coords[i][j] = coordsTable[shape.ordinal()][i][j];
                }
            }

            pieceShape = shape;
        }

        private void setX(int index, int x) {
            coords[index][0] = x;
        }

        private void setY(int index, int y) {
            coords[index][1] = y;
        }

        public int getX(int index) {
            return coords[index][0];
        }

        public int getY(int index) {
            return coords[index][1];
        }

        public Tetrominoes getShape() {
            return pieceShape;
        }

        public void setRandomShape() {

            var r = new Random();
            int x = Math.abs(r.nextInt()) % 7 + 1;

            Tetrominoes[] values = Tetrominoes.values();
            setShape(values[x]);
        }

        public int minY() {

            int m = coords[0][1];

            for (int i = 0; i < 4; i++) {
                m = Math.min(m, coords[i][1]);
            }

            return m;
        }

        public Shape rotateLeft() {

            if (pieceShape == Tetrominoes.SquareShape) {
                return this;
            }

            var result = new Shape();
            result.pieceShape = pieceShape;

            for (int i = 0; i < 4; ++i) {
                result.setX(i, getY(i));
                result.setY(i, -getX(i));
            }

            return result;
        }

        public Shape rotateRight() {

            if (pieceShape == Tetrominoes.SquareShape) {
                return this;
            }

            var result = new Shape();
            result.pieceShape = pieceShape;

            for (int i = 0; i < 4; ++i) {
                result.setX(i, -getY(i));
                result.setY(i, getX(i));
            }

            return result;
        }
    }

}
