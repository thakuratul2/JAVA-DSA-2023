import java.util.Scanner;

public class maximum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int sum=0;

        int nums[] = new int[size];
        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int max = nums[0];

        for(int i =0;i<size;i++){
            sum = sum+nums[i];

            if(sum>max){
                max=sum;
            }if(sum<0){
                sum=0;
            }
        }
        System.out.println("Maximum Sum: "+max);
        sc.close();
    }
}
