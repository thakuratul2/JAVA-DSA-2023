package Strings;

import java.util.Scanner;

public class Roman_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.nextLine();
int sum = 0, pre = 0;
        char ch = 0;
        for(int i = 0; i < name.length(); i++){
            pre = ch;
            ch = name.charAt(i);
            switch(ch){
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if(pre == 'I')
                     sum = sum + 3;
                    else
                     sum = sum + 5;
                    break;
                case 'X':
                    if(pre == 'I')
                     sum = sum + 8;
                    else
                     sum = sum + 10;
                    break;
                case 'L':
                    if(pre == 'V')
                     sum = sum + 40;
                    if(pre == 'X')
                     sum = sum + 30;
                    else
                    sum = sum + 50;
                    break;
                case 'C':
                    if(pre == 'I')
                     sum = sum + 98;
                    if(pre == 'V')
                     sum = sum + 90;
                    if(pre == 'X')
                     sum = sum + 80;
                    else
                    sum = sum + 100;
                    break;
                case 'D':
                    if(pre == 'V')
                     sum = sum + 490;
                    if(pre == 'X')
                     sum = sum + 480;
                    if(pre == 'L')
                     sum = sum + 400;
                    if(pre == 'C')
                     sum = sum + 300;
                    else
                    sum = sum + 500;
                    break;
                case 'M':
                    if(pre == 'I')
                     sum = sum + 998;
                    if(pre == 'V')
                     sum = sum + 990;
                    if(pre == 'X')
                     sum = sum + 980;
                    if(pre == 'L')
                     sum = sum + 900;
                    if(pre == 'C')
                     sum = sum + 800;
                    else
                    sum  = sum + 1000;
                    break;
             }
        }
       System.out.println(sum);
     
        sc.close();
    }
}
