package Strings;


import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        String[] str = new String[size];
        //string -> char

        int first=0;
        int second = str.length-1;

        System.out.println("Enter the string: ");
        for(int i = 0;i<size;i++){
            str[i]= sc.nextLine();
        }
        while(first<=second){
            String temp = str[first];
            str[first] = str[second];
            str[second] = temp;

            first++;
            second--;
        }
       // System.out.println("Reverse String: "+);
        sc.close();
    }
}
