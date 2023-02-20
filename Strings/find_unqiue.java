package Strings;

import java.util.Scanner;

public class find_unqiue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        for(int i =0;i<s.length();i++){
            char letter = s.charAt(i);

            if(s.indexOf(letter) == s.lastIndexOf(letter))
            System.out.println("Position: "+i);
        }
        System.out.println("Not Found");
        sc.close();
    }
}
