// Chars and Booleans


class CharBoolean {

    public static void main(String[] args) {


        //////////////////////////////////////////////////////////////////////////////
        // Chars
        // Similar but different than string // it can only store a single character // has single quotes
        // Chars used to be more popular in the 90's when you needed to save memory but are not needed as much today
        // Use case is to store last keypress in a game and store data in Array's
        // In terms of storage - a Char is 2 bytes or 16 bits so it has a width of 16
        
        char myChar = 'D';
        char myUnicode = '\u0044'; // unicode for D

        System.out.println(myChar);
        System.out.println(myUnicode);

        //////////////////////////////////////////////////////////////////////////////
        // Booleans

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);

        // Check customer age
        int myCustomerAge = 17;
        boolean customerAgeCheck = myCustomerAge > 18;
        System.out.println(customerAgeCheck);

    }
}