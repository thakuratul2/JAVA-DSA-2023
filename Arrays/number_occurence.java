import java.util.Scanner;

public class number_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number check the occurernce: ");
        int x = sc.nextInt();

        int count = 0;
        for(int i =0;i<size;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Times: "+count);
        sc.close();
    }
}
