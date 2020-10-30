package tests.Lab2;

import java.util.Scanner;

public class Q2 {

    /***
     * A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 serving in the bag and that a serving equals 300 calories.
     * write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many cookies you have eaten ?");
        int eatencookies = scan.nextInt();
        System.out.println(caloriCalculator(eatencookies));

    }

    public static double caloriCalculator(int eatenCookie){
       double oneCookieCal = 75;
       return eatenCookie*75;
    }
}
