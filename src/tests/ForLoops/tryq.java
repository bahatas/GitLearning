package tests.ForLoops;

import java.util.Scanner;

public class tryq {
    public static void main(String[] args) {
        //Question-6:
//
//			Write a program to print Fibonacci series of n terms where n is
        //declared by user : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
//
//
//

        Scanner scan=new Scanner(System.in);
        System.out.println("What is teh term number?");
        int n=scan.nextInt();
        int t1=0,t2=1;

        for(int i=2;i<=n;++i) {



            int sum=t1+t2;
            t1=t2;
            t2=sum;

        }
        System.out.println("The final number in sequence is "+t2);

    }
}
