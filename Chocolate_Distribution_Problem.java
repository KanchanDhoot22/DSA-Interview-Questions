import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Distribution_Problem {

    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        if(m==0 || n==0){
            return 0;
        }

        // if (n>m){
        //     return -1;
        // }
        Collections.sort(a);
        long min = Integer.MAX_VALUE;

        for(int i=0; i+m-1<n; i++){
            int diff = a.get(i+m-1)-a.get(i);
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
}
