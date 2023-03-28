public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {

        StringBuilder b= new StringBuilder();

        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))|| Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n = b.length()-1;
        for (int i = 0; i<=b.length()/2; i++){

            if (b.charAt(i)!=b.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcc-caba"));
    }
}
