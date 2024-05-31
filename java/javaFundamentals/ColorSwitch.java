import java.util.Scanner;

public class ColorSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter below any code to see thier color name");
        System.out.println("R,B,G,O,Y,W");
        String color = s.nextLine();

        switch (color) {
            case "R":
                System.out.println("R -> Red");
                break;
            case "B":
                System.out.println("B -> Blue");
                break;                
            case "G":
                System.out.println("G -> Green");
                break;
            case "O":
                System.out.println("O -> Orange");
                break;
            case "Y":
                System.out.println("Y -> Yellow");
                break;
            case "W":
                System.out.println("W -> White");
                break;
            default:
                System.out.println("Enter code in above list only");
                break;
        }
        s.close();
    }
}
