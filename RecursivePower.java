import java.util.Scanner;

public class HelloWorld{

    static int power(int a, int b){
        int result = 1;

        for (int i=1; i <= b ; i++ ) {
            result *= a;
        }
        System.out.println("Sonuc: "+result);
        return result;
    }


  
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        while(true){
            String menu = "0-Cikmak icin\n"
            +"1-Us alma islemi\n";

            System.out.print(menu);

            int select;

            select = input.nextInt();

            if (select==0) {
                System.out.print("Programdan cikiliyor...");
                break;
            }else if(select==1){
                System.out.print("Taban degeri giriniz: ");
                a = input.nextInt();

                System.out.print("Us degerini giriniz: ");
                b = input.nextInt();
                power(a, b);
            }else{
                System.out.print("Yanlis deger girdiniz!");
                break;
            }


        }

        

        





        
    }
   
}
