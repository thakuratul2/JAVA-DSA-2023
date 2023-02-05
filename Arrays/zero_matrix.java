import java.util.Scanner;

public class zero_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int m = sc.nextInt(); //matrix[0].length

        int matrix[][] = new int[n][m];
        boolean row = false,col=false;

        int i,j;
        System.out.println("Enter the element: ");
        for(i =0;i<n;i++){
            for(j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Stored Element: ");
        for(i =0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
        for(i =0;i<n;i++){
            if(matrix[i][0]==0){
                col=true;
            }
        }
        for(j =0;j<m;j++){
            if(matrix[0][j]==0){
                row=true;
            }
        }
        for(i =1;i<n;i++){
            for(j = 1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(i =1;i<n;i++){
            if(matrix[i][0]==0){
                for(j = 1;j<m;j++){
                    matrix[i][j]=0;
                }
                
            }
        }
        for(j =1;j<m;j++){
            if(matrix[0][j]==0){
                for(i =1;i<m;i++){
                    matrix[i][j]=0;
                }
                
            }
        }
        if(row){
            for( j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col){
            for(i =0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        System.out.println();
        for(i=0;i<n;i++){
            for(j = 0;j<m;j++){
                System.out.println("Matrix Now: "+matrix[i][j]);
            }
        }
        
        sc.close();
    }
}