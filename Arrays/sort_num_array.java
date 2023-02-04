

import java.util.Arrays;
import java.util.Scanner;

public class sort_num_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        //input
        System.out.println("Enter the number: ");
        for(int i = 0;i<size;i++){
            num[i]=sc.nextInt();
        }
        //output
        
            Arrays.sort(num);
            System.out.println("Sorted Array: "+Arrays.toString(num));
        
        sc.close();
    }
}
