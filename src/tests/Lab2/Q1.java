package tests.Lab2;

import javax.swing.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        //variables
        int goForAsk = 1,firstNumber,secondNumber,largestNumber = 0,smallestNumber = 0;

        System.out.println("Enter your fist number :");
        firstNumber = scan.nextInt();

        System.out.println("Enter your next number :");
        secondNumber = scan.nextInt();

        largestNumber=firstNumber>=secondNumber?firstNumber:secondNumber;  //asssign large

        smallestNumber=firstNumber<secondNumber?firstNumber:secondNumber;   // assign small

        System.out.println("Do you want to enter another number: 0-No, 1-Yes");
        goForAsk=scan.nextInt();

        while(goForAsk==1){


            System.out.println("Enter your next number :");
            secondNumber = scan.nextInt();

            largestNumber=largestNumber>=secondNumber?largestNumber:secondNumber;  //asssign large

            smallestNumber=smallestNumber<secondNumber?smallestNumber:secondNumber;   // assign small

            System.out.println("Do you want to enter another number: 0-No, 1-Yes");
            goForAsk=scan.nextInt();


        }

        System.out.println("Smallest Number is :"+smallestNumber);
        System.out.println("Largest Number is :"+largestNumber);



    }
}
