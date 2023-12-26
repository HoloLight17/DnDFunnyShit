package dnd;

import com.fasterxml.jackson.databind.ObjectMapper;
import dnd.DAOs.LSSDAO;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        convert();
    }

    public static void convert() throws IOException {
        ObjectMapper om = new ObjectMapper();
        LSSDAO root = om.readValue(new File("src/main/java/resources/Роше — Long Story Short.json"), LSSDAO.class);
        System.out.println(root.toString());
    }
}