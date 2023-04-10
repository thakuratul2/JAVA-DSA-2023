package MathDSA;

import java.util.Scanner;

public class power_of_two {
    public static boolean isPowerOfTwo(int n){
        if(n<1){
            return false;
        }if(n==1){
            return true;
        }if(n%2==1)//for check odd 
        {
            return false;
        }
        return (isPowerOfTwo(n/2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean ans = isPowerOfTwo(num);
        System.out.println(ans);
        sc.close();
    }
}
