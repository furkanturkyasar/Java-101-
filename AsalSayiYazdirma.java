public class Main {
    public static void main(String[] args) {

        int count=1;

        for(int i=2; i<=100; i++){
            for (int x=2;x<=i; x++){
                if (i%x==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+" ");
                count=1;
            }else {
                count=1;
            }
        }


    }

}
