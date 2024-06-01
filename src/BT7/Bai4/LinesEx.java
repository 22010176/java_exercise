package BT7.Bai4;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // int x = 30, y = 100, w = 100, h = 50;
        g2d.drawRect(30, 40, 100, 200);
        g2d.drawOval(140, 40, 200, 200);
        g2d.drawRect(350, 40, 200, 200);

        int[][] x = { { 360, 30 }, { 460, 50 }, { 460, 200 }, { 380, 300 } };
        for (int i = 0; i < x.length; ++i)
            g2d.drawLine(x[i][0] + 200, x[i][1], x[(i + 1) % x.length][0] + 200, x[(i + 1) % x.length][1]);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class LinesEx extends JFrame {

    public LinesEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Lines");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LinesEx ex = new LinesEx();
                ex.setVisible(true);
            }
        });
    }
}