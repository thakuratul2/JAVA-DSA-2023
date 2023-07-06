package Sorting;

import java.util.Scanner;

public class merge_sorted_ques {

    public static void merge_sort(int nums1[],int nums2[],int m , int n){

        int i = m-1;
        int j = n-1;
        int k = m+n-1; // point last element of num1 array

        while(j>=0){
            if(i>=0 && nums1[i]> nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--; // if nums2 array element over
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size 1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size 2 : ");
        int size2 = sc.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        System.out.println("Enter the element in array 1: ");
        for(int i =0;i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the element in array 2: ");
        for(int j = 0;j<size2;j++){
            arr2[j] = sc.nextInt();
        }

        merge_sort(arr1, arr2, size1, size2);
        System.out.println("Sorting: ");
        for(int z = 0;z<size1+size2;z++){
            System.out.println(arr1[z]+" ");
        }
        sc.close();
    }
}
