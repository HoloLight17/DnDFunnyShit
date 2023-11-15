package dnd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Characteristics.generate());
//        System.out.println(HitPoints.generate(7, 8));
//        System.out.println(HitPoints.randomizeHPOnce(8, 2));
        File sortedFile = new File("sorted_table.txt");
        if (sortedFile.exists()) {
            sortedFile.delete();
        }
        List<Integer> indexes = new ArrayList<>();
        List<String> values = new ArrayList<>();
        Map<Integer, String> sortedTable = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("table.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] splitLine = line.split("\\|");
                indexes.add(Integer.valueOf(splitLine[1]));
                values.add(splitLine[2]);
            }
            values = values.stream().sorted().toList();
            for (int i = 0; i < indexes.size(); ) {
                sortedTable.put(indexes.get(i), values.get(i));
                i++;
            }
            for (Integer index : sortedTable.keySet()) {
                bw.append("|").append(String.valueOf(index)).append("|").append(sortedTable.get(index)).append("|");
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}