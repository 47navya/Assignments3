import java.util.*;

class Dictionary<K extends String, V extends String> {
    private TreeMap<K, V> dictionary = new TreeMap<>();

    public void addWord(K word, V meaning) {
        dictionary.put(word, meaning);
    }

    public void displayDictionary() {
        System.out.println("Dictionary Entries:");
        for (Map.Entry<K, V> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class MultiDictionary {
    public static void main(String[] args) {
        Dictionary<String, String> engToSpanish = new Dictionary<>();
        engToSpanish.addWord("Hello", "Hola");
        engToSpanish.addWord("Thank you", "Gracias");
        engToSpanish.addWord("Goodbye", "Adiós");

        engToSpanish.displayDictionary();
    }
}

