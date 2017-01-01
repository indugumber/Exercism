import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

  public boolean isAlphaNumeric(String s){
    String pattern= "^[a-zA-Z!^&@$%0-9,]*$";
    return s.matches(pattern);
  }


  private String extractWord(int startingIndexOfWord, int lastIndexOfWord, String word){
    String wordToBeAdded ="";
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
    int countSpaces =0;
    countSpaces = getCountSpaces(word, countSpaces);
    int i=0;
    while (i<=countSpaces) {

        String wordToBeAdded = extractWord(startingIndexOfWord, lastIndexOfWord,word);
        System.out.print( "words  " + wordToBeAdded);
      boolean validWord =isAlphaNumeric(wordToBeAdded);

if(validWord) {
  if (putWords.containsKey(wordToBeAdded)) {
    // System.out.println("value of " + wordToBeAdded + putWords.get(wordToBeAdded));
    putWords.put(wordToBeAdded, putWords.get(wordToBeAdded) + 1);
  } else {
    //  System.out.println("value of " + wordToBeAdded + putWords.get(wordToBeAdded));
    putWords.put(wordToBeAdded, 1);
  }
}
            startingIndexOfWord += wordToBeAdded.length()+1; //lastIndexOfWord + 1;

      i++;
    }

    return putWords;

  }

  private int getCountSpaces(String word, int countSpaces) {
    for (int i=0;i<word.length();i++)
      if(word.charAt(i)==' ')
        countSpaces++;
    return countSpaces;
  }
}
