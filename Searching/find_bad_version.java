package Searching;

import java.util.Scanner;

public class find_bad_version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int s = 0;
        int e = size;
        int ans = -1;
        while(s<=e){
            int mid = s +(e-s)/2;

            if(mid == 4){ //use inbuild function called isBadVersion(mid)
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        System.out.println("Answer"+ans);
        sc.close();
    }
}
