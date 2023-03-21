package Strings;

import java.util.Scanner;

public class add_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string-1: ");
        String num1 = sc.nextLine();
        System.out.println("Enter the string-2: ");
        String num2 = sc.nextLine();

        String res="";
       // int sum = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;

        int carry = 0;
        while(i>=0 || j>=0 || carry!=0){
            int ival = i>=0 ? num1.charAt(i)-'0':0;
            int jval = j>=0? num2.charAt(j) - '0':0;

            i--;
            j--;
       int sum = ival + jval + carry;
            res = (sum%10)+res;
            carry = sum/10;
        }
        System.out.println("Sum is "+res);
        sc.close();
    }
}
