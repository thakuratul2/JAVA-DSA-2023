package MathDSA;

import java.util.Scanner;

public class power_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        while(n>=3){
            if(n%3!=0){
                System.out.println("Not a pwer of three");
               
            }
            n = n / 3;
        }
        System.out.println("Power of three");
        sc.close();
    }
}
