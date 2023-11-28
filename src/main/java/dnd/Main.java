package dnd;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        sortMdList(true);
    }

    public static void sortMdList(boolean sortAll) {
        File sortedFile = new File("ul_li_sorted.txt");
        if (sortedFile.exists()) sortedFile.delete();
        try (BufferedReader br = new BufferedReader(new FileReader("ul_li.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
            Map<String, String> listOfAll = new HashMap<>();
            String ul = "";
            StringBuilder lisBuilder = new StringBuilder();
            String string;
            while ((string = br.readLine()) != null) {
                if (string.split("    ").length == 1) {
                    ul = string;
                    lisBuilder = new StringBuilder();
                } else {
                    String lis = lisBuilder.append(string.split("    ")[1]).append(", ").toString();
                    listOfAll.put(ul, lis);
                }
            }
            if (sortAll) {
                for (String key : listOfAll.keySet().stream().sorted().toList()) {
                    bw.write(key + ": ");
                    bw.newLine();
                    for (String elem :
                            Arrays.stream(listOfAll.get(key).split(", ")).sorted().toList()) {
                        bw.write("\t" + elem);
                        bw.newLine();
                    }
                }
            } else {
                for (String key : listOfAll.keySet().stream().sorted().toList()) {
                    bw.write(key + ": ");
                    bw.newLine();
                    for (String elem :
                            listOfAll.get(key).split(", ")) {
                        bw.write("\t" + elem);
                        bw.newLine();
                    }
                }
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sortMdTable() {
        File sortedFile = new File("sorted_table.txt");
        if (sortedFile.exists()) sortedFile.delete();
        List<Integer> indexes = new ArrayList<>();
        List<String> values = new ArrayList<>();
        Map<Integer, String> sortedTable = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("table.txt")); BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
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