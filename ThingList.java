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
      Node insertNode = new Node(data);
      if (head == null) {
          head = insertNode;
      } else {
          Node index = head;
          while (index.next != null) {
              index = index.next;
          }
          index.next = insertNode; 
          insertNode.next = null;
      }
  }

  public void printAll() {
    for (Node index = head; index != null; index = index.next) {
        System.out.println(index.data);
    }
    System.out.println("done");
    System.out.flush();
  }
  
  public void moveAll(Random rand) {
    for (Node index = head; index != null; index = index.next) {
        index.data.maybeTurn(rand);
        index.data.step();
    }
  }
}