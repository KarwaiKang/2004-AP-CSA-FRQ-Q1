import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("cat");
        arrList.add("mouse");
        arrList.add("frog");
        arrList.add("dog");
        arrList.add("dog");
        WordList animals = new WordList(arrList);

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
    }
}
