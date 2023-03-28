import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc" , "baa"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[]arr1=s.toCharArray();
        char[]arr2=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);

        if(sortedstr1.equals(sortedstr2)) {
            return true;
        } else {
            return false;
        }
    }
}
