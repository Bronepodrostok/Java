package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreTable extends JFrame {
    private JButton Milan = new JButton("AC MIlan");
    private JButton Real = new JButton("Real Madrid");
    private JLabel Result = new JLabel("Result 0 X 0");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("WINNER: DRAW");
    private JPanel bottom = new JPanel();
    private JPanel middle = new JPanel();
    private int scoreA = 0;
    private int scoreB = 0;

    public ScoreTable() {
        super("Score Table");
        setLayout(new BorderLayout());
        add(bottom, BorderLayout.SOUTH);
        bottom.add(Milan);
        bottom.add(Real);
        add(winner, BorderLayout.NORTH);
        add(middle, BorderLayout.CENTER);
        middle.add(Result);
        middle.add(lastScorer);

        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreA++;
                lastScorer.setText("Last Scorer: AC Milan");
                if (scoreA > scoreB) {
                    winner.setText("WINNER: AC Milan");
                } else if (scoreA == scoreB) {
                    winner.setText("WINNER: DRAW");
                } else {
                    winner.setText("WINNER: Real Madrid");
                }
                Result.setText("Result " + scoreA + "X" + scoreB);
            }
        });

        Real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreB++;
                lastScorer.setText("Last Scorer: Real Madrid");
                if (scoreA > scoreB) {
                    winner.setText("WINNER: AC Milan");
                } else if (scoreA == scoreB) {
                    winner.setText("WINNER: DRAW");
                } else {
                    winner.setText("WINNER: Real Madrid");
                }
                Result.setText("Result " + scoreA + "X" + scoreB);
            }
        });
    }
}
