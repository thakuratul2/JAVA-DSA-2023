import java.util.Arrays;
import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Outcome: "+nums[size/2]);
        sc.close();
    }
}
