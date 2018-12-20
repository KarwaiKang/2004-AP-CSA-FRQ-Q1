import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public WordList(ArrayList<String> myList) {
        this.myList = myList;
    }

    public int numWordsOfLength(int len) {
        int words = 0;
        for (String s : myList) {
            if (s.length() == len)
                words++;
        }
        return words;
    }

    public void removeWordsOfLength(int len) {
        for (int i = myList.size() - 1; i > -1; i--) {
            if (myList.get(i).length() == len)
                myList.remove(i);
        }
    }
}
