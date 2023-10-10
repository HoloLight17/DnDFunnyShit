package dnd.character;

import dnd.Main;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum Class {
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

    private static final Map<String, Class> lookup = new HashMap<>();

    static {
        for (Class c : Class.values()) {
            lookup.put(c.getClassName(), c);
        }
    }

    private final String className;

    Class(String className) {
        this.className = className;
    }

    public static Class get(String className) {
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
