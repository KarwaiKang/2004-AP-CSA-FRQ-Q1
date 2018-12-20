import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public WordList(ArrayList<String> myList) {
        this.myList = myList;
    }

    /**
     * @param len the length of the words to count
     * @return the number of words in this {@code WordList}that
     * are exactly {@code len} letters long
     */
    public int numWordsOfLength(int len) {
        int words = 0;
        for (String s : myList) {
            if (s.length() == len)
                words++;
        }
        return words;
    }

    /**
     * postcondition: all words that are exactly {@code len} letters long
     *                 have been removed from this {@code WordList}, with the
     *                 order of the remaining words unchanged
     * @param len the length of the words to remove
     */
    public void removeWordsOfLength(int len) {
        for (int i = myList.size() - 1; i > -1; i--) {
            if (myList.get(i).length() == len)
                myList.remove(i);
        }
    }

    public ArrayList<String> getMyList() {
        return myList;
    }
}
