package MathDSA;

import java.util.Scanner;

public class excel_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        String letter = sc.next();

        int res = 0;
        for(int i =0;i<letter.length();i++){
            res = res * 26;
            res = res + (letter.charAt(i) - 'A'+1);
        }
        System.out.println("Number: "+res);
        sc.close();
    }
}
