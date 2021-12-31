import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Basamak sayisi giriniz: ");
        n=input.nextInt();

        for(int x=1;x<n;x++){
            for(int y=1;y<=x;y++){
                System.out.print(" ");
            }
            for(int z=1;z<(2*n)-(2*x);z++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
