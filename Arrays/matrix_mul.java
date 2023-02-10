import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int matrix[][] = new int[size][size];
        int sum = 0;
        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
    }
}
