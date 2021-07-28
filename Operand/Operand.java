// Operand, Operators, Expressions



public class Operand {

    public static void main(String[] args) {
        
        // An operand is a term used to describe any object that is manipulated by an operator

        // In this example:
        int myVar = 15 + 12; // + is the operator and 12 and 12 are the operands

        // variables used instead of literals are also operands
        int hoursWorked = 80;
        int hourlyRate = 43;
        double mySalary = hoursWorked * hourlyRate; // * is the operator and hoursWorked and hourlyRate are operands
        
        System.out.println(myVar);
        System.out.println(mySalary);


        // this is a comment

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result -1; //  3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 2;
        System.out.println("20 / 2 = " + result);

        result = result % 3; // remainder of (10 % 3) // 3 goes into 10, 3 times with a remainder of 1
        System.out.println("Remainder = " + result);


        //// Abbreviating Operators
        //
        result++; // increment 1 - is the same as result + 1  // this will add 1 to results
        System.out.println(result);

        result--; // decrement 1
        System.out.println(result);

        // result = result + 2
        result += 2; // this is shorthand for adding an explicit value
        System.out.println("+= " + result);

        /// result = result - 2
        result *= 2;
        System.out.println("*= " + result);

        /// result = result / 2
        result /= 2;
        System.out.println("/= " + result);

        /// result = result - 2
        result -= 2;
        System.out.println("-= " + result);


        
    }
}