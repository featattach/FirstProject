package test;
import javax.swing.JFrame;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tetris extends JFrame {
    private GameBoard gameBoard;
    public Tetris() {
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 800);
        setLocationRelativeTo(null);
        gameBoard = new GameBoard();
        add(gameBoard);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Tetris();
    }
}