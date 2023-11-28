package dnd.properties;

public abstract class Properties {
    protected static boolean between(int value, int minBorder, int maxBorder) {
        return value >= minBorder && value <= maxBorder;
    }
}
