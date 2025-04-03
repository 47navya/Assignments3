import java.util.*;

public class University {
    public static void main(String[] args) {
        
        LinkedList<String> students = new LinkedList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");


        System.out.println("Enrolled Students:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("\nReverse Order:");
        ListIterator<String> listIterator = students.listIterator(students.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
 
 

