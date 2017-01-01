import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

  private boolean isAlphaNumeric(String s) {
    String pattern = "^[a-zA-Z!^&@$%0-9,]*$";
    return s.matches(pattern);
  }

  private boolean isAlpha(String s) {
    String pattern = "^[a-zA-Z0-9]*$";
    return s.matches(pattern);
  }


  private String validWord(String s) {
    String wordToBePrinted = "";
    for (int i = 0; i < s.length(); i++) {
      if (i + 1 <= s.length() && isAlpha(s.substring(i, i + 1)))
        wordToBePrinted += s.charAt(i);
    }
    return wordToBePrinted;

  }

  private String extractWord(int startingIndexOfWord, int lastIndexOfWord, String word) {
    String wordToBeAdded = "";
    if (startingIndexOfWord > word.lastIndexOf(' ')) {
      wordToBeAdded = (word.substring(startingIndexOfWord));
      System.out.println(wordToBeAdded + " last word  ");
    } else {
      lastIndexOfWord = word.indexOf(' ', startingIndexOfWord);
      System.out.println(wordToBeAdded + " ");
      wordToBeAdded = (word.substring(startingIndexOfWord, lastIndexOfWord));
    }
    return wordToBeAdded;
  }

  public Map<String, Integer> phrase(String word) {
    Map<String, Integer> putWords = new HashMap<String, Integer>();
    int lastIndexOfWord = 0;
    int startingIndexOfWord = 0;
    int countSpaces = 0;
    countSpaces = getCountSpaces(word, countSpaces);
    int numberOfAddition = 0;
    while (numberOfAddition <= countSpaces) {
      String wordToBeAdded = extractWord(startingIndexOfWord, lastIndexOfWord, word);
      boolean validWord = isAlphaNumeric(wordToBeAdded);
      addingWordToMap(putWords, wordToBeAdded, validWord);
      startingIndexOfWord += wordToBeAdded.length() + 1;
      numberOfAddition++;
    }
    return putWords;

  }

  private void addingWordToMap(Map<String, Integer> putWords, String wordToBeAdded, boolean validWord) {
    if (validWord) {
      String validWordToBeAdded = validWord(wordToBeAdded).toLowerCase();

      if (putWords.containsKey(validWordToBeAdded)) {
        putWords.put(validWordToBeAdded, putWords.get(validWordToBeAdded) + 1);
      } else {
        putWords.put(validWordToBeAdded, 1);
      }
    }
  }

  private int getCountSpaces(String word, int countSpaces) {
    for (int i = 0; i < word.length(); i++)
      if (word.charAt(i) == ' ')
        countSpaces++;
    return countSpaces;
  }
}
