import java.util.*;
import java.io.*;

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int distinct = 0;
        int fincount = 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int freq = map.getOrDefault(s.charAt(i), 0);
            // there was no distinct character earlier and we found a new character for
            // example F
            if (freq == 0) {
                distinct++;
            }
            // we add everythiung in the map
            map.put(s.charAt(i), freq + 1);
            // voilates our requirement that it should be just 2
            while (distinct > 2) {
                // remove the initial element that has pointer from the start from the map
                freq = map.get(s.charAt(start));
                map.put(s.charAt(start), freq - 1);
                // We removed an entire distinct element , therefore decrease the distinct count
                if (freq - 1 == 0) {
                    distinct--;
                }
                start++;
            }
            fincount = Math.max(i - start + 1, fincount);
        }
        return fincount;
    }
}