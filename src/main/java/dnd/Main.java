package dnd;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        sortMdList(false);
        sortMdTable();
    }

    public static void sortMdList(boolean sortAll) {
        File sortedFile = new File("src/main/resources/ul_li_sorted.md");
        if (sortedFile.exists()) sortedFile.delete();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/ul_li.md"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
            Map<String, String> listOfAll = new HashMap<>();
            String ul = "";
            StringBuilder lisBuilder = new StringBuilder();
            String string;
            while ((string = br.readLine()) != null) {
                if (string.split("  ").length == 1) {
                    ul = string;
                    lisBuilder = new StringBuilder();
                    listOfAll.put(ul, "");
                } else {
                    String lis = lisBuilder.append(string.split("  ")[1]).append(", ").toString();
                    listOfAll.put(ul, lis);
                }
            }
            if (sortAll) {
                for (String key : listOfAll.keySet().stream().sorted().toList()) {
                    if (!listOfAll.get(key).isEmpty()) {
                        bw.write(key);
                        bw.newLine();
                        for (String elem :
                                Arrays.stream(listOfAll.get(key).split(", ")).sorted().toList()) {
                            bw.write("\t" + elem);
                            bw.newLine();
                        }
                    } else {
                        bw.write(key);
                        bw.newLine();
                    }
                }
            } else {
                for (String key : listOfAll.keySet().stream().sorted().toList()) {
                    if (!listOfAll.get(key).isEmpty()) {
                        bw.write(key);
                        bw.newLine();
                        for (String elem :
                                listOfAll.get(key).split(", ")) {
                            bw.write("\t" + elem);
                            bw.newLine();
                        }
                    } else {
                        bw.write(key);
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
        File sortedFile = new File("src/main/resources/sorted_table.md");
        if (sortedFile.exists()) sortedFile.delete();
        List<Integer> indexes = new ArrayList<>();
        List<String> values = new ArrayList<>();
        Map<Integer, String> sortedTable = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/tables.md")); BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile, true))) {
            bw.write(br.readLine());
            bw.newLine();
            bw.write(br.readLine());
            bw.newLine();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] splitLine = line.split("\\|");
                indexes.add(Integer.valueOf(splitLine[1].trim()));
                values.add(splitLine[2].trim());
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