import java.util.*;
import java.util.Random;



public class ThingList {
    public Node head;
    public static Random rand = new Random(System.currentTimeMillis());

  private class Node {
      Thing data;
      Node next;

      Node(Thing data) {
        data = data;
        next = null;
      }
  }
 
  public void addThing(Thing data) {
      
  }

  public void printAll() {
 
  }

  public void moveAll(Random rand) {

}
}