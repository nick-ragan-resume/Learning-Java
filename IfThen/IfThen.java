// IfThen 

public class IfThen {

    public static void main(String[] args) {

        //// The if-then statement
        // the most basic of all control flow statements. It tells your program to execute a certain section of code, 
        // only if a certain test is true
    
        boolean isAlien = false;

        // if isAlien is false
        if (isAlien == false) {
            System.out.println("It is not an Alien.");
        } else {
            System.out.println("We have an Alien.");
        };

        // simplified way of saying (isAlien == false)
        if (!isAlien) {
            System.out.println("We have an alien");
        } else {
            System.out.println("No Alien here!");
        };

        // Conditionals
        boolean isAlien2 = false;
        if (isAlien2 == false)
            System.out.println("it is not an alien, Again...");

        // simplified way of saying (isAlien2 == false)
        if (!isAlien2) {
            System.out.println("It is not an alien 2...");
        } else {
            System.out.println("It is an alien, 2.");
        };

        // simplified way of saying (isAlien2 == false)
        if (isAlien2 == true) 
            System.out.println("It is not an alien 2...");
            System.out.println("Will execute everytime the program is run, true/false, because we are not using code blocks");

        // Value of isAlien2
        System.out.println("The value if isAlien2... " + isAlien2);



    }
}