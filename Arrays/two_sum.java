package Arrays;

import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the number: ");
        for(int i =0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        for(int i =0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(nums[i] + nums[j]==target){
                    System.out.println("Sum is: "+nums[i]+" , "+nums[j]);
                }
            }
        }
        //System.out.println("Invalid");
        sc.close();
    }
}
