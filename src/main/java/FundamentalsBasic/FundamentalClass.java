package FundamentalsBasic;

// I made this class to refresh my fundamentals knowledge.
//byte
//short
//char
//int
//long
//float
//double


import java.math.BigDecimal;
import java.math.RoundingMode;

public class FundamentalClass {
    public static void main(String[] args) {


//        System.out.println("Byte can hold 1 byte (8 bits) and its values are from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
//        byte byte1 = 1;
//        byte byte2 = 10;
//        byte byte3 = 127;
//        byte byte4 = (byte) (byte3 + 1 + 1);
//        byte byte5 = 8 / 3;
//
//
//        System.out.println();
//        System.out.println("byte1 = " + byte1);
//        System.out.println("byte2 = " + byte2);
//        System.out.println("byte3 = " + byte3);
//        System.out.println("byte4 = " + byte4);
//        System.out.println("byte5 = " + byte5);

//        System.out.println("Short can hold 2 bytes (16 bits) and its values are from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
//        short short1 = 1;
//        short short2 = 12345;
//        short short3 = 32767;
//        short shortTest =2;
//        //short short4 = 32767 + shortTest;  //pc jau izrēķināja, ka vairs nav short
//
//
//        System.out.println();
//        System.out.println("short1 = " + short1);
//        System.out.println("short2 = " + short2);
//        System.out.println("short3 = " + short3);
//        //System.out.println("short4 = " + short4);

////System.out.println("Character can hold 2 bytes (16 bits) and its values are from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
//        System.out.println("Character can hold 2 bytes (16 bits) and its values are from " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
//        char char1 = 'f';
//        char char2 = 'ñ';
//        char char3 = '™';
//        char char4 = 65;
//        char char5 = (char) (char4 + 1);
//
//        System.out.println();
//        System.out.println("char1 = " + char1);
//        System.out.println("char2 = " + char2);
//        System.out.println("char3 = " + char3);
//        System.out.println("char4 = " + char4);
//        System.out.println("char5 = " + char5);
//
//        //// Rich UTF-16 support example - printing surrogate pairs for emoji icons
//        //for (int codePoint = 0x1F600; codePoint <= 0x1F64F; ) {
//        //	System.out.print(Character.toChars(codePoint));
//        //	codePoint++;
//        //	if (codePoint % 16 == 0) {
//        //		System.out.println();
//        //	}
//        //}
//
//        System.out.println("Integer can hold 4 bytes (32 bits) and its values are from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
//        int int1 = 5;
//        int int2 = 3;
//        byte byte1 = 127;
//        byte byte2 = 127;
//        byte byte3 = (byte) (byte1 + byte2);
//        int int3 = byte1 + byte2;
//        int int4 = byte1 / byte2;
//        int int5 = int1 / int2;
//        int int6 = Integer.MAX_VALUE;
//        int int7 = int6 + 1;
//
//        System.out.println();
//        System.out.println("int1 = " + int1);
//        System.out.println("int2 = " + int2);
//        System.out.println("byte1 = " + byte1);
//        System.out.println("byte2 = " + byte2);
//        System.out.println("byte3 = " + byte3);
//        System.out.println("int3 = " + int3);
//        System.out.println("int4 = " + int4);
//        System.out.println("int5 = " + int5);
//        System.out.println("int6 = " + int6);
//        System.out.println("int7 = " + int7);
//
//        int int8 = Integer.MAX_VALUE * Integer.MAX_VALUE;
//        System.out.println("int8 = " + int8);
//
//        //// Actual binary representation of int8 result - only last 32 significant bits will be used in
//        //// resulting Integer, hence rendering number 1 as a result.
//        //BigDecimal bigDecimal = new BigDecimal(Integer.MAX_VALUE);
//        //bigDecimal = bigDecimal.multiply(new BigDecimal(Integer.MAX_VALUE));
//        //System.out.println("decToBin(Integer.MAX_VALUE * Integer.MAX_VALUE) = " + decToBin(bigDecimal));
//    }
//
//
//    /**
//     * Support method to print binary number representation
//     *
//     * @param bigDecimal Number to be printed
//     * @return String containing 0's and 1's character sequence as binary param representation.
//     */
//    public static String decToBin(BigDecimal bigDecimal) {
//        String result ="";
//
//        BigDecimal copy = bigDecimal;
//        final BigDecimal zero = new BigDecimal(0);
//        while (zero.compareTo(copy) < 0) {
//
//            BigDecimal rem = copy.remainder(new BigDecimal(2));
//            result = rem.intValue() + result;
//            copy = copy.divide(new BigDecimal(2), RoundingMode.DOWN);
//        }
//
//        return result;
//    }
//
//        System.out.println("Long can hold 8 bytes (64 bits) and its values are from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
//        long long1 = Integer.MAX_VALUE;
//        long long2 = long1 * long1;
//        long long3 = Long.MAX_VALUE;
//        long long4 = 5 / 3;
//
//        System.out.println();
//        System.out.println("long1 = " + long1);
//        System.out.println("long2 = " + long2);
//        System.out.println("long3 = " + long3);
//        System.out.println("long4 = " + long4);


//

        //  public static void main(String[] args) {
        //    System.out.println("Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        //// Actual MIN_VALUE and MAX_VALUE representation in decimal (human-readable) format
        //System.out.println(
        //	"Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from \n" +
        //	new BigDecimal(Double.MIN_VALUE).toPlainString() + "\n" +
        //	" to \n" +
        //	new BigDecimal(Double.MAX_VALUE).toPlainString()
        //);
        ////
        //// Proper minimal and maximal value usage example in decimal (human-readable) format
        //System.out.println(
        //	"Double can hold " + (SIZE / 8) + " bytes (" + SIZE + " bits) and its values are from \n" +
        //	new BigDecimal(-Double.MAX_VALUE).toPlainString() + "\n" +
        //	" to \n" +
        //	new BigDecimal(Double.MAX_VALUE).toPlainString()
        //);

        double double1 = 1;
        double double2 = 2 / 3;
        double double3 = 0.1 + 0.2;

        System.out.println();
        System.out.println("double1 = " + double1);
        System.out.println("double2 = " + double2);

        // Why it is not 0.3: https://stackoverflow.com/a/27030789
        System.out.println("double3 = " + double3);
    }
}

