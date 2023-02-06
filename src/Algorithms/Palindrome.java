package Algorithms;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ded";
        String str2 = "HelloH";
        String str3 = "qwertyuioppoiuytrewq";
        System.out.println(isPalindrome(str3));

        //
        String strRevers = new StringBuilder(str2).reverse().toString();
        System.out.println(str2.equals(strRevers));

    }

    public static boolean isPalindrome(String text) {
        int n = 0;
        int m = text.length() - 1;

        while (n<m) {
            if (text.charAt(n) != text.charAt(m)){
                return false;
            }
            n++;
            m--;
        }
        return true;
    }
}
