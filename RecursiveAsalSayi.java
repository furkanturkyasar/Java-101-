import java.util.Scanner;

public class Main{

    static int asal(int i, int num){
        if (num==i){
            return 0;
        }else if(num % i ==0){
            return 1;
        }else {
            return asal(i+1, num);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sayiyi giriniz: ");
        int check = input.nextInt();

        if (asal(2, check)==0){
            System.out.print(check+" Asal sayidir");
        }else {
            System.out.print(check+" Asal degildir");
        }





    }




}
