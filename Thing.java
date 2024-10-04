import java.util.*;
import java.util.Random;

abstract class Thing {
  // dir: 0=North, 1=East, 2=South, 3=West.
  // timeSinceLast: this is only important for "TypeB" Things.
  protected int  row;
  protected int col;
  protected int dir;
  protected int timeSinceLast;
  protected char lab;
  protected boolean isTypeB;

  //public static Random rand = new Random(System.currentTimeMillis());
  public abstract void maybeTurn(Random rand);
  
  public Thing(int row, int col, char lab) {
    row = row;
    col = col;
    lab = 'r';
  }

  public void rightTurn() {
    dir = (dir + 1) % 4;
  }

  public void leftTurn() {
    dir = (dir + 3) % 4;
  }
 
  public void step() {
    final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
    row += dr[dir];
    col += dc[dir];
  }

  public String toString() {
    return row + " " + col + " " + lab;
  }
}
