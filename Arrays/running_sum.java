import java.util.Arrays;
import java.util.Scanner;

public class running_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
       for(int i =1;i<size;i++){
        nums[i] = nums[i]+nums[i-1];
       }
       System.out.println("Running Sum: "+Arrays.toString(nums));
       sc.close();
    }
}
