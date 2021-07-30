// Ternary Operator 



public class TernaryOperator {
    

    //// The ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition
    // It's a shortcut of the if-then-else statement
    public static void main(String[] args) {
        
        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("We had a car");
        } else {
            System.out.println("No car was found");
        }


        int ageOfClient = 15;
        int eighteen = 18;
        boolean isEighteenOrOver = (ageOfClient > eighteen) ? true : false;
    
        if (isEighteenOrOver) {
            System.out.println("Over 18");
        } else {
            System.out.println("Under 18");
        }

    }
}
