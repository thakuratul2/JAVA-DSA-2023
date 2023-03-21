package Strings;

import java.util.Scanner;

public class palidrome2 {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        int i=0,j=name.length()-1;
        while(i<j){
            if(name.charAt(i)!=name.charAt(j))
                return isPalindrome(name,i+1,j) || isPalindrome(name,i,j-1);   
            j--;i++;
            sc.close();
        }
      
        return true;
      
    }
    public static boolean isPalindrome(String ss,int i, int j){
        while(i<j){
            if(ss.charAt(i)!= ss.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}
