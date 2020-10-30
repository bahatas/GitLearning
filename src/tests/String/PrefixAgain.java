package tests.String;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        /**
         * Given a string, consider the prefix string made of the first n chars of the string.
         * Does that prefix string appear somewhere else in the string?
         * Assume that the string is not empty and that n is in the range from 1 till str.length().
         */

        int n = scan.nextInt();
        String prefix = str.substring(0,n);
        int count=0;

        for(int i=n; i<str.length()-n+1; i++){
            if(str.substring(i,i+n).equals(prefix)){
                count++;
                i+=n-1;
            }
        }
        if(count>0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
