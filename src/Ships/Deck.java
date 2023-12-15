package Ships;
import java.util.*;
public class Deck {
    private int level;
    private boolean isSuperStructure;
    private List<shipSystem> systemList;
    private int length;
    private int width;
    private int height;
    private int armor;
    private final int DEFAULT_ARMOR = 0;
    public Deck(int length, int width, int height, int level){
        this.isSuperStructure = false;
        this.length = length;
        this.width = width;
        this.height = height;
        this.level = level;
        this.armor = DEFAULT_ARMOR;
    }
    public Deck(int length, int width, int height, int level, int armor){
        this.isSuperStructure = false;
        this.length = length;
        this.width = width;
        this.height = height;
        this.level = level;
        this.armor = armor;
    }

}
