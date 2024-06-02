import java.util.Scanner;

public class FloydsFormat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        for(int i = 0;i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        s.close();
    }
}
