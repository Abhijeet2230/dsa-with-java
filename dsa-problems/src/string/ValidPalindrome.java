package string;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        int start = 0;
        int end = sb.length()-1;
        while(start<end){
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
