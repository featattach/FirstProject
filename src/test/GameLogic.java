package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Point;
import java.util.Random;
import test.TetrominoType;

import static test.GameBoard.NUM_ROWS;


public class GameLogic {
    private GameBoard gameBoard;
    private Tetromino currentTetromino;
    private Timer timer;
    private Random random = new Random();

    public GameLogic(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        currentTetromino = createRandomTetromino();
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveTetrominoDown();
            }
        });
        timer.start();
    }

    private Tetromino createRandomTetromino() {
        // Здесь нужно реализовать логику создания случайной фигуры Tetromino
        // ...
        Point[][] tetrominos = {
                { // I-фигура
                        new Point(0, 0),
                        new Point(0, 1),
                        new Point(0, 2),
                        new Point(0, 3)
                },
                { // J-фигура
                        new Point(0, 0),
                        new Point(1, 0),
                        new Point(1, 1),
                        new Point(1, 2)
                },
                // Добавьте другие фигуры в аналогичном формате
        };
        int randomIndex = (int) (Math.random() * tetrominos.length);
        Point[] points = tetrominos[randomIndex];
        Color color = getRandomColor();

        return new Tetromino(points, color);
    }
    private Color getRandomColor() {
        // Здесь можно реализовать логику выбора случайного цвета для фигуры
        // ...
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }


    private boolean moveTetrominoDown() {
        if (canMoveTetromino(currentTetromino, 0, 1)) {
            currentTetromino.move(0, 1);
            gameBoard.repaint();
            return true;
        } else {
            lockTetromino();
            return false;
        }
    }

    private void moveTetrominoLeft() {
        if (canMoveTetromino(currentTetromino, -1, 0)) {
            currentTetromino.move(-1, 0);
        }
        gameBoard.repaint();
    }
    private void moveTetrominoRight() {
        if (canMoveTetromino(currentTetromino, 1, 0)) {
            currentTetromino.move(1, 0);
        }
        gameBoard.repaint();
    }

    private boolean canMoveTetromino(Tetromino tetromino, int offsetX, int offsetY) {
        for (Point point : tetromino.getPoints()) {
            int x = point.x + offsetX;
            int y = point.y + offsetY;

            if (x < 0 || x >= GameBoard.NUM_COLS || y < 0 || y >= NUM_ROWS ||
                    gameBoard.isCellOccupied(x, y)) {
                return false;
            }
        }
        return true;

    }


    private void fixTetromino() {
        for (Point point : currentTetromino.getPoints()) {
            int x = point.x;
            int y = point.y;
            gameBoard.setCellOccupied(x, y, true);
            gameBoard.setCellColor(x, y, currentTetromino.getColor());
        }
        clearFullRows();
    }
    private void clearFullRows() {
        for (int row = NUM_ROWS - 1; row >= 0; row--) {
            if (gameBoard.isRowFull(row)) {
                gameBoard.clearRow(row);
                shiftRowsDown(row);
            }
        }
    }
    private void shiftRowsDown(int startRow) {
        for (int row = startRow - 1; row >= 0; row--) {
            for (int col = 0; col < GameBoard.NUM_COLS; col++) {
                if (gameBoard.isCellOccupied(col, row)) {
                    Color color = gameBoard.getCellColor(col, row);
                    gameBoard.setCellOccupied(col, row, false);
                    gameBoard.setCellColor(col, row, null);
                    gameBoard.setCellOccupied(col, row + 1, true);
                    gameBoard.setCellColor(col, row + 1, color);
                }
            }
        }
    }
    private void rotateTetromino() {
        Tetromino rotatedTetromino = currentTetromino;
        if (canMoveTetromino(rotatedTetromino, 0, 0)) {
            currentTetromino = rotatedTetromino;
        }
        gameBoard.repaint();
    }

    private void lockTetromino() {
        // Получаем координаты точек фигуры и занимаем соответствующие клетки на игровом поле
        for (Point point : currentTetromino.getPoints()) {
            int x = currentTetromino.getX() + point.x;
            int y = currentTetromino.getY() + point.y;
            gameBoard.setCellOccupied(x, y, true);
        }

        // Проверяем, есть ли заполненные строки на игровом поле и удаляем их
        checkAndClearLines();

        // Создаем новую текущую фигуру
        currentTetromino = getRandomTetromino();
        spawnTetromino();

        // Проверяем, если новая фигура немедленно сталкивается с другими фигурами,
        // то игра заканчивается
        if (!canMoveTetromino(currentTetromino, 0, 0)) {
            gameOver();
        }
    }
    private void checkAndClearLines() {
        for (int row = NUM_ROWS - 1; row >= 0; row--) {
            boolean lineIsFull = true;
            for (int col = 0; col < GameBoard.NUM_COLS; col++) {
                if (!gameBoard.isCellOccupied(col, row)) {
                    lineIsFull = false;
                    break;
                }
            }
            if (lineIsFull) {
                clearLine(row);
                moveLinesDown(row);
                row++; // Проверяем строку заново после смещения
            }
        }
    }
    private void clearLine(int row) {
        for (int col = 0; col < GameBoard.NUM_COLS; col++) {
            gameBoard.setCellOccupied(col, row, false);
        }
    }

    private void moveLinesDown(int startRow) {
        for (int row = startRow - 1; row >= 0; row--) {
            for (int col = 0; col < GameBoard.NUM_COLS; col++) {
                boolean isCellOccupied = gameBoard.isCellOccupied(col, row);
                gameBoard.setCellOccupied(col, row + 1, isCellOccupied);
            }
        }
    }

    private Tetromino getRandomTetromino() {
        TetrominoType[] tetrominoTypes = TetrominoType.values();
        TetrominoType randomType = tetrominoTypes[random.nextInt(tetrominoTypes.length)];

        return new Tetromino(randomType);
    }

    private void spawnTetromino() {
        currentTetromino.setX(GameBoard.NUM_COLS / 2);
        currentTetromino.setY(0);
    }
    public boolean gameOver() {
        // Проверяем, достигла ли текущая фигура нижней границы
        for (Point point : currentTetromino.getShape()) {
            int x = currentTetromino.getX() + point.x;
            int y = currentTetromino.getY() + point.y;

            if (y >= NUM_ROWS - 1) {
                // Фигура достигла нижней границы, игра завершается
                return true;
            }
        }

        return false;
    }

    public void checkGameOver() {
        if (!canMoveTetromino(currentTetromino, currentTetromino.getX(), currentTetromino.getY() + 1)) {
            // Фигура не может двигаться вниз
            lockTetromino(); // Установка фигуры на место
            if (currentTetromino.getY() <= 0) {
                // Фигура достигла верхней границы поля, игра окончена
                gameOver();
            } else {
                // Генерация новой фигуры
                spawnTetromino();
            }
        }
    }


    public void handleKeyPressed(KeyEvent event) {
        if (gameOver()) {
            return; // Если игра завершена, игнорируем нажатия клавиш
        }

        KeyCode keyCode = event.getCode();

        switch (keyCode) {
            case LEFT:
                moveTetrominoLeft();
                break;
            case RIGHT:
                moveTetrominoRight();
                break;
            case DOWN:
                moveTetrominoDown();
                break;
            case UP:
                rotateTetromino();
                break;
            case SPACE:
                dropTetromino();
                break;
            default:
                // Нажатие другой клавиши, игнорируем
                break;
        }
    }

}