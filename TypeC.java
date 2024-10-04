import java.util.*;
import java.util.Random;

public class TypeC extends Thing {
    protected Random rand = new Random(System.currentTimeMillis());
    private int threeStep;

    public TypeC(int row, int col) {
        super(row, col, 'm'); 
        threeStep = 0;
    }

    public void maybeTurn(Random rand) {
        step();
        threeStep++;
        rightTurn();

        if (threeStep == 3) {
            rightTurn();
            step();
            threeStep = 0;
        }
    }
}
