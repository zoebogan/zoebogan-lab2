import java.util.*;
import java.util.Random;

public class TypeA extends Thing {
    protected Random rand = new Random(System.currentTimeMillis());

    public TypeA (int row, int col) {
        super(row, col, 'r'); 
    }

    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn();
        } 
        if (i == 2) {
            leftTurn();
        }
    }
}
