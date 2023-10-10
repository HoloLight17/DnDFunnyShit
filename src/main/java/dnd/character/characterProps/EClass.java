package dnd.character.characterProps;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum EClass {
    ARTIFICER("Изобретатель"),
    BARD("Бард"),
    BARBARIAN("Варвар"),
    CLERIC("Жрец"),
    DRUID("Друид"),
    FIGHTER("Воин"),
    MONK("Монах"),
    PALADIN("Паладин"),
    RANGER("Следопыт"),
    ROGUE("Плут"),
    SORCERER("Чародей"),
    WARLOCK("Колдун"),
    WIZARD("Волшебник");

    private static final Map<String, EClass> lookup = new HashMap<>();

    static {
        for (EClass c : EClass.values()) {
            lookup.put(c.getClassName(), c);
        }
    }

    private final String className;

    EClass(String className) {
        this.className = className;
    }

    public static EClass get(String className) {
        return lookup.get(className);
    }

    public Integer hitDices() {
        switch (className) {
            case "Волшебник", "Чародей" -> {
                return 6;
            }
            case "Бард", "Друид", "Жрец", "Изобретатель", "Колдун", "Монах", "Плут" -> {
                return 8;
            }
            case "Воин", "Паладин", "Следопыт" -> {
                return 10;
            }
            default -> {
                return 12;
            }
        }
    }
}
