package tests.ForLoops.ASS6;

public class Q6 {

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i);
            int a=4;
            int sum = i+a;
            for (int j = 2; j <=i ; j++) {

                System.out.print(" "+(sum));
                a--;
                sum+=a;
            }
            System.out.println();
        }
    }
}

/**
 * 1
 * 2 6
 * 3 7 10
 * 4 8 11 13
 * 5 9 12 14 15
 */