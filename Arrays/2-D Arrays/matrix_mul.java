import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int col = sc.nextInt();

        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int result[][] = new int[row][col];

        System.out.println("Enter the element in matrix 1: ");
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element in matrix 2: ");
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                result[i][j] =0;
                for(int k = 0;k<result.length;k++){
                    result[i][j]= matrix1[i][k]*matrix2[k][j];
                }
                System.out.println("Multiplication: "+result[i][j]);
            }
        }
        sc.close();
    }
}
