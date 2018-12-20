import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        WordList animals = new WordList(new ArrayList<>(Arrays.asList("cat", "mouse", "frog", "dog", "dog")));
        System.out.println(animals.getMyList()); // → ["cat", "mouse", "frog", "dog", "dog"]

        System.out.println(animals.numWordsOfLength(4)); // → 1
        System.out.println(animals.numWordsOfLength(3)); // → 3
        System.out.println(animals.numWordsOfLength(2)); // → 0

        animals.removeWordsOfLength(4);
        System.out.println(animals.getMyList()); // → ["cat", "mouse", "dog", "dog"]
        animals.removeWordsOfLength(3);
        System.out.println(animals.getMyList()); // → ["mouse"]
        animals.removeWordsOfLength(2);
        System.out.println(animals.getMyList()); // → ["mouse"]
    }
}
