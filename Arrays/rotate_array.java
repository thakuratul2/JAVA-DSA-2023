import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the times to rotate: ");
        int k = sc.nextInt();

        int rotation = k%size;

        rotate(nums,0,size-1);
        rotate(nums,0,rotation-1);
        rotate(nums,rotation,size-1);
        sc.close();
    }
    
    
   private static void rotate(int[] nums,int low,int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;

        low++;
        high--;
        
    }
    
}
