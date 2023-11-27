package dnd;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/*        File sortedFile = new File("sorted_table.txt");
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
        }*/
        File sortedFile = new File("ul_li_sorted.txt");
        if (sortedFile.exists()) sortedFile.delete();
        try (BufferedReader br = new BufferedReader(new FileReader("ul_li.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
            Map<String, List<String>> uls = new HashMap<>();
            String string;
            while ((string = br.readLine()) != null) {
                List<String> list = Arrays.stream(string.split("\\\\t")).toList();
                uls.put(list.get(0), list.subList(1, list.size()));
            }
            for (String ul : uls.keySet().stream().sorted().toList()) {
                bw.write(ul);
                for (String line : uls.get(ul)) {
                    bw.newLine();
                    bw.write("\t" + line);
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}