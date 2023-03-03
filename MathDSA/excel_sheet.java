package MathDSA;

import java.util.Scanner;

public class excel_sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the columnNumber: ");
        int columnNumber = sc.nextInt();

        String res = "";
        while(columnNumber>0){
            columnNumber--;
            res = (char)('A'+(columnNumber%26))+res;
            columnNumber = columnNumber/26;
        }
        System.out.println("Excel Sheet: "+res);
        sc.close();
    }
}
