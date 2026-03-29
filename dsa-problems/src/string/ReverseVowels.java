package string;

class ReverseVowels {

    public static void main(String[] args) {

        System.out.println(reverseVowels("IceCreAm"));
    }
    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            
            // move left pointer
            while (l < r && !isVowel(arr[l])) {
                l++;
            }
            
            // move right pointer
            while (l < r && !isVowel(arr[r])) {
                r--;
            }
            
            // swap vowels
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            l++;
            r--;
        }
        
        return new String(arr);
    }
    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
}