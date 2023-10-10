package dnd.character;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Characteristics {
    public static List<Integer> generate() {
        return characteristicsRoller();
    }

    private static List<Integer> characteristicsRoller() {
        List<Integer> finalResult = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Integer> dicesList = new ArrayList<>(Arrays.stream(new Random().ints(4, 1, 7).toArray()).boxed().toList());
            dicesList.remove(Collections.min(dicesList));
            finalResult.add(dicesList.stream().reduce(0, Integer::sum));
        }
        return finalResult;
    }

/*    private static void writeToFile(Object... ints) {
        Path path = Paths.get("chars.txt");
        try {
            Files.write(path, Arrays.toString(ints).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
