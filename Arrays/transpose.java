import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int matrix[][] = new int[size][size];
        int row = matrix.length;
        int col = matrix[0].length;
        int temp[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                temp[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
System.out.println("Transpose: "+temp[i][j]);
sc.close();
            }
    }
}
}
