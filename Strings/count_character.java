package Strings;

import java.util.Scanner;

public class count_character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();

        int count = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
            
        }
        System.out.println(count+" Times");
            sc.close();
    }
}