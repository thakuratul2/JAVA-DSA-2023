import java.util.Scanner;

public class find_duplicate {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        for(int j=0;j<size;j++){
            int index = Math.abs(nums[j]);

            if(nums[index]<0){
                System.out.println("Index Value"+index);
            }
            nums[index] = -nums[index];
        }
        System.out.println("Duplicate -1 ");
        sc.close();
    }
}
