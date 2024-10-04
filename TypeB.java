import java.util.*;
import java.util.Random;
/*A TypeB Thing
   * only considers making a random turn every 10th round.
*/
public class TypeB extends Thing {
    protected Random rand = new Random(System.currentTimeMillis());
    private int timeSinceLast;
    
    public TypeB(int row, int col) {
        super(row, col, 'b'); 
        timeSinceLast = 0;
    }

    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) {
                rightTurn();
            } 
            if (i == 2) {
                leftTurn();
            }
        }
    }
}
