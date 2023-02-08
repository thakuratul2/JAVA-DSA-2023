import java.util.Scanner;

public class rotate_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        int temp=0;
        System.out.println("Enter the element: ");
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }
        //tranpose
        for(int i =0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length/2;j++){
                temp = matrix[i][j];
                matrix[i][j]= matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Rotate Matrix: "+matrix[i][j]);
            }
        }
        sc.close();
    }
}
