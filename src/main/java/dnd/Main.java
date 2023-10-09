package dnd;

import dnd.character.HitPoints;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Characteristics.generate());
        System.out.println(HitPoints.generateForLevel(7, 8, 2));
//        System.out.println(HitPoints.randomizeHPOnce(8, 2));
    }
}