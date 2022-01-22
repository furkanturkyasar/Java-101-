import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                count1++;
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                count2++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 20) {
                count3++;
            }
        }


        System.out.println("5 sayisi "+count1+" kere tekrar etti");
        System.out.println("10 sayisi "+count2+" kere tekrar etti");
        System.out.println("20 sayisi "+count3+" kere tekrar etti");


    }


}
