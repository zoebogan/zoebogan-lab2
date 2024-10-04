import java.util.*;
import java.util.Random;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());
 
  public int  row, col, dir, timeSinceLast;
  public char lab;
  public boolean isTypeB;

  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {
          list.addThing(new TypeA(45, 50));
          list.addThing(new TypeB(55, 50));
          list.addThing(new TypeC(65, 50));
      }

      list.printAll();
      list.moveAll(rand);
      count++;  

    }
  }
}
