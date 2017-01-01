import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {

  public Map<String, Integer> transform(Map<Integer, List<String>> oldMap) {
    Map<String, Integer> transformedMap = new HashMap<String, Integer>();

    for (Map.Entry<Integer, List<String>> entry : oldMap.entrySet()) {
      Integer value = entry.getKey();

      List<String> lists = entry.getValue();

      for (String character : lists) {
        transformedMap.put(character.toLowerCase(), value);
      }
    }
    return transformedMap;
  }
}
