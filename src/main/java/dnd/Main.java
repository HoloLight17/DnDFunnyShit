package dnd;

import dnd.character.CharacterCreator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CharacterCreator character = new CharacterCreator();
        character.createCharacter();
        while (character.getClassName() == null) {

        }
    }
}