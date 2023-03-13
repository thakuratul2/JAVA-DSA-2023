import java.util.Scanner;

public class pivot_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        int sum = 0;
        int temp=0;
        System.out.println("Enter the element: ");
        for(int x = 0;x<size;x++){
            nums[x] = sc.nextInt();
        }
        for(int i =0;i<size;i++){
            //sum all the value
            sum = sum +nums[i];
        }

        for(int j=0;j<size;j++){
            sum = sum - nums[j];
            if(sum == temp){
                System.out.println("Pivot"+j);
            }
            //add again substract value to temp
            temp = sum + nums[j];
        }
        System.out.println("No found");
        sc.close();
    }
}
