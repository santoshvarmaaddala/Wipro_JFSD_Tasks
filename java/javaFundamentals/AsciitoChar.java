import java.util.Scanner;


public class AsciitoChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        for (int i : arr) {
            System.out.println((char)i);
        }
        
        s.close();
    }
}