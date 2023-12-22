package mirea_lab_8;

import java.awt.*;

class Circle extends Shape {
    private int radius; // Радиус круга

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    // Переопределение метода draw для отрисовки круга
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
