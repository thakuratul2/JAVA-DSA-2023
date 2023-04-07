package Recursion;

import java.util.Scanner;

public class recursion {
    public static int Fact(int num){
        if(num == 0){
            return 1;
        }
        int partial = Fact(num-1);

        return num * partial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int ans = Fact(n);
        System.out.println("Factorial is: "+ans);
        sc.close();
    }
}
