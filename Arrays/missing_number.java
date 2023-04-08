import java.util.Scanner;

public class missing_number {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int size = sc.nextInt();

    int[] nums = new int[size];

    System.out.println("Enter the element: ");
    for(int i = 0;i<size;i++){
        nums[i] = sc.nextInt();
    }
    int sum = 0;
    for(int j = 0;j<size;j++){
        sum = sum + nums[j];
    }
    int actual = (size*(size+1))/2;
    int missingSum = actual - sum;

    System.out.println("Missing Number: "+missingSum);
    sc.close();
 }   
}
