package dnd.UIs;

import dnd.character.CharacterCreator;
import dnd.character.characterProps.EClass;
import dnd.character.characterProps.HitPoints;
import dnd.character.characterProps.chars.Characteristics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class CharacteristicsUI {
    private static final List<Integer> list = Characteristics.generate();
    private final List<String> charsList = Arrays.asList("STR", "DEX", "CON", "INT", "WIS", "CHA");
    private final List<Integer> rawList = Arrays.asList(8, 8, 8, 8, 8, 8);
    private final JFrame frame = new JFrame("DnDFunnyShit");
    private final SendActionListener1 sendActionListener1 = new SendActionListener1();
    private final DefaultComboBoxModel<Integer> dml = new DefaultComboBoxModel<>();
    private final CharacterCreator character;
    private int cnt = 0;
    private JComboBox<Integer> comboBox;
    private JPanel charsPanel;
    private JButton send;

    public CharacteristicsUI(CharacterCreator characterCreator) {
        this.character = characterCreator;
        frame.setContentPane(charsPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        send.addActionListener(sendActionListener1);
        dml.addAll(list);
        comboBox.setModel(dml);
        comboBox.setSelectedIndex(0);
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
            character.setHP(HitPoints.generateForLevel(character.getLevel(), EClass.get(character.getClassName()).hitDices(), rawList.get(2)));
        }
    }
}
