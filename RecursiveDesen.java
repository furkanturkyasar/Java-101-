import java.util.Scanner;

public class Main{

    static void reducer(int n, int temp){
        System.out.print(n+" ");
        if (n==0 || n < 0){
            plus(n + 5, temp);

        }else {
           reducer(n - 5, temp);

        }
    }

    static void plus(int n, int temp){
        System.out.print(n+" ");
        if (n == temp ){
            return;
        }else {
            plus(n + 5, temp);

        }
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayisi: ");
        int n = input.nextInt();
        int temp = n;
        reducer(n,temp);








    }



}
