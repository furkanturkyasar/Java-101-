import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int check=0,x;

        System.out.print("Bir sayi giriniz: ");
        x=input.nextInt();

        for(int i=1;i<x;i++){
            if(x%i==0){
                check+=i;
            }
        }
        if(x==check){
            System.out.println(x+" mukemmel bir sayidir");
        }else{
            System.out.println(x+" mukemmel sayi degildir");
        }
        
    }
    
}
