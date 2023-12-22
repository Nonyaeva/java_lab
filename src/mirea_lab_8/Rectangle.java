package mirea_lab_8;

import java.awt.*;

class Rectangle extends Shape{
    private int width; // Ширина прямоугольника
    private int height; // Высота прямоугольника

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    // Переопределение метода draw для отрисовки прямоугольника
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - width / 2, y - height / 2, width, height);
    }
}


