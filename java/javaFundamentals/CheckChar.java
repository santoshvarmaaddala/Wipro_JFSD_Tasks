import java.util.Scanner;

public class CheckChar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = s.next().charAt(0);
        
        if(Character.isAlphabetic(ch)){
            System.out.println(ch+" is a alphabet");
        }else if(Character.isDigit(ch)){
            System.out.println(ch+" is a number");
        }else{
            System.out.println(ch+" is a special character");
        }
        s.close();
    }

}