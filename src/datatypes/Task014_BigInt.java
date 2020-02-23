package datatypes;

import java.math.BigInteger;

public class Task014_BigInt {

    public static void main(String[] args) {
        
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger value is: " + number);
        long numberLong = number.longValue();
        System.out.println("Converted to long it is: " + numberLong);
        int numberInt = number.intValue();
        System.out.println("Converted to int is: " + numberInt);
        short numberShort = number.shortValue();
        System.out.println("Converted to short is: " + numberShort);
        byte numberByte = number.byteValue();
        System.out.println("Converted to byte is: " + numberByte);
        long numberLongExact = number.longValueExact();
        System.out.println("Converted to long exact is: " + numberLongExact);
    }
}
