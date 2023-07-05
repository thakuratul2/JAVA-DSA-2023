package Sorting;

import java.util.Scanner;

public class merge_sort {

    public static void conquer(int arr[],int mid, int si, int ei){

        int merged[] = new int[ei-si+1];

        int index1 = si;
        int index2 = mid+1;

        //track the element in merged 
        int x = 0;

        while(index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                merged[x++] = arr[index1++];
            }else{
                merged[x++] = arr[index2++];
            }
        }
        //find the remaining number
        while(index1<=mid){
            merged[x++] = arr[index1++];
        }
        while(index2<=ei){
            merged[x++] = arr[index2++];
        }

        //print the merged element to main array
        for(int i =0,j=si;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si,int ei){

        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,mid,si,ei);
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
        for(int j=0;j<size;j++){
            System.out.println(sort[j]+"");
        }

        divide(sort,0,size-1);
        System.out.println("After Sorting: ");
        for(int z=0;z<size;z++){
            System.out.println(sort[z]+"");
        }
        System.out.println();
        sc.close();
    }
}
