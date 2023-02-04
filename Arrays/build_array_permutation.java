import java.util.Scanner;

public class build_array_permutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        int arr[] = new int[n];

        System.out.println("Enter the number: ");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            

            arr[i] = nums[nums[i]];
        }
        System.out.println("Output: "+arr);
        sc.close();

    }
}
