package MathDSA;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        long start = 0;
        long end = x;
        long ans = 0;

        while(start<=end){
            long mid = start + (end-start)/2;

            if(mid * mid ==x){
                ans = mid;
                break;
            }else if(mid * mid<x){
                start = mid+1;
                ans = mid;
            }else{
                end = mid-1;
            }
        }
        System.out.println("Square root: "+ans);
        sc.close();
    }
}
