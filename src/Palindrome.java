public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isThatPalindrome("sedes"));
        System.out.println(isThatPalindrome("twoj"));
        System.out.println(isThatPalindrome("aha"));
        System.out.println(isThatPalindrome("lukaszzsakul"));

    }

    static boolean isThatPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++)
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        return true;
    }

}
