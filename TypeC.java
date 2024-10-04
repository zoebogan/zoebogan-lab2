import java.util.*;
import java.util.Random;

public class TypeC extends Thing {
    protected Random rand = new Random(System.currentTimeMillis());
    private int timeSinceLast;

    public TypeC(int row, int col) {
        super(row, col, 'm'); 
        timeSinceLast = 0;
    }
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 5) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            } 
            if (i == 4) {
                leftTurn();
            }
            if (i == 4) {
                rightTurn();
            }
        }
    }
}
