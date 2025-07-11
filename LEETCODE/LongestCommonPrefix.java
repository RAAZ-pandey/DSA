//My solution

import java.util.Arrays;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    StringBuilder result = new StringBuilder();

    // Sort the array
    Arrays.sort(strs);

    // Get the first and last strings
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length - 1].toCharArray();

    // Start comparing both strings
    for (int i = 0; i < first.length; i++) {
      if (first[i] != last[i])
        break;
      result.append(first[i]);
    }

    return result.toString();

      // if (strs == null || strs.length == 0) return "";

      //   String prefix = strs[0];
      //   for (int i = 1; i < strs.length; i++) {
      //       while (strs[i].indexOf(prefix) != 0) {
      //           prefix = prefix.substring(0, prefix.length() - 1);
      //           if (prefix.isEmpty()) return "";
      //       }
      //   }
      //   return prefix;
  }

}