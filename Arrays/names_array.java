package Arrays;

import java.util.Scanner;

public class names_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        String[]  name = new String[size];

        //input
        System.out.println("Enter the String: ");
        for(int i = 0;i<size;i++){
            name[i] = sc.next();
        }
        //output
        for(int i = 0;i<size;i++){
            System.out.println("String in array at index "+(i)+" is: "+name[i]);
        }
        sc.close();
    }
}
