class Solution {
    public String frequencySort(String s) {
// 4 v
// 6 g        
        
        Map<Character, Integer> mmap = new HashMap<>();

        // Count occurrences of characters
        for (char k : s.toCharArray()) {
            mmap.put(k, mmap.getOrDefault(k, 0) + 1);
        }

        // Use TreeMap with reverse order comparator for sorting by frequency
        TreeMap<Integer, List<Character>> kmap = new TreeMap<>(java.util.Collections.reverseOrder());

        // Insert entries into TreeMap

        for (Map.Entry<Character, Integer> entry : mmap.entrySet()) {
            char characte = entry.getKey();
            int frequency = entry.getValue();
            
            if (!kmap.containsKey(frequency)) {
                 List<Character> cha = new ArrayList<Character>();
                 cha.add(entry.getKey());  
                kmap.put(frequency, cha);
            }else{
                List<Character> list = kmap.get(frequency);
                list.add(characte);
                kmap.replace(frequency,list);
            }
        }

        StringBuilder res = new StringBuilder();

        // Construct resulting string
        for (Map.Entry<Integer, List<Character>> entry : kmap.entrySet()) {

              List<Character> p = entry.getValue();
                for(char x : p){

                    for (int i = 0; i < entry.getKey(); i++) {
                         res.append(x);
                    }
                }
            
        }

        return res.toString();

    }
}