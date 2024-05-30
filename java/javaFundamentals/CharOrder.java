import java.util.Scanner;
public class CharOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Character");
        char ch1 = s.next().charAt(0);
        System.out.println("Enter Second Character");
        char ch2 = s.next().charAt(0);

        if(ch1 > ch2){
            System.out.println(ch2+","+ch1);
        }
        else{
            System.out.println(ch1+","+ch2);
        }
        s.close();
    }
}
