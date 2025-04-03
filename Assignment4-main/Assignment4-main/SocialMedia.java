  
import java.util.*;

public class SocialMedia{
    public static void main(String[] args) {
        
        HashSet<String> followers = new HashSet<>();
        followers.add("Alice");
        followers.add("Bob");
        followers.add("Charlie");
        followers.add("Alice"); 
        System.out.println("Unique Followers:");
        for (String follower : followers) {
            System.out.println(follower);
        }

       
        TreeSet<String> sortedFollowers = new TreeSet<>(followers);

        
        System.out.println("\nSorted Followers:");
        for (String follower : sortedFollowers) {
            System.out.println(follower);
        }
    }
}

