package Strings;

import java.util.Scanner;

public class break_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String palindrome = sc.nextLine();

        char charat[] = palindrome.toCharArray();

        int size = charat.length;
        if(size<=1){
            System.out.println("empty string");
        }
        for(int i =0;i<size/2;i++){
            if(charat[i]!='a'){
                charat[i] = 'a';
                System.out.println("Palindrome: "+String.valueOf(charat));
            }
        }
        charat[size-1]='b';
        System.out.println("Palindrome: "+String.valueOf(charat));

        sc.close();
    }
}
