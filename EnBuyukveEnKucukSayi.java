import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,maxNumber=0,minNumber=0;

        System.out.println("Kac tane sayi gireceksiniz: ");
        n=input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i+". sayiyi giriniz: ");
            int x=input.nextInt();
            if (x==1){
                maxNumber=x;
                minNumber=x;
            }else if (x>maxNumber){
                maxNumber=x;
            }else if(x<minNumber){
                minNumber=x;
            }

        }
        System.out.println(n+" sayi icinden en buyugu: "+maxNumber);
        System.out.println(n+" sayi icinden en kucugu: "+minNumber);

    }

}
