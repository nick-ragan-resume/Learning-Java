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

        // if isAlien is opposite the current value
        if (!isAlien) {
            System.out.println("We have an alien");
        } else {
            System.out.println("No Alien here!");
        };

        
    }
}