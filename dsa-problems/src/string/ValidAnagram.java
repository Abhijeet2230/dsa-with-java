package string;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagrama"));

    }

    public static boolean isAnagram(String s, String t) {
            int[] ch = new int[26];

            if(s.length()!=t.length()){
                return false;
            }

            for(int i = 0;i<s.length();i++){
                ch[s.charAt(i) - 'a']++;
                ch[t.charAt(i) - 'a']--;
            }

            for(int ele : ch){
                if(ele!=0){
                    return false;
                }
            }

            return true;
        }

}
