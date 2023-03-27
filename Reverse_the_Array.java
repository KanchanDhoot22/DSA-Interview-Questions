public class Reverse_the_Array {

    public static void main(String[] args) {
        System.out.println(reverseWord("string"));
    }
    public static String reverseWord(String str)

    {

        String rev="";

        for(int i=str.length()-1;i>=0;i--){

            rev+=str.charAt(i);

        }

        return rev;

    }
}
