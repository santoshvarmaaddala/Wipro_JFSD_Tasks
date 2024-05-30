import java.util.Scanner;

public class LowOrUp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = s.next().charAt(0);

        if (Character.isLowerCase(ch)){
            System.out.println(ch+" -> "+Character.toUpperCase(ch));
        }else{
            System.out.println(ch+" -> "+Character.toLowerCase(ch));
        }
        s.close();
    }
}
