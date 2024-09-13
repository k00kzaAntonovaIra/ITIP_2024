public class Palindrome {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " true");
            } else {
                System.out.println(s + " false");
            }
        }
    }

    public static String reverseString(String s) {
        StringBuilder a = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            a.append(s.charAt(i));
        }
        return a.toString();
    }

    public static boolean isPalindrome(String s){
        return (reverseString(s)).equals(s);
    }
}
