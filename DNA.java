import java.util.HashMap;
import java.util.Map;

public class DNA {

  private String dnaString;
  private String requiredDna = "ACGT";

  DNA(String str){
    dnaString = str;
  }

   int count(char needle){
    int count = 0;
    if (requiredDna.indexOf(needle) < 0) {
      throw new IllegalArgumentException();
    }

    for (char c : dnaString.toCharArray()) {
      if (c == needle) {
        count++;
      }
    }
    return count;
  }

   Map<Character, Integer> nucleotideCounts(){
    Map<Character, Integer> dnaMap = new HashMap<Character, Integer>();

    dnaMap.put('A', count('A'));
    dnaMap.put('C', count('C'));
    dnaMap.put('G', count('G'));
    dnaMap.put('T', count('T'));

    return dnaMap;
  }
}
