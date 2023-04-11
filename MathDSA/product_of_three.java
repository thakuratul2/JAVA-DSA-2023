package MathDSA;

import java.util.Arrays;
import java.util.Scanner;

public class product_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        
        int ans = Math.max(nums[size-1]*nums[size-2]*nums[size-3], nums[size-1]*nums[0]*nums[1]);

        System.out.println("Maxium product: "+ans);
        sc.close();
    }
}
