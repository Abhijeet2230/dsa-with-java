package string;

import java.util.*;


public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams2(strs));
    }

    //By using the sort
    //Time complexity
    //O(n * k log k)
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    //Without using the sort method
    //Time complexity
    //O(n * k)
    public static List<List<String>> groupAnagrams2(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String key = getKey(s);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }

        return new ArrayList<>(map.values());

    }

    public static String getKey(String strs) {
        int[] freq = new int[26];

        for (char ch : strs.toCharArray()) {
            freq[ch - 'a']++;
        }

        return Arrays.toString(freq);
    }
}

