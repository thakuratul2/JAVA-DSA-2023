import java.util.Scanner;

public class copy_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        int arr2[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Element in first array: ");
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]+" ");
        }
        
        for(int i =0;i<size;i++){
            arr2[i]= arr1[i];
        }
        System.out.println("Element in second array: ");
        for(int i=0;i<size;i++ ){
            System.out.println(arr2[i]);
        }
        sc.close();
    }
}
