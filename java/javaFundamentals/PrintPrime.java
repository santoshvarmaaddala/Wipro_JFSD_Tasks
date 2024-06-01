import java.util.Scanner;

public class PrintPrime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = s.nextInt();
        System.out.print("Enter ending number: ");
        int end = s.nextInt();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        s.close();
        
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}