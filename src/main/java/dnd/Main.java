package dnd;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/text.txt"));
        List<String> list = reader.lines().toList();
        reader.close();
        System.out.println(list.get(new Random().nextInt(list.size())));
    }
}