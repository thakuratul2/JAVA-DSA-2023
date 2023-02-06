import java.util.Arrays;
import java.util.Scanner;

public class contain_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i]  = sc.nextInt();
        }
        Arrays.sort(nums);

        for(int i =0;i<size-1;i++){
            if(nums[i]==nums[i+1]){
                System.out.println("True");
            }
        }
        System.out.println("False");
        sc.close();
    }
}
