import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=1,nFact=1,rFact=1,nrFact=1,result;

        System.out.print("N degerini giriniz: ");
        int n = scan.nextInt();


        System.out.print("R degerini giriniz: ");
        int r =scan.nextInt();



        for (i=1;i<=n;i++) {
            nFact*=i;
        }
        for (i=1;i<=r;i++) {
            rFact*=i;
        }
        for (i=1;i<=(n-r);i++) {
            nrFact*=i;
        }

        result = nFact/(rFact*nrFact);
        System.out.println("Result: "+result);



    }

}
