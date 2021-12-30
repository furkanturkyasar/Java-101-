import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName,password;
        int right=3;
        int select;
        int price;
        int total=1500;
        boolean processing=true;

        while (right>0){
            System.out.print("Kullanici adinizi giriniz: ");
            userName=input.nextLine();

            System.out.print("Sifrenizi giriniz: ");
            password=input.nextLine();
            if (userName.equals("patika")&&password.equals("java101")){

                while (processing){
                    System.out.println("Kodluyoruz bankasina hos geldiniz! ");
                    System.out.println("1-Para Yatirma\n"+"2-Para Cekme\n"+"3-Bakiye Sorgulama\n"+"4-Cikis Yap!");
                    select=input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Yatirmak istediginiz miktari giriniz: ");
                            price=input.nextInt();
                            total+=price;
                            break;

                        case 2:
                            System.out.println("Cekmek istediginiz miktari giriniz: ");
                            price=input.nextInt();
                            if (price>total){
                                System.out.println("Bakiyenizde o kadar para yok! ");
                            }else {
                                total-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+total);
                            break;
                        case 4:
                            System.out.println("Sistemden cikiliyor! ");
                            processing=false;
                            right=0;
                            break;
                        default:
                            System.out.println("Lutfen tekrar deneyiniz: ");
                            break;
                    }

                }



            }else {
                right--;
                if (right==0){
                    System.out.print("Hesabiniz bloke olmustur! ");
                    processing=false;
                }else {
                    System.out.println("Yanlis sifre ya da kullanici adi girdiniz! ");
                    System.out.println("Kalan hakkiniz: "+right);
                }


            }


        }


    }

}
