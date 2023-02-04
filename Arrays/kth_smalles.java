import java.util.Scanner;

public class kth_smalles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int num[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;

        for(int i =0;i<size;i++){
            if(num[i]<max){
                max=num[i];
            }
            
        }
        System.out.println("Min Value: "+max);
        sc.close();
    }
}
