import java.util.HashSet;
import java.util.Set;

public class distincteleinarr {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        int[] arr =  {1,2,3,3,4,5,4};
        for (int i : arr) {
            if(!mySet.contains(i)){
                mySet.add(i);
            }
        }
        for (int i : mySet) {
            System.out.println(i);
        }
    }
}
