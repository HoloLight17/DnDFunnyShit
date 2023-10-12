package dnd.UIs;

import dnd.character.CharacterCreator;
import dnd.character.characterProps.EClass;
import dnd.character.characterProps.HitPoints;
import dnd.character.characterProps.chars.Characteristics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class CreatorUI {
    private static final List<Integer> list = Characteristics.generate();
    private final CharacterCreator character;
    private final List<String> charsList = Arrays.asList("STR", "DEX", "CON", "INT", "WIS", "CHA");
    private final List<Integer> rawList = Arrays.asList(8, 8, 8, 8, 8, 8);
    private final JDialog frame = new JDialog(new Frame(), "DnDFunnyShit");
    private final DefaultComboBoxModel<Integer> dml = new DefaultComboBoxModel<>();
    private JComboBox<String> classNames;
    private JSlider levelSlider;
    private String className;
    private Integer level;
    private int cnt = 0;
    private JComboBox<Integer> comboBox;
    private JButton sendButton;
    private JLabel charName;
    private JSplitPane panel;
    private JPanel classPanel;
    private JPanel charsPanel;

    public CreatorUI(CharacterCreator characterCreator) {
        this.character = characterCreator;
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.setModal(true);
        frame.pack();
        sendButton.addActionListener(new SendActionListener());
        dml.addAll(list);
        comboBox.setModel(dml);
        comboBox.setSelectedIndex(0);
        charName.setText(charsList.get(0));
    }

    private void replaceList(int i, Object value) {
        if (value != null) {
            rawList.set(i, (Integer) value);
            list.remove(value);
            dml.removeAllElements();
            dml.addAll(list);
            comboBox.setModel(dml);
            ++cnt;
            charName.setText(charsList.get(cnt));
        }
    }

    public void GUIShow() {
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private void sendToList() {
        character.setClassName(className);
        character.setLevel(level);
        character.setChars(rawList);
        character.setHP(HitPoints.generateForLevel(level, EClass.get(className).hitDices(), rawList.get(2)));
    }

    private class SendActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (cnt >= 5) {
                className = (String) classNames.getSelectedItem();
                level = levelSlider.getValue();
                frame.dispose();
                sendToList();
            } else {
                replaceList(cnt, comboBox.getSelectedItem());
            }
        }
    }
}