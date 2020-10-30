package tests.String;

public class PrintLetterCombiantion {
    public static void main(String[] args) {
        /**
         * Write a loop that displays all possible combinations of two letters where the letters are
         * 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:
         */

        String str="zyxwv";

        for (int i=0;i<str.length();i++) {
            for(int j=0;j<str.length();j++)
                System.out.print (str.substring(i,i+1)+"_"+str.substring(j,j+1));
        }

    }
}
