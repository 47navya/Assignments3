import java.util.*;

public class StudentExam {
    public static void main(String[] args) {
        
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 90);
        scores.put("Charlie", 78);
        scores.put("David", 92);

        
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       
        TreeMap<String, Integer> sortedScores = new TreeMap<>(scores);

        
        System.out.println("\nSorted Student Scores:");
        for (Map.Entry<String, Integer> entry : sortedScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

