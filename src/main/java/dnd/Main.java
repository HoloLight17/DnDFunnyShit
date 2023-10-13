package dnd;

import dnd.character.CharacterCreator;
import dnd.character.characterProps.HitPoints;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        CharacterCreator character = new CharacterCreator();
//        character.createCharacter();
        System.out.println(HitPoints.generateForLevel(3, 10, 1));
    }
}