// Bytes Short Int Long


public class byteShortIntLong {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////////////
        // Integer data type
        int myValue = 10000;

        // -2147483648
        int myMinValue = Integer.MIN_VALUE;
        // 2147483647
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println(myValue);
        System.out.println("Min value... " + myMinValue);
        System.out.println("Max Value... " + myMaxValue);

        // underflow and overflow of min and max... switches positive or negative number
        System.out.println("Busted Min Value... " + (myMinValue - 1));
        System.out.println("Busted Max Value... " + (myMaxValue + 1));

        // you can format numbers with underscores if it is easier to read
        int myFormatedInt = 2_147_483_647;
        System.out.println(myFormatedInt);


        //////////////////////////////////////////////////////////////////////////////
        // Byte data type

        // -32768
        byte myMinByteValue = Byte.MIN_VALUE;
        // 32767
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min Byte Value... " + myMinByteValue);
        System.out.println("Max Byte Value... " + myMaxByteValue);

        //////////////////////////////////////////////////////////////////////////////
        // Short data type

        // -128
        short myMinShortValue = Short.MIN_VALUE;
        // 127
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min Short Value... " + myMinShortValue);
        System.out.println("Max Short Value... " + myMaxShortValue);

        //////////////////////////////////////////////////////////////////////////////
        // Long data type

        // when assigning a long value put an 'L' at the end of it:
        // java will consider all numbers as integers unless you force it to be a long with the 'L'
        long myLongvalue = 100L;

        // -9223372036854775808
        long myMinLongValue = Long.MIN_VALUE;
        // 9223372036854775807
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("My Long Value... " + myLongvalue);
        System.out.println("Min Long Value... " + myMinLongValue);
        System.out.println("Max Long Value... " + myMaxLongValue);
    }
}