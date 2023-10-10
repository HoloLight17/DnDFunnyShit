package dnd;

import dnd.character.Class;
import dnd.character.HitPoints;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Creator {
    private final SendActionListener listener = new SendActionListener();
    private final JFrame frame = new JFrame("DnDFunnyShit");
    private JComboBox<String> classNames;
    private JPanel panel1;
    private JButton sendButton;
    private JSlider levelSlider;
    private String className;
    private Integer level;

    Creator() {
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void GUIShow() {
        frame.setVisible(true);
        frame.setResizable(false);
        sendButton.addActionListener(listener);
    }

    private void send() {
        frame.dispose();
        System.out.println(HitPoints.generateForLevel(level, Class.get(className).hitDices()));
    }

    private class SendActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            className = (String) classNames.getSelectedItem();
            level = levelSlider.getValue();
            send();
        }
    }
}