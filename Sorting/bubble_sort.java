package Sorting;

import java.util.Scanner;

public class bubble_sort {

    static public void bubble_code(int[] arr, int n){

        for(int i =0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            //after sorting
            
        }
        System.out.println("After Sorting: ");
            for(int i =0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int sort[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            sort[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int j = 0;j<size;j++){
            System.out.println(sort[j]+" ");
        }
        System.out.println();
        bubble_code(sort, size);

        sc.close();
    }
}
