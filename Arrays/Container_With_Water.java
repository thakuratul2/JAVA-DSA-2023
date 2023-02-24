import java.util.Scanner;

public class Container_With_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        //find the maximum area of water
        int height[] = new int[size];

        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            height[i] = sc.nextInt();
        }
        int leftPointer = 0;
        int rightPointer = height.length-1;
        int maxArea=0;
        while(leftPointer<rightPointer){
            int leftHeight = height[leftPointer];
            int rightHeight = height[rightPointer];
            int minHeight = Math.min(leftHeight, rightHeight);
            int len = rightPointer-leftPointer;

            int current = minHeight * len;
            maxArea = Math.max(maxArea, current);

            if(leftHeight<rightHeight)
            leftPointer++;
            else
            rightPointer--;
        }
        System.out.println("Maximum Water: "+maxArea);
        sc.close();
    }
}
