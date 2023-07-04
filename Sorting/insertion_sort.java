package Sorting;

import java.util.Scanner;

public class insertion_sort {

    static public void insertion_code(int arr[], int n){
        for(int i =0;i<=n-1;i++){

            int temp = i; // store because don't create extra space

            while(temp>0 && arr[temp-1]>arr[temp]){

                //swap
                int swap = arr[temp-1];
                arr[temp-1] = arr[temp];
                arr[temp] = swap;

                temp--;
            }
        }
        System.out.println("After Sorting: ");
        for(int i =0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int sort[] = new int[size];

        System.out.println("Enter the number: ");
        for(int i =0;i<size;i++){
            sort[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for(int j =0;j<size;j++){
            System.out.println(sort[j]+"");
        }
        System.out.println();
        insertion_code(sort, size);
        sc.close();
    }
}
