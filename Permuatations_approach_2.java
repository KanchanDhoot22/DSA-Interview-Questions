import java.util.ArrayList;
import java.util.List;

// less space complexity
public class Permuatations_approach_2 {
    public static void main(String[] args) {
        int[]nums={3 , 4 ,5};
        System.out.println(permute(nums));
    }
    public static List<List<Integer>> permute(int[]nums){
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums , ans);
        return ans;
    }

    private static void recurPermute(int index , int[]nums , List<List<Integer>>ans){
        if(index==nums.length){
            List<Integer>ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<nums.length; i++){
            swap(i,index,nums);
            recurPermute(index+1 , nums , ans);
            swap(i,index,nums);
        }
    }

    private static void swap(int i , int j , int []nums){
        int t= nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
