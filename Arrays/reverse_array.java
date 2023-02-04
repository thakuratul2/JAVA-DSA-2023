import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size  = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter the number: ");
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        for(int i = size-1;i>=0;i--){
            System.out.println("Reverse Array: "+num[i]);
        }
        sc.close();
    }
}
