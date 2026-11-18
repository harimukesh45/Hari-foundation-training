import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {
    public static void main(String[] args)
    {
        Queue<String> Linked_List = new LinkedList<>();

        //Insertion
        Linked_List.offer("A");
        Linked_List.offer("B");
        Linked_List.offer("C");
        Linked_List.offer("D");

        System.out.println(Linked_List);

        //Removing element
        System.out.println("Removed Node " + Linked_List.poll());

        System.out.println(Linked_List);
    }
}
