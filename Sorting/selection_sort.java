package Sorting;

import java.util.Scanner;

public class selection_sort {

    public static void selection_test(int[] arr , int n){
        for(int i =0; i<n;i++){
            int min = i;//save the element in the min variable
            for(int j = i+1;j<n;j++){
                
                if(arr[j]<arr[min]){
                    min = j;// update the min value when we find the minimum value
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        //print the array

        System.out.println("After Sorting: ");
        for(int i =0;i<n;i++){ 
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int sort[] = new int[size];

        System.out.println("Enter the number: ");
        for(int i =0;i<size;i++){
            sort[i]=sc.nextInt();
        }

        System.out.println("Befor Sorting: ");
        for(int j = 0;j<size;j++){
            System.out.println(sort[j]+" ");
        }
        System.out.println();
        selection_test(sort,size);
        sc.close();
    }
}
