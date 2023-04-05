import java.util.Scanner;

public class perfect_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int s = 0;
        int l = num;
        while(s<=l){
            long mid = s + (l-s)/2;

            if(mid * mid == num){
                System.out.println("True");
                break;
            }else if(mid * mid < num){
                s = (int) mid+1;
            }else{
                l = (int) mid -1;
            }
        }
System.out.println("False");
sc.close();
    }
}
