import java.util.Scanner;

public class equal_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row1: ");
        int row1 = sc.nextInt();
        System.out.println("Enter the size of col1: ");
        int col1= sc.nextInt();
        System.out.println("Enter the size of row2: ");
        int row2 = sc.nextInt();
        System.out.println("Enter the size of col2: ");
        int col2 = sc.nextInt();

        int matrix1[][] = new int[row1][col1];
        int matrix2[][] = new int[row2][col2];
    }
}
