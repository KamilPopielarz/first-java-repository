package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class ProjectMof extends JFrame {

    private static final int SCALE_FACTOR = 10;

    public ProjectMof() {
        // Wykonanie spaceru losowego dla n_steps
        int nSteps = 20;  // Increase the number of steps
        List<Integer> randomWalkResult = randomWalk(nSteps);

        // Przedstawienie graficzne
        plotRandomWalk(randomWalkResult);
    }

    public List<Integer> randomWalk(int n) {
        List<Integer> x = new ArrayList<>();
        x.add(0);

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int step = random.nextBoolean() ? 1 : -1;
            x.add(x.get(x.size() - 1) + step);
        }

        return x;
    }

    public void plotRandomWalk(List<Integer> randomWalkResult) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Spacer losowy");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    plotAxis(g);
                    plotPoints(g, randomWalkResult);
                    plotLines(g, randomWalkResult);
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private void plotAxis(Graphics g) {
        g.drawLine(50, 100, 750, 100);  // X-axis
        g.drawLine(50, 100, 50, 50);    // Y-axis
    }

    private void plotLines(Graphics g, List<Integer> points) {
        int x = 50;
        int y = 100;

        for (int i = 1; i < points.size(); i++) {
            int x2 = x + 30;
            int y2 = y - points.get(i) * SCALE_FACTOR;

            g.drawLine(x, y, x2, y2);

            x = x2;
            y = y2;
        }
    }

    private void plotPoints(Graphics g, List<Integer> points) {
        int x = 50;
        int y = 100;

        for (int point : points) {
            g.fillOval(x, y - point * SCALE_FACTOR, 5, 5);
            x += 30; // Adjust for spacing between points
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ProjectMof::new);
    }
}

