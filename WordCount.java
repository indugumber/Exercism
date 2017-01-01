import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class WordCount {

  public Map<String, Integer> phrase(String word) {
    Map<String, Integer> putWords = new HashMap<String, Integer>();
    int lastIndexOfWord = 0;
    int startingIndexOfWord = 0;
    for (int traverse =0;traverse<=word.lastIndexOf(' ') ;) {
      lastIndexOfWord = word.indexOf(' ', startingIndexOfWord);
      String wordToBeAdded = (word.substring(startingIndexOfWord, lastIndexOfWord));
      putWords.put(wordToBeAdded, 1);
      startingIndexOfWord = lastIndexOfWord + 1;
      traverse = startingIndexOfWord;
    }
    String lastWord =word.substring(word.lastIndexOf(' ')+1);
    putWords.put(lastWord,1);
    return putWords;

  }
}
