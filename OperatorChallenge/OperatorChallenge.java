// Operator Challenge



public class OperatorChallenge {

    public static void main(String[] args) {

        //1. Create a double variable with a value of 20.00
        double varOne = 20.00d;

        //2. Create a second variable of type double with the value of 80.00
        double varTwo = 80.00d;

        //3. Add both numbers together and multiply by 100.00
        double valueTotal = (varOne + varTwo) * 100.00d;

        //4. Use remainder operator to figure out the remainder from the result of the operation in step 3 and 40.00.
        double remainderValue = valueTotal % 40.00d;
        System.out.println(remainderValue);

        //5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero
        boolean assignmentCondition = remainderValue > 0 ? false : true;

        //6. Output the boolean variable
        System.out.println(assignmentCondition);

        //7. Write an if-then that displays a message "Got some remainder" if the boolean in step 5 is not true. Don't be suprised if you see output 
        // for this step, where you might expect it not to show. 
        if (!assignmentCondition) {
            System.out.println("Got some remainder!");
        } else {
            System.out.println("We didn't find a remainder.");
        }

    
    }
}
