import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,n1,n2,n3;
        int fib;

        System.out.print("N sayisi giriniz: ");
        n= input.nextInt();

        n1=0;
        n2=1;


        System.out.print(n1+" "+n2);

        for (int i=2; i<=n; i++){
            n3=(n1)+(n2);
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            System.out.print("");


        }
    }

}
