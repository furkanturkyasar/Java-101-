public class Main{
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};

        System.out.println("Answer: "+ harmonic(list));


    }

    static double harmonic(int[] list){
        double harmonicNumber= 0.0;

        for (int i : list){
            harmonicNumber += (1.0 / i);
        }
        return (list.length/harmonicNumber);
    }




}
