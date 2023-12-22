package mirea_lab_7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MatchResults extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel scorerLabel;
    private JLabel winnerLabel;
    private int milanScore;
    private int madridScore;

    public MatchResults() {
        milanScore = 0;
        madridScore = 0;

        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan", milanScore, madridScore);
            }
        });

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid", milanScore, madridScore);
            }
        });

        resultLabel = new JLabel("Result: 0 X 0");
        scorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        setLayout(new GridLayout(4, 1));
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(scorerLabel);
        add(winnerLabel);

        setTitle("Match Results");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateLabels(String lastScorer, int milanScore, int madridScore) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        scorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MatchResults();
            }
        });
    }
}