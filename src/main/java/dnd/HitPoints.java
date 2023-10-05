package dnd;

import java.util.Collections;
import java.util.Random;

public class HitPoints {
    public static Integer generate(int level, int dice) {
        return hitpointsRoller(level, dice);
    }

    private static Integer hitpointsRoller(int level, int dice) {
        return Collections.singletonList(
                new Random()
                        .ints(level - 1, 2, dice + 1)
                        .sum()).get(0);
    }
}