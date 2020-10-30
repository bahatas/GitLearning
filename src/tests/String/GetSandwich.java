package tests.String;

public class GetSandwich {
    public static void main(String[] args) {
        String str = "breadjambread";
        System.out.println(str.indexOf("bread",5));
        System.out.println(str.lastIndexOf("bread"));
        if(str.toLowerCase().contains("bread"))	{

            if(str.indexOf("bread") == str.lastIndexOf("bread")) {

                System.out.println("nothing");
            }else {
                System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
            }

        }else {
            System.out.println("nothing");
        }

    }
}
