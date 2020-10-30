package tests.String;

public class Pool {
    public static void main(String[] args) {
        String name = "Java";
        String name2 = "Java";
        String name3 = new String("Java");
        String name4 = new String("Java");

        System.out.println("name and name2 will return true because of they are in String pool ==> " + (name == name2));
        System.out.println("'name is in the String pool but name 3 is not Result is  ==> " + (name == name3));
        System.out.println("'name3 and name 4 is completely diffrent object result is ==> " + (name3 == name4));
    }
}


