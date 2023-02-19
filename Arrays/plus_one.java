import java.util.Arrays;
import java.util.Scanner;

public class plus_one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int digits[] = new int[size];
System.out.println("Enter the element: ");
        for(int i = 0;i<size;i++){
            digits[i] = sc.nextInt();
        }
        for(int i =size-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println("Sum of digits: "+ Arrays.toString(digits));
            }
            digits[i]=0;
        }
        int nums[] = new int[size+1];
        nums[0] = 1;
        System.out.println("Sum: "+Arrays.toString(digits));
        sc.close();
    }
}