package Sorting;

import java.util.Scanner;

public class quick_sort {

    public static int partition(int sort[], int low,int high){

        int pivot = sort[high];// start from last element

        int i = low-1;

        for(int j=low;j<high;j++){
            if(sort[j]<pivot){
                i++;// track the space blank
                //swap 
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
            }
        }
        i++;//pivot space make

        int temp = sort[i];
        sort[i] = pivot;
        sort[high] = temp;


        return i;
    }

    public static void quicksort(int arr[],int low,int high){

        if(low<high){
            int pidx = partition(arr,low,high);

            //do it again
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
        }
        // worst case = O(n^2)
        //average case = O(nlogn)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        quicksort(arr,0,size-1);

        System.out.println("Sorting: ");
        for(int j = 0;j<size;j++){
            System.out.println(arr[j]+"");
        }
        
        System.out.println();
        sc.close();
    }
}
