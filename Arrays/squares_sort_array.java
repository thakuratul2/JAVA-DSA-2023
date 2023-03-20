import java.util.Arrays;
import java.util.Scanner;

public class squares_sort_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int num[] = new int[size];
        int temp[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            num[i] = sc.nextInt();
        }
       for(int j=0;j<size;j++){
        temp[j] = num[j] * num[j];
       }
       Arrays.sort(temp);
       System.out.println("Sorted Array: ");
       for(int i =0;i<size;i++){
        System.out.println(temp[i]+" ");
       }
       sc.close();
    }
}
