import java.util.Scanner;

class PosOrNeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = s.nextInt();
        if (i == 0) {
            System.out.println("Zero");
        } else if (i > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        s.close();
    }
}
			 