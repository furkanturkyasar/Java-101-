import java.util.Scanner;

public class HelloWorld {

    static int sum(int a, int b){
        int result = a + b;
        System.out.print(result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.print(result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.print(result);
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        System.out.print(result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for(int i=1; i <= b ;i++){
            result *= a;
        }
        System.out.print(result);
        return result;
    }

    static int fact(int n){
        int result = 1;

        for(int i=1; i <= n ; i++){
            result *= i;
        }
        System.out.print(result);
        return result;

    }

    static int mod(int a, int b){
        int result = a % b;

        System.out.print(result);
        return result;
    }

    static void calc(int a, int b){
        System.out.println("Cevresi: "+(2*(a + b)));
        System.out.print("Alani: "+(a * b)); 
    }



    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1-Toplama islemi\n"
        +"2-Cikarma islemi\n"
        +"3-Carpma islemi\n"
        +"4-Bolme islemi\n"
        +"5-Uslu sayi bulma\n"
        +"6-Faktoriyel hesaplama\n"
        +"7-Mod Alma\n"
        +"8-Diktorgen alan ve cevre bulma\n"
        +"0-Cikis Yap";
        
        System.out.println(menu);
        
        while(true){
            select = input.nextInt();
            
            int a, b;
             
            if(select == 1){
                System.out.print("Ilk sayiyi giriniz:  ");
            a = input.nextInt();

            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();
                sum(a, b);

            }else if(select == 2){
                System.out.print("Ilk sayiyi giriniz:  ");
            a = input.nextInt();

            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();
                minus(a, b);

            }else if(select == 3){
                System.out.print("Ilk sayiyi giriniz:  ");
            a = input.nextInt();

            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();
                times(a, b);

            }else if(select == 4){
                System.out.print("Ilk sayiyi giriniz:  ");
            a = input.nextInt();

            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();
                if(b != 0 ){
                    divided(a, b);
                }else{
                    System.out.print("0'dan farkli bir rakama bolunuz!");
                }
                
            }else if(select == 5){
                System.out.print("Ilk sayiyi giriniz:  ");
            a = input.nextInt();

            System.out.print("Ikinci sayiyi giriniz: ");
            b = input.nextInt();
                power(a, b);

            }else if(select == 6){
                System.out.println("N sayisi giriniz: ");
                int n = input.nextInt();
                fact(n);
            }else if(select == 7){
                System.out.print("Ilk sayiyi giriniz:  ");
                a = input.nextInt();

                System.out.print("Ikinci sayiyi giriniz: ");
                b = input.nextInt();

                mod(a, b);
            }else if(select == 8){
                System.out.print("Ilk sayiyi giriniz:  ");
                a = input.nextInt();

                System.out.print("Ikinci sayiyi giriniz: ");
                b = input.nextInt();
                
                calc(a, b);
            }else if(select==0){
                System.out.print("Program sonlaniyor...");
                break;
            }else{
                System.out.print("Yanlis deger girdiniz!");
                break;
            }



        }

        
        
        
        
    }

   

}
