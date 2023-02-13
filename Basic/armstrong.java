

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int rem,temp;
        int rev=0;

        temp=num;
        while(num>0){
            rem = num%10;
            rev = rev + rem*rem*rem;
            num = num/10;
        }
        if(temp==rev){
            System.out.println("Armstrong");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
