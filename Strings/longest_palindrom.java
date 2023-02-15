package Strings;

import java.util.Scanner;

public class longest_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String name  = "";
        int longest = 0;
        for(int i =0;i<s.length();i++){
            //for odd length
            int left = i;
            int right = i;

            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>longest){
                    longest = right - left+1;
                    name = s.substring(left, right+1);
                }
                left--;
                right++;
            }
            //even length
            left = i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>longest){
                    longest = right - left+1;
                    name = s.substring(left, right+1);
                }
                left--;
                right++;
        }
    }
    System.out.println("Longest Palindrome: "+name);
    sc.close();
}
}
