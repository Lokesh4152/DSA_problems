import java.io.*;
import java.util.*;

class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] matrix) {
        //1. this is the most optimal step to make matrix rows and col zeros.
        // 1.Check and mark the fist row and first col if it has zero mark   it.
        // 2.mark the inner matrix i.e leaving the first row and  first col starting from i =1 and k =1;
        // 3. make all the inner matrix's row and col ans zero based on condition of step2.
        // 4. check the fist row and fist col if they are marked zero and make them zero. 4th step must be done at the end.for any confusion watch striver video.


        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean markRow = false;
        boolean markCol = false;
        //mark row  to checck if it needs to be zeroed 
        for(int i=0; i < rows; i++){
            if(matrix[i][0] == 0){
                markRow = true;
                break;
            }
        }
        for(int k =0; k < cols; k++){
            if(matrix[0][k] == 0){
                markCol = true;
                break;
            }
        }

        // mark inner row and col that needs to be zeroed;
        for(int i=1; i<rows; i++){
            for(int k=1; k<cols; k++){
                if(matrix[i][k] == 0){
                    matrix[i][0] = 0;
                    matrix[0][k] = 0;
                }
            }
        }
        // make all the rows of inner matrix as zero based on marking 

        for(int i=1; i<rows; i++){
            for(int k =1; k<cols; k++){
                if(matrix[i][0] == 0 || matrix[0][k] == 0){
                    matrix[i][k] = 0;
                }
            }
        }
        if(markRow){
            for(int i=0; i<rows; i++){
                matrix[i][0] =0;
            }
        }
        if(markCol){
            for(int k =0; k<cols; k++){
                matrix[0][k] = 0;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                matrix[i][j] = in.nextInt();
            }
        }

        in.close();
        new SetMatrixZeroes().setMatrixZeroes(matrix);

        for(int i = 0 ; i < m ; ++i) {
            for(int j = 0 ; j < n ; ++j) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
