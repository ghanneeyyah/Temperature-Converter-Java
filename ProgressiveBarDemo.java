package temperature_converter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressiveBarDemo {
    JProgressBar bar = new JProgressBar();
    JFrame frame = new JFrame();
    String name;

    public ProgressiveBarDemo(String name) {
        this.name = name;

        bar.setValue(0);
        bar.setBounds(0, 0, 500, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 30));
        bar.setForeground(Color.green);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;

        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }

        bar.setString("DONE! :)");
        new SlideDemo(name); // Pass name forward
        frame.dispose();
    }
}



