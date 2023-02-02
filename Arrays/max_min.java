package Arrays;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");

        
        int size = sc.nextInt();
        int[] number = new int[size];

        //input
        System.out.println("Enter the number: ");
        for(int i = 0;i<size;i++){
            number[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<size;i++){
            if(number[i]<min){
                min = number[i];
            }if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);
        sc.close();
    }
}
