package Strings;

import java.util.Scanner;

public class check_palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String rev = sb.toString();
        if(str.equals(rev)){
            System.out.println("Yes"+str);
        }
        System.out.println("No"+str);
        sc.close();
    }
}
