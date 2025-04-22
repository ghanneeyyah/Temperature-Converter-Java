package temperature_converter;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SlideDemo implements ChangeListener, ActionListener {
    JButton button;
    JButton button2;
    JButton restartButton; // moved to class scope
    JFrame frame;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JPanel panel;
    JSlider slider;
    String name;

    public SlideDemo(String name) {
        this.name = name;

        button = new JButton("Convert to Fahrenheit.");
        button2 = new JButton("DONE!!");
        restartButton = new JButton("Restart");

        frame = new JFrame("Temperature Converter");
        label = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel = new JPanel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText(" \u00B0 C = " + slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label2.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label3.setFont(new Font("MV Boli", Font.PLAIN, 25));

        button.setFont(new Font("MV Boli", Font.PLAIN, 15));
        button.setFocusable(false);
        button.addActionListener(this);

        button2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        button2.setFocusable(false);
        button2.addActionListener(this);

        restartButton.setFont(new Font("MV Boli", Font.PLAIN, 15));
        restartButton.setFocusable(false);
        restartButton.addActionListener(this);

        panel.add(slider);
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(button);
        panel.add(button2);
        panel.add(restartButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int degree = slider.getValue();
        label.setText(" \u00B0 C = " + degree);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            int degree = slider.getValue();
            label2.setText("  || \u00B0 F = " + ((degree * 1.8) + 32));
            label3.setText("  || K = " + (degree + 273.15));
        } else if (e.getSource() == button2) {
            new Done(name);
            frame.dispose();
        } else if (e.getSource() == restartButton) {
            new Welcome();
            frame.dispose();
        }
    }
}
