import java.util.*;
import java.util.Random;

public class TypeC extends Thing {
    public static Random rand = new Random(System.currentTimeMillis());
    private int timeSinceLast;
    public TypeC(int row, int col) {
        super(row, col, 'k'); 
        timeSinceLast = 0;
    }
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 100) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            } else if (i == 2) {
                leftTurn();
            }
        }
    }
    public String toString() {
    return row + " " + col + " " + lab;
  }
}
