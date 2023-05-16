package test;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class GameBoard extends JPanel {
    public static final int NUM_ROWS = 20;
    public static final int NUM_COLS = 10;
    private boolean[][] cellsOccupied;
    private Color[][] cellsColor;

    public GameBoard() {
        cellsOccupied = new boolean[NUM_COLS][NUM_ROWS];
        cellsColor = new Color[NUM_COLS][NUM_ROWS];
        setPreferredSize(new Dimension(NUM_COLS * 30, NUM_ROWS * 30));
    }

    public boolean isCellOccupied(int col, int row) {
        return cellsOccupied[col][row];
    }

    public void setCellOccupied(int col, int row, boolean occupied) {
        cellsOccupied[col][row] = occupied;
    }

    public Color getCellColor(int col, int row) {
        return cellsColor[col][row];
    }

    public void setCellColor(int col, int row, Color color) {
        cellsColor[col][row] = color;
    }

    public void clearRow(int row) {
        for (int col = 0; col < NUM_COLS; col++) {
            cellsOccupied[col][row] = false;
            cellsColor[col][row] = null;
        }
    }

    public boolean isRowFull(int row) {
        for (int col = 0; col < NUM_COLS; col++) {
            if (!cellsOccupied[col][row]) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int col = 0; col < NUM_COLS; col++) {
            for (int row = 0; row < NUM_ROWS; row++) {
                if (cellsOccupied[col][row]) {
                    Color color = cellsColor[col][row];
                    g.setColor(color);
                    g.fillRect(col * 30, row * 30, 30, 30);
                    g.setColor(Color.BLACK);
                    g.drawRect(col * 30, row * 30, 30, 30);
                }
            }
        }
    }
}