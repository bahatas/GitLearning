package tests.Replits;

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        /**
         * Example:
         * input: abcXXXabc
         * output: 1
         */

        for(int i = 0; i < str.length()-2; i++){

/*
            if(str.charAt(i)==str.charAt(i+1)&& str.charAt(i)==str.charAt(i+2)){
                count++;
            }

*/


            String s1 = str.substring(i,i+3);

            
            if (s1.equals(str.charAt(i)+""+str.charAt(i)+""+str.charAt(i))){
                count++;
            }

        }

        System.out.print(count);

    }
}


