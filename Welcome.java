package temperature_converter;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Welcome extends JFrame implements ActionListener {
    String name;
    JLabel label;
    JButton button;
    JTextField textField;
    JPanel panel;

    Welcome() {
        this.setTitle("Your Form");

        label = new JLabel("Enter your name: ");
        label.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBackground(Color.darkGray);
        button.setForeground(Color.WHITE);

        textField = new JTextField();
        textField.setPreferredSize(new DimensionUIResource(100, 40));
        textField.setBackground(Color.BLACK);
        textField.setFont(new Font("Comic Style", Font.BOLD, 20));
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.white);

        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());
        panel.setBounds(0, 0, 450, 100);
        panel.add(textField);
        panel.add(button);

        this.add(label);
        this.add(panel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            name = textField.getText();
            new ProgressiveBarDemo(name); // Pass name
            this.dispose();
        }
    }
}

