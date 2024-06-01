import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<= Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == false){
            System.out.println("Number is not Prime");
        }else{
            System.out.println("Number is Prime");
        }

        s.close();
    }
}
