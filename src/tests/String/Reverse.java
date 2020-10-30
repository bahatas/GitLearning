package tests.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverse("oof"));
        System.out.println(findUnique("AAABBDFFGGGL"));
        System.out.println(findUnique2("AAABBDFFGGGL"));
    }

    public static String reverse(String word) {

        StringBuilder stringBuilder = new StringBuilder(word);

        return String.valueOf(stringBuilder.reverse());
        //  return new StringBuilder(word).reverse().toString();

    }

    public static String findUnique(String word) {

        Set<Character> list = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        return list.toString().replace(",", "");
    }

    public static String findUnique2(String word) {

        String result ="";

        for(String each : word.split(""))

            result +=(  (Collections.frequency(Arrays.asList(word.split("")), each)) ==1 ) ? each : "";

        return result;

    }
}


