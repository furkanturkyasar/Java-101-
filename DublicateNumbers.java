import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, -2, 3, 12, -2, 1, 2, 3, 8, -3, -6, 5, 2, 7, 9, 11, 2, 6, 5, 22, 4, 7, 8, 8, 12};

        ArrayList<Integer> copyArray = new ArrayList<>();
        ArrayList<Integer> dublicateArray = new ArrayList<>();

        for (int i : array) {
            if (!copyArray.contains(i)) {
                copyArray.add(i);
            } else {
                if (i % 2 == 0 && !dublicateArray.contains(i)) {
                    dublicateArray.add(i);
                }
            }
        }
        System.out.println("Orginal Array: "+Arrays.toString(array));
        System.out.println("Dublicate and even numbers: "+ dublicateArray);


    }


}
