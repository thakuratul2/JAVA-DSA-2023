package Strings;

import java.util.Scanner;

public class valid_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second String: ");
        String t = sc.nextLine();

        int[] arr = new int[26];

        if(s.length()!=t.length()){
            System.out.println("False");
        }
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int j =0;j<t.length();j++){
            arr[t.charAt(j)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println("False");
            }
        }
        System.out.println("True");
        sc.close();
    }
}
