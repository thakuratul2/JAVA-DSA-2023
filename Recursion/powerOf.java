package Recursion;

import java.util.Scanner;

public class powerOf {
    public static double PowerOf(int x,int n){
        if (n == 0) 
            return 1.0;

        if (n % 2 == 1) //for odd
            return x * PowerOf(x, n - 1);

        if (n % 2 == 0) //for even
            return PowerOf(x * x, n / 2);

        return 1 / PowerOf(x, -n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        System.out.println("Enter the power: ");
        int n = sc.nextInt();

        double ans = PowerOf(x, n);

        System.out.println("Power are: "+ans);
        sc.close();
    }
}
