package dnd;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HitPoints {
    public static Integer generateForLevel(int level, int dice, int conMod) {
        return hitpointsRoller(level, dice, conMod);
    }

    public static Integer randomizeHPOnce(int dice, int conMod) {
        return generateForLevel(1, dice, conMod);
    }

    private static Integer hitpointsRoller(int level, int dice, int conMod) {
        List<Integer> hits = new Random().ints(level - 1, 2, dice + 1).boxed().collect(Collectors.toList());
        System.out.println(hits);
        return hits.stream().mapToInt(Integer::intValue).sum() + dice + conMod * level;
    }
}