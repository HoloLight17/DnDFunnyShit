package dnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Creator {
    private final SendActionListener listener = new SendActionListener();
    private final JFrame frame = new JFrame("DnDFunnyShit");
    private JComboBox<String> classNames;
    private JPanel panel1;
    private JButton button;
    private String className;

    Creator() {
        frame.setMaximizedBounds(new Rectangle(300, 300, 300, 200));
        frame.setBounds(300, 300, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void GUIShow() {
        frame.setContentPane(panel1);
        frame.setVisible(true);
        frame.setResizable(false);
        button.addActionListener(listener);
    }

    private void send() {
        System.out.println(className);
    }

    private class SendActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            className = (String) classNames.getSelectedItem();
            send();
        }
    }
}