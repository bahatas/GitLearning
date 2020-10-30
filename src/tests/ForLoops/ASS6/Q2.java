package tests.ForLoops.ASS6;

public class Q2 {
    public static void main(String[] args) {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 7; i >=1; i--) {
            for (int j = 7; j >=i; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
/**
1234567
123456
12345
1234
123
12
1
7
76
765
7654
76543
765432
7654321

Process finished with exit code 0

 */