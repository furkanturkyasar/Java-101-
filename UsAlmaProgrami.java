import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,k,total=1;

        System.out.print("Ussu alinacak sayi: ");
        n=input.nextInt();

        System.out.print("Us olacak sayi: ");
        k=input.nextInt();

        for (int i=1;i<=k;i++){
            total *=n;
        }

        System.out.println("Toplam: "+total);


    }

}
