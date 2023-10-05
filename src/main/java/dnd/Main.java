package dnd;

public class Main {
    public static void main(String[] args) {
        Characteristics.generate();
        System.out.println(HitPoints.generate(16, 6));
    }
}