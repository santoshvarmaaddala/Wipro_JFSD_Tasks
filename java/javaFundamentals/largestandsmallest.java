
import java.util.Arrays;
import java.util.Scanner;

public class largestandsmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        n = arr.length;
        if(n < 4){
            System.out.println("It is not possiable to print two maximum and minimum values");
        }else{
            Arrays.sort(arr);
            System.out.println("First Mininmum number is: "+ arr[0]);
            System.out.println("Second Mininmum number is: "+ arr[1]);
            System.out.println("First Maxinmum number is: "+ arr[n-1]);
            System.out.println("Second Maximum number is: "+ arr[n-2]);

        }
        s.close();
    }
}
