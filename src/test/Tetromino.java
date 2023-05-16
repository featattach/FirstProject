package test;

import java.awt.Color;
import java.awt.Point;
import java.util.Arrays;
import java.util.List;

public class Tetromino {
    private Point[] points;
    private Color color;
    private int x;
    private int y;

    private TetrominoType type;
    private List<Point> shape;

    public Tetromino(TetrominoType type) {
        this.type = type;
        switch (type) {
            case I:
                shape = Arrays.asList(
                        new Point(0, 0),
                        new Point(1, 0),
                        new Point(2, 0),
                        new Point(3, 0)
                );
                break;
            case J:
                shape = Arrays.asList(
                        new Point(0, 0),
                        new Point(1, 0),
                        new Point(1, 1),
                        new Point(1, 2)
                );
                break;
            case L:
                shape = Arrays.asList(
                        new Point(0, 0),
                        new Point(1, 0),
                        new Point(2, 0),
                        new Point(2, 1)
                );
                break;
            case O:
                shape = Arrays.asList(
                        new Point(0, 0),
                        new Point(0, 1),
                        new Point(1, 0),
                        new Point(1, 1)
                );
                break;
            case S:
                shape = Arrays.asList(
                        new Point(0, 1),
                        new Point(0, 2),
                        new Point(1, 0),
                        new Point(1, 1)
                );
                break;
            case T:
                shape = Arrays.asList(
                        new Point(0, 1),
                        new Point(1, 0),
                        new Point(1, 1),
                        new Point(1, 2)
                );
                break;
            case Z:
                shape = Arrays.asList(
                        new Point(0, 0),
                        new Point(0, 1),
                        new Point(1, 1),
                        new Point(1, 2)
                );
                break;
        }
    }

    public Tetromino(Point[] points, Color color) {
        this.points = points;
        this.color = color;
    }

    public Point[] getPoints() {
        return points;
    }
    public void move(int dx, int dy) {
        for (Point point : points) {
            point.x += dx;
            point.y += dy;
        }
    }

    public void rotate() {
        for (Point point : points) {
            int x = point.x;
            int y = point.y;
            point.x = -y;
            point.y = x;
        }
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Color getColor() {
        return color;
    }
    public List<Point> getShape() {
        return shape;
    }

}