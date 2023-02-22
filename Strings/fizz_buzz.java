package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizz_buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        List<String> res = new ArrayList<String>();

        for(int i =1;i<=num;i++){
            if(i%15==0){
                res.add("FizzBuzz");
            }else if(i%5==0){
                res.add("Buzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        System.out.println("Output: "+res);
        sc.close();

    }
}
