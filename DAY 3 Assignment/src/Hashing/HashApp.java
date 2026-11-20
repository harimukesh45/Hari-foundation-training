package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashApp {
    private static String[][] library = new String[100][100];
    static int numShelf = 100;
    static int numLocPerShelf = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book(1, "The Avengers");
        Book b2 = new Book(2, "Spider-Man: The Darkest Hours");
        Book b3 = new Book(3, "Batman: The Killing Joke");
        Book b4 = new Book(4, "The Hunger Games");
        b1.address = hashAddress(b1);
        b2.address = hashAddress(b2);
        b3.address = hashAddress(b3);
        b4.address = hashAddress(b4);

        Map<Integer, Book> mp= new HashMap<>();
        mp.put(b1.id, b1);
        mp.put(b2.id, b2);
        mp.put(b3.id, b3);
        mp.put(b4.id, b4);

        System.out.println("********Book Search*********");
        System.out.println("Enter the id of the book you want");
        int id = sc.nextInt();
        Book book = mp.get(id);
        System.out.println(book);
    }

    private static String hashAddress(Book b) {
        int shelfNo = (b.id % numShelf);
        for(int loc=0; loc<numLocPerShelf ; loc++){
            if( library[shelfNo][loc] == null ){
                library[shelfNo][loc] = "Book: " + b.id;
                return b.id + "#" + "S" + (shelfNo+1) + "#" + "L" + (loc+1);
            }
        }
        return null;
    }
}