// Float and Double 

public class FloatDouble {

    public static void main(String[] args) {

        System.out.println("Starting... ");


        int myIntValue = 5;

        System.out.println("Float Value... " + myIntValue);

        ////////////////////////////////////////////////////////////////////////////////
        // Float data type
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Min Float Value... " + myMinFloatValue);
        System.out.println("Max Float Value... " + myMaxFloatValue);

        float myFloatValue = 5.25f;
        float myFloatCastingValue = (float) 5.2567567;

        System.out.println("Float Value... " + myFloatValue);
        System.out.println("Float Casting Value... " + myFloatCastingValue);

        ////////////////////////////////////////////////////////////////////////////////
        // Double data type
        // Double is more precise than float
        // Double is faster on modern computers
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Min Double Value... " + myMinDoubleValue);
        System.out.println("Max Double Value... " + myMaxDoubleValue);

        double myDoubleValue = 5d;

        System.out.println("Double Value... " + myDoubleValue);

        ////////////////////////////////////////////////////////////////////////////////
        // Challenge
        // 1pound is equal to 0.45359237 of a kilogram

        // create a variable with the approprate type to store the number of pounds to be converted to kilograms
        double pounds = 200d;

        // calculate number of kilograms based on variable above and store the results into second variable with appropriate type
        double kilogram = (pounds * 0.45359237d);

        System.out.println("Kilogram results... " + kilogram);

        // print results

    }
}