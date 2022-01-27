import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(100);
        int right = 0;
        boolean isWrong = false;
        boolean isWin = false;
        int[] array = new int[5];
        System.out.println(number);

        while (right < 5) {
            System.out.print("Lutfen bir sayi giriniz: ");
            int selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("0-100 arasi deger giriniz!");
                if (isWrong) {
                    array[right] = selected;
                    right++;
                    System.out.println("Tekrar yanlis islem yaptiniz hakkiniz azalmistir!");
                    System.out.println("Kalan hakiniz: " + (5 - right));
                } else {
                    array[right] = selected;
                    isWrong = true;
                    System.out.println("Bir daha yanlis yaparsaniz hakkiniz gidecektir!");
                }
                continue;
            }
            if (selected == number) {
                isWin = true;
            } else {
                if (selected > number) {
                    array[right] = selected;
                    right++;
                    System.out.println("Daha kucuk bir sayi girerek sansinizi deneyiniz!");
                    System.out.println("Kalan hakkiniz: " + (5 - right));
                }
                if (selected < number) {
                    array[right] = selected;
                    right++;
                    System.out.println("Daha buyuk bir sayi girerek sansinizi deneyiniz!");
                    System.out.println("Kalan hakkiniz: " + (5 - right));
                }
            }
            if (isWin) {
                System.out.println("Tebrikler kazandiniz, sayi: " + number);
                break;
            }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz");
            System.out.println("Tahmin ettiginiz sayilar: " + Arrays.toString(array));
        }
    }
}
