import java.util.Scanner;

public class assign_cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int greed[] = new int[size];
        int sizeCookies[] = new int[size];

        int x = 0;
        int y = 0;
        int res = 0;
        
        System.out.println("Enter the children: ");
        for(int i = 0;i<size;i++){
            greed[i] = sc.nextInt();
        }
        System.out.println("Enter the size of cookies: ");
        for(int j=0;j<size;j++){
            sizeCookies[j] = sc.nextInt();
        }

        while(x<greed.length && y<sizeCookies.length){
            if(sizeCookies[y]>=greed[x]){
                res++;
                y++;
                x++;
            }else{
                y++;
            }
        }
        System.out.println("Maximum assign: "+res);
        sc.close();

    }
}
