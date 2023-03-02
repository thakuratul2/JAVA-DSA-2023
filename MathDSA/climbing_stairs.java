package MathDSA;

import java.util.Scanner;

public class climbing_stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        int arr[] = new int[x+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i =2;i<=x;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("Ways of Steps: "+arr[x]);
        sc.close();
    }
}
