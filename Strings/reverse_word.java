package Strings;

import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        String ans="";
        String[] res = s.trim().split(" +");
        for(int i =res.length-1;i>=0;i--){
            ans+=res[i];
            if(i!=0){
                ans +=" ";
            }
        }
        System.out.println("Reverse: "+ans);
        sc.close();
    }
}
