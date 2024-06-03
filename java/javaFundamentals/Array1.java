public class Array1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int Total = 0;
        for (int i : nums) {
            Total += i;
        }
        System.out.println("Sum of elements in array is: "+Total);
        System.out.println("Average of elements is: "+Total/nums.length);
    }
    
}
