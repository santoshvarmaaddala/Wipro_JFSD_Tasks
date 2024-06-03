public class ArrMinMax {
    public static void main(String[] args) {
        int[] nums = {3,4,1,77,5};
        int min = nums[0], max = nums[0];
        for (int i : nums) {
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
       
        }
        System.out.println(min+","+max);
    }
}
