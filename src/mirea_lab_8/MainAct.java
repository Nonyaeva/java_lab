package mirea_lab_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainAct extends JComponent implements ActionListener {
    private static final String[] framePaths = {
            "src/mirea_lab_8/скример.png", // Путь к первому кадру
            "src/mirea_lab_8/скример 2.png", // Путь ко второму кадру
            "src/mirea_lab_8/скример 3.png" // Путь к третьему кадру и так далее
    };

    private int currentFrameIndex = 0;
    private Image[] frames = new Image[framePaths.length];
    private Timer timer;

    public MainAct() {
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]).getImage();
        }

        timer = new Timer(1000, this); // Интервал смены кадров (в миллисекундах)
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr = (Graphics2D) g;
        gr.drawImage(frames[currentFrameIndex], 0, 0, null);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Animation");
        MainAct t = new MainAct();
        f.add(t);
        f.setSize(900, 900);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
        repaint();
    }
}
