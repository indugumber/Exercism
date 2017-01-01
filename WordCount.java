import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class WordCount {

  public Map<String,Integer> phrase(String word) {
    Map<String,Integer> putWords = new HashMap<String,Integer>();
    putWords.put(word,1);
    return  putWords;

  }
}
