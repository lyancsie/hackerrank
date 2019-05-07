package Implementation;

import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

  static int[] matchingStrings(String[] strings, String[] queries) {
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < strings.length; i++) {
      if (!(map.containsKey(strings[i]))) {
        map.put(strings[i], 1);
      } else {
        map.put(strings[i], map.get(strings[i]) + 1);
      }
    }
    int[] occurrences = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      if (map.containsKey(queries[i])) {
        occurrences[i] = map.get(queries[i]);
      } else {
        occurrences[i] = 0;
      }
    }

    return occurrences;
  }
}
