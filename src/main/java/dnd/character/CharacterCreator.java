package dnd.character;

import dnd.UIs.CharacteristicsUI;
import dnd.UIs.CreatorUI;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CharacterCreator {
    private String className = null;
    private int level = 1;
    private List<Integer> chars = null;
    private int HP = 0;

    public void createCharacter() {
        getClassAndLevel();
        getCharsList();
    }

    private void getClassAndLevel() {
        new CreatorUI(this).GUIShow();
    }

    private void getCharsList() {
        new CharacteristicsUI(this).getGUI();
    }

    @Override
    public String toString() {
        return "Level: " + level +
                "Class: " + className +
                "HP: " + HP;
    }
}
