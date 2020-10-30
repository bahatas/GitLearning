package tests.Replits;


import java.util.Scanner;

public class Q078CarInsurance  {

    public static void main(String[] args) {

        //DO NOT CHANGE
        double premium = 0;//
        int accidentsAmount = 0;//
        int daysDrivenToWorkOrSchool = 0;//
        int milesToWorkOrSchool = 0;//
        int zipcode=0;//
        int age=0;//
        int experienceYear=0;//
        String vehicleOwnership = "";//
        String vehicleUsage = "";//
        String continuousInsurance = "";//
        String education = "";//
        String name = "";//
        String referenceNumber = "";
        String USdriver="";//
        String accident="";//
        String education1 = "";
        String education2 = "";
        String education3 = "";
        String education4 = "";
            Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name=scan.next();
        System.out.println("Do you have a US driver license?");
        String answer=scan.next();

        if(answer.equalsIgnoreCase("yes")) {

            System.out.println("Enter your zip code");
            int zipCode=scan.nextInt();
            if(zipCode==20910 || zipCode==20740) {
                premium += 60;
            }else if(zipCode==22102 || zipCode==22103 ) {
                premium += 30 ;

            }else {
                premium += 50 ;
            }

            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership=scan.next();
            if(vehicleOwnership.equalsIgnoreCase("owned")) {
                premium += 10 ;
            }else {
                premium += 20 ;
            }

            System.out.println("How is this vehicle primarily used?");
            vehicleUsage=scan.next();
            if(vehicleUsage.equalsIgnoreCase("Business")) {
                premium += 50;
            }else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
                premium += 10;

            }else if(vehicleUsage.equalsIgnoreCase("Commute")) {
                premium += 20;

                //?
                //          System.out.println("Days Driven To Work And/Or School");
                //			daysDrivenToWorkOrSchool = scan.nextInt();
                //			premium += daysDrivenToWorkOrSchool * 5;
                //
                //			System.out.println("Miles Driven To Work And/Or School");
                //			milesToWorkOrSchool = scan.nextInt();
                //			premium += milesToWorkOrSchool * 1;
            }

            System.out.println("How old are you?");
             age=scan.nextInt(); // Compile error

            if(age<16) {
                System.out.println("Invalid data!");  // Stop program
            }else if(age>=16 && age<18) {
                premium = premium*20;
            }else if(age>=18 && age<=21) {
                premium = premium*6 ;
            }else if(age>21 && age<25) {
                premium = premium*2 ;

            }

            System.out.println("How many years you've been driving?");
            int experience=scan.nextInt();

            if(experience>=0 && age-experience>=16) {

                premium = premium - (experience*5);

            }else {
                System.out.println("Invalid data!");
                System.exit(0);
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            answer=scan.next();

            if(answer.equalsIgnoreCase("yes")) {

                System.out.println("How many?");
                accidentsAmount=scan.nextInt();

                premium = premium +( ((premium/100)*20)*accidentsAmount );
            }

            System.out.println("Have you had continuous insurance for the past 12 months?");
            answer=scan.next();
            if(answer.equalsIgnoreCase("no")) {
                premium = premium*2 ;

            }

            System.out.println("What is the highest level of education you have completed?");

            education=scan.next();

            if(education.equalsIgnoreCase("PhD") ||education.equalsIgnoreCase("Bachelors")
                    || education.equalsIgnoreCase("Masters")) {
                premium = premium - ((premium/100)*5);

            }else if(education.equalsIgnoreCase("Doctors")) {
                premium = premium - ((premium/100)*10);

            }else if(education.equalsIgnoreCase("Less than High School")) {
                premium = premium + ((premium/100)*5);
            }

            String referenceName=name.toUpperCase();
            String referenceEducation=education.toUpperCase();
            referenceNumber=referenceName.substring(0,2) + age +
                    referenceName.substring(referenceName.length()-2 ,referenceName.length()-1 )
                    + zipCode +referenceEducation.replace(" ","");


            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);
            System.out.println("Reference number: " + referenceNumber);

            //first if
        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }


    }




}
