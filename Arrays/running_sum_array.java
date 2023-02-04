import java.util.Scanner;

public class running_sum_array {

    public static void main(String[] args) {
//         //Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size: ");
     int size = sc.nextInt();

     int nums[] = new int[size];
          System.out.println("Enter the number: ");
          for(int i=0;i<size;i++){
            nums[i]= sc.nextInt();
          }
          for(int i =1;i<size;i++){
            nums[i]+=nums[i-1];
        }
       System.out.println("Output: "+nums);
      sc.close();
    }
}
