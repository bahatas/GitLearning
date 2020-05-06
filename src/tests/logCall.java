package tests;

import java.util.Arrays;
import java.util.List;

public class logCall {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(new String[]{"jo", "ozzy", "Ins"});
        for (String name : names) {
            System.out.println("name = " + name);
            System.out.println("---------------");
        }
    }
}
