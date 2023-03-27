public class Maximum_and_Minimum_Element_in_an_Array {
    public static void main(String[] args) {
        int[]arr={2 , 5 , 11 , 3 , 4 , 6};
        System.out.println(findSum(arr, 6));
    }
    public static int findSum(int arr[],int N)
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return min+max;
    }
}
