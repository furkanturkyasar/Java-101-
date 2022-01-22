import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisi giriniz: ");
        int n = input.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            array[i] = input.nextInt();

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }


}
