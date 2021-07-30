// Logical Operators

public class LogicalOperator {

    public static void main(String[] args) {

        // != (not equal)
        // >= (greater than or equal)
        // <= (less than or equal)
        // < less than
        // > greater than
        // && left and right operand equal true
        // & bitwise AND
        // || left or right operand equal true
        // | bitwise OR

        int player1 = 50;
        int player2 = 60;

        // AND operator
        if (player1 > player2 && player1 < 100) {
            System.out.println("Player1 is greater than player2 but less than a perfect score of 100.");
        } else if (player1 > player2 && player1 == 100) {
            System.out.println("Player1, your score was perfect and you won.");
        } else {
            System.out.println("Player1, you lost... ");
        }

        // OR operator
        if ((player1 > 70) || (player2 > 70)) {
            System.out.println("One of the players is greater than 70");
        } else {
            System.out.println("Both players scored less than 70.");
        }

        //// Assignment Operator VS Equals to Operator
        //

        // Assignment Operator is =
        // Equals to Operator is ==

        int newValue = 50;

        // this code gives an error because the equals sign is assigning/declaring a
        // value and not comparing a boolean
        // if (newValue = 50) {
        // System.out.println("This is an error");

        if (newValue == 50) {
            System.out.println("This works correctly ");
        }

        //// This will give an error because we take a boolean value and try to reassign a different value in an if statement
        boolean isCar = false;
        // if (isCar = true) {
        //     System.out.println("This is not supposed to happen.");
        // }

        isCar = true;
        if (isCar == true) {
            System.out.println("This will run");
        }

        isCar = true;
        if (isCar) {
            System.out.println("This will run");
        }

        


    }
}
