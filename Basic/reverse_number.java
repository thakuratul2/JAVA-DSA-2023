
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num>0) {
            int temp = num%10;
            rev = (rev*10)+temp;
            num = num/10;
        }

        System.out.println("Reverse: "+rev);
        sc.close();
    }
}
