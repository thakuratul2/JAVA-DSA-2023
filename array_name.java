import java.util.Scanner;

public class array_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        System.out.println("Enter the String into Array: ");
        for(int i =0;i<size;i++){

            names[i] = sc.next();
        }
        //output
        for(int i = 0;i<size;i++){
            System.out.println("String at index of names array at "+(i)+" is: "+names[i]);
        }
        sc.close();
    }
    
}
