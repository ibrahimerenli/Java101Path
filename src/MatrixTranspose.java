import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int row, col;
        var input = new Scanner(System.in);
        System.out.println("Satır sayısını girin: ");
        row = input.nextInt();
        System.out.println("Sütun sayısını girin: ");
        col = input.nextInt();
        int[][]  matrix = new int[row][col], arr = new int[col][row];
        int i, j;
       
        for (i = 0; i < row; i++){
            System.out.println(i+1 +".satırı giriniz: ");
            for (j = 0; j < col; j++){
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }
        input.close();
        transpose(matrix, arr, row, col);
        getMatrix(arr, row, col);
    
    }

    static void transpose(int matrix[][], int arr[][], int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            for (j = 0; j < row; j++)
                arr[i][j] = matrix[j][i];
    }
    static void getMatrix(int[][] matrix, int row, int col){
        
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++)
                System.out.print(matrix[i][j] + " "); 
            System.out.println();
        }
            
    }
        
}
