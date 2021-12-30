import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n1;
        int n2;
        int ebob=0;
        int ekok=0;


        System.out.print("N1 giriniz: ");
        n1=input.nextInt();

        System.out.print("N2 giriniz: ");
        n2=input.nextInt();

        if (n1<n2){
            int i=n1;
            while (i>=1){
                if (n1%i==0&&n2%i==0){
                    ebob=i;
                    break;
                }else {
                    i--;
                }
            }
        }else {
            int k=n2;

            while (k>=1){
                if (n1%k==0&&n2%k==0){
                    ebob=k;
                    break;
                }else {
                    k--;
                }
            }
        }
        int x=1;

        while (x<=(n1*n2)){

            if (x%n1==0&&x%n2==0){
                ekok=x;
                break;
            }else {
                x++;
            }
        }
        
        System.out.println("Ebob: "+ebob+" Ekok: "+ekok);



    }

}
