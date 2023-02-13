
import java.util.Scanner;

public class pallidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp=num;

        int rem;
        while(num>0){
            rem = num%10;
            rev = (rev*10) +rem;
            num = num/10;
        }
        if(temp==rev){
            System.out.println("Pallidrome");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
