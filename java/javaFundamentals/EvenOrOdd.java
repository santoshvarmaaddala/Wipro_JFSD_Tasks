import java.util.Scanner;
class EvenOrOdd{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = s.nextInt();
		if (i%2 == 0){
			System.out.println("Even Number");
		}else{
			System.out.println("Odd Number");
		}
	}
}
	