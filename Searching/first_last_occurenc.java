package Searching;

import java.util.Scanner;

public class first_last_occurenc {
    public int firstSide(int arr[],int k){
        int s = 0;
        int e = arr.length-1;
         int ans = -1;
         while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]==k){
                ans = mid;
                e = mid-1;
            }else if(arr[mid]<k){
                s = mid+1;

            }else{
                e = mid-1;
            }
         }
         return ans;
         
    }
    public int lastSide(int arr[],int k){
        int s = 0;
        int e = arr.length-1;
         int ans = -1;
         while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]==k){
                ans = mid;
                s = mid+1;
            }else if(arr[mid]<k){
                s = mid+1;

            }else{
                e = mid-1;
            }
         }
         return ans;
        }
        
    public int[] main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the key to find: ");
        int target = sc.nextInt();

        int arr[] = new int[2];

        arr[0] = firstSide(arr, target);
        arr[1] = lastSide(arr, target);

        if(arr[0]==-1 || arr[1]==-1){
            return new int[]{-1,-1};
        }
        return arr;

        
        
    }
}
