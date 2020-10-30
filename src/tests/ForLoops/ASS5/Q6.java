package tests.ForLoops.ASS5;

public class Q6 {

    /**
     * Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
     */
    public static void main(String[] args) {

        int first = 0,second = 1,  number = 10;

        System.out.print(first+","+second);
        int sum = second+first;
        for (int i = 2; i < number; i++) {
            System.out.print(","+sum);


            first=second;
            second=sum;

            sum+=first;

        }

    }
}
