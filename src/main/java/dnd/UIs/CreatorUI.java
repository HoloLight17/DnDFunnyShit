package dnd.UIs;

import dnd.character.CharacterCreator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatorUI {
    private final SendActionListener sendActionListener = new SendActionListener();
    private final JFrame frame = new JFrame("DnDFunnyShit");
    private final CharacterCreator character;
    private JComboBox<String> classNames;
    private JPanel panel1;
    private JButton sendButton;
    private JSlider levelSlider;
    private String className;
    private Integer level;

    public CreatorUI(CharacterCreator characterCreator) {
        this.character = characterCreator;
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        sendButton.addActionListener(sendActionListener);
    }

    public void GUIShow() {
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private void send() {
        frame.dispose();
        character.setClassName(className);
        character.setLevel(level);
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