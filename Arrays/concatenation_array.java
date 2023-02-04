import java.util.Scanner;

public class concatenation_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        int arr[] = new int[2*size];

        System.out.println("Enter the number: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        for(int i =0;i<size;i++){
            arr[i] = nums[i];
            arr[i+size] = nums[i];
        }
        System.out.println("Output: "+arr);

        sc.close();
    }
}
