import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();
        String str = String.valueOf(num);
        int total=0,i;
        for (i=0;i<str.length();i++){
            total = total + (str.charAt(i)-'0');
        }
        System.out.println(total);
        s.close();
        }
}
