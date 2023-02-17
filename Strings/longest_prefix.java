package Strings;

import java.util.Scanner;

public class longest_prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        String name[] = new String[size];

        System.out.println("Enter the string: ");
        for(int i=0;i<size;i++){
            name[i] = sc.nextLine();
        }
        String prefix = name[0];

        for(int i = 0;i<size;i++){
            while(name[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.println("Empty String");
                }
            }
        }
        System.out.println("Longest Prefix: "+prefix);
        sc.close();
       
    }
}
