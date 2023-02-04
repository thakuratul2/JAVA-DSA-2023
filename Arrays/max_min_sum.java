import java.util.Scanner;

public class max_min_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<size;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max= nums[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        int sum = min+max;
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}
