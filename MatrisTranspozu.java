import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloWorld{

   
	 public static void main(String[] args) {

        int[][] matrix1 = {{2, 3, 4},{5, 6, 4}};
        int[][] matrix2 = {{1, 2, 3},{4, 5, 6}};

        System.out.println(Arrays.deepToString(transpose(matrix1)));
        System.out.println(Arrays.deepToString(transpose(matrix2)));
    }

    static int[][] transpose(int[][] matrix){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transposedMatrix[j][i] = matrix[i][j]; 
            }
        }

        return transposedMatrix;
    }
    

}
   
