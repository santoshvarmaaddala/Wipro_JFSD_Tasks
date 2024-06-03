import java.util.Scanner;

public class Arrtraversal {
    public static void main(String[] args) {
            int[] arr = {1,4,34,56,7};
            Scanner s = new Scanner(System.in);
            int find = s.nextInt();
            int found = -1;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == find){
                    found = i;
                    break;
                }
            }
            if(found == -1){
                System.out.println("Element Not Found: "+ -1);
            }else{
                System.out.println("Element Found at index: "+ found);
            }
            s.close();
    }
}
