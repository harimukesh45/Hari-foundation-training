import java.util.*;

class Queue_Ticket {
    public static void main(String[] args){
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Harry");
        queue.offer("Frodo");
        queue.offer("Pippin");

        int n= queue.size();

        for(int i=0;i< n;i++)
        {
            System.out.println("Ticket given to:"+queue.poll());
            System.out.println("Remaining size :" + queue.size());
        }
    }
}