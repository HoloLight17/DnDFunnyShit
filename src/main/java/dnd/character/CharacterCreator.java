package dnd.character;

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
        getClassLevelChars();
    }

    private void getClassLevelChars() {
        new CreatorUI(this).GUIShow();
    }

    @Override
    public String toString() {
        return "Level: " + level +
                "\nClass: " + className +
                "\nHP: " + HP +
                "\n\tSTR: " + chars.get(0) +
                "\tDEX: " + chars.get(1) +
                "\tCON: " + chars.get(2) +
                "\tINT: " + chars.get(3) +
                "\tWIS: " + chars.get(4) +
                "\tCHA: " + chars.get(5);
    }
}
