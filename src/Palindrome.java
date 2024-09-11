public class Palindrome {
    public static void main(String[] args) 
    {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s);
            }
            }
        }
    public static String reverseString(String Strings) {
        String ss = "";
            for (int index = Strings.length() - 1; index >= 0; index--) {
            ss = ss + Strings.charAt(index);
    } return ss;
}
    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            return true;
        }   
        return false;
    } 
}

