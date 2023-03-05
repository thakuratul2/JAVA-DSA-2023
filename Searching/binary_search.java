package Searching;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int k = sc.nextInt();

        int start =0;
        int last = size-1;
        while(start<=last){
            int mid= start + (last-start)/2;
            if(nums[mid]==k){
                System.out.println("Found in: "+mid);
            }else if(nums[mid]<k){
                start = mid+1;
            }else{
                last = mid-1;
            }
        }
        System.out.println("Not Found");
        sc.close();
    }
}
