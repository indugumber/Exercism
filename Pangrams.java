import java.util.Arrays;
import java.lang.String;

public class Pangrams {

  public static boolean isPangram(String s) {
    if (s.equals(" "))
      return false;
    int checkAlphabet[] = new int[26];
    s.toLowerCase();
    System.out.print(s);
    for (int i = 0; i < s.length(); i++) {
      if (lowerCaseAlphabet(s, i) || upperCaseAlphabet(s, i))
        if (upperCaseAlphabet(s, i))
          checkAlphabet[s.charAt(i) - 'A']++;
        else
          checkAlphabet[s.charAt(i) - 'a']++;
    }
    Arrays.sort(checkAlphabet);
    return checkAlphabet[0] != 0;

  }

  private static boolean upperCaseAlphabet(String s, int i) {
    return s.charAt(i) >= 'A' && s.charAt(i) <= 'Z';
  }

  private static boolean lowerCaseAlphabet(String s, int i) {
    return s.charAt(i) >= 'a' && s.charAt(i) <= 'z';
  }
}
