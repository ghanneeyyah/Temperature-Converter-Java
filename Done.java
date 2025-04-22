package temperature_converter;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Done {
    JFrame frame;
    JLabel label;

    Done(String name) {
        frame = new JFrame("DONE!!");
        label = new JLabel("Thanks for your time " + name);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        frame.add(label);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
