package mirea_lab_8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes"); // Создание окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Random random = new Random();

                for (int i = 0; i < 20; i++) {
                    // Генерация случайного цвета
                    int red = random.nextInt(256);
                    int green = random.nextInt(256);
                    int blue = random.nextInt(256);
                    Color color = new Color(red, green, blue);

                    // Генерация случайных координат и размеров фигур
                    int x = random.nextInt(getWidth());
                    int y = random.nextInt(getHeight());
                    int radius = random.nextInt(50) + 10;
                    int width = random.nextInt(100) + 10;
                    int height = random.nextInt(100) + 10;

                    // Генерация случайного числа для выбора фигуры
                    int shapeType = random.nextInt(2);

                    // Создание и отрисовка случайной фигуры
                    if (shapeType == 0) {
                        Circle circle = new Circle(color, x, y, radius);
                        circle.draw(g);
                    } else {
                        Rectangle rectangle = new Rectangle(color, x, y, width, height);
                        rectangle.draw(g);
                    }
                }
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
