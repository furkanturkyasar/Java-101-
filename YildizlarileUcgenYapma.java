import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("N giriniz: ");
        n=input.nextInt();

        for (int i=1;i<=n;i++) {
            for (int a=1;a<=(n-i);a++) {
                System.out.print(" ");
            }
            for (int b=1;b<=(2*i-1);b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int x=1;x<n;x++) {

            for (int y=1;y<=x;y++) {
                System.out.print(" ");
            }
            for (int z=1;z<(2*n)-(2*x);z++) {
                System.out.print("*");
            }
            System.out.println("");
        }






    }

}
