import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scan = new Scanner(System.in);
        Arrays.sort(list);

        System.out.println("Liste: " + Arrays.toString(list));
        System.out.print("Girilen sayi: ");
        int x = scan.nextInt();

        int min = list[0];
        int max = list[7];

        for (int i : list){
            if (i < x){
                min = i;
            }
        }


        for (int a : list){
            if (a > x){
                max = a;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi: "+min);
        System.out.println("Girilen sayidan buyuk en yakin sayi: "+max);


    }


}
