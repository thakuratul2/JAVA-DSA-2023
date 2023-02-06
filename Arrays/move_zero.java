import java.util.Scanner;

public class move_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int nums[] = new int[size];
        int first=0;
        int second=0;
        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        if(size==0||size==1){
            System.out.println("Move Done");
        }
        while(second<size){
            if(nums[second]==0){
                second++;
            }else{
                int temp = nums[first];
                nums[second] = nums[first];
                nums[second]=temp;
                first++;
                second++;
            }
            System.out.println("First Move: "+first);
            System.out.println("Second Done: "+second);
        }
        sc.close();
    }
}
