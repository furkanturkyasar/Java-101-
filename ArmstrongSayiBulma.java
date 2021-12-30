import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digitNumber=0,number,valueNumber=0,digitPow,result=0;


        System.out.print("Sayiyi giriniz: ");
        number = input.nextInt();

        int tempNumber=number;

        while (tempNumber!=0){
            tempNumber/=10;
            digitNumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            valueNumber=tempNumber % 10;
            digitPow=1;
            for (int i=1; i<=digitNumber;i++){
                digitPow *=valueNumber;
            }
            result+=digitPow;
            tempNumber/=10;

        }
        if (result==number){
            System.out.println(number+" bir Armstrong sayidir!");
        }else {
            System.out.println(number+" Armstrong sayi degildir!");
        }



    }

}
