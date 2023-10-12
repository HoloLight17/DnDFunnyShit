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

public class CharacteristicsUI {
    private static final List<Integer> list = Characteristics.generate();
    private final List<String> charsList = Arrays.asList("STR", "DEX", "CON", "INT", "WIS", "CHA");
    private final List<Integer> rawList = Arrays.asList(8, 8, 8, 8, 8, 8);
    private final JDialog frame = new JDialog(new Frame(), "DnDFunnyShit");
    private final DefaultComboBoxModel<Integer> dml = new DefaultComboBoxModel<>();
    private final CharacterCreator character;
    private int cnt = 0;
    private JComboBox<Integer> comboBox;
    private JPanel charsPanel;
    private JButton send;
    private JLabel charName;

    public CharacteristicsUI(CharacterCreator characterCreator) {
        this.character = characterCreator;
        frame.setContentPane(charsPanel);
        frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frame.setModal(true);
        frame.pack();
        send.addActionListener(new SendActionListener1());
        dml.addAll(list);
        comboBox.setModel(dml);
        comboBox.setSelectedIndex(0);
        charName.setText(charsList.get(0));
    }

    public void getGUI() {
        frame.setVisible(true);
        frame.setResizable(false);
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

    private class SendActionListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (cnt >= 5) {
                frame.dispose();
                sendToList(rawList);
            } else {
                replaceList(cnt, comboBox.getSelectedItem());
            }
        }

        private void sendToList(List<Integer> rawList) {
            character.setChars(rawList);
        }
    }
}
