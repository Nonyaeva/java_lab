package mirea_lab_8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color; // Цвет фигуры
    protected int x; // Позиция по оси X
    protected int y; // Позиция по оси Y

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод для отрисовки фигуры
    abstract void draw(Graphics g);
}

