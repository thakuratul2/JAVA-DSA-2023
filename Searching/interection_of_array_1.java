import java.util.Arrays;
import java.util.Scanner;

public class interection_of_array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int num1[] = new int[size];
        int num2[] = new int[size];

        int i =0,j=0,k=0;

        System.out.println("Enter the element in array1: ");
        for(int x =0;x<size;x++){
num1[x]=sc.nextInt();
        }
        System.out.println("Enter the element in arra2: ");
        for(int y =0;y<size;y++){
num2[y]=sc.nextInt();
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        while(i<num1.length && j<num2.length){
            if(num1[i]==num2[j]){
                num1[k++] = num1[i];
                i++;
                j++;
            }else if(num1[i]<num2[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println("Interesection: "+Arrays.copyOfRange(num1, 0, k));
        sc.close();
    }
}
