import java.util.Scanner;

public class count_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[][] nums = new int[size][size];
       int ans = 0;

       System.out.println("Enter the element: ");
       for(int i=0;i<size;i++ ){
        for(int j =0;j<size;j++){
            nums[i][j]=sc.nextInt();
        }
       }
        for(int i =0;i<size;i++){
            for(int j = 0;j<nums[0].length;j++){
                if(nums[i][j]<0)
                ans++;
            }
        }
        System.out.println("Maximum: "+ans);
        sc.close();
    }
}
