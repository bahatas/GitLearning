package tests;

import java.util.Scanner;

public class see {
    public static void main(String[] args) {
     //   Example:
//			Input: A
//			Input: D
//			Output: right > down > left: D found
//
//			Input: C
//			Input: C
//			Output: C found
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        char startChar = start.charAt(0);
        int startInt = startChar;
        char endChar = end.charAt(0);
        int endInt = endChar;
        if (endInt == startInt) {
            System.out.println((char) startInt + " found");
        }
        else if (endInt < startInt) {
            endInt += 4;
        }
        for (int i = startInt; i < endInt; i++) {
            if (i % 4 == 0)
                System.out.print("up");
            else if (i % 4 == 1)
                System.out.print("right");
            else if (i % 4 == 2)
                System.out.print("down");
            else
                System.out.print("left");
            if (i < endInt - 1) {
                System.out.print(" > ");
            }
        }

        if (endChar != startChar) {
            System.out.print(": " + endChar+" found");
        }
    }
}
