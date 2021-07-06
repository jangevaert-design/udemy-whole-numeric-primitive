package edu.cnm.deepdive;

public class WholeNumericPrimitive {

  public static void main(String[] args) {
    //long max = 123456789098; does not compile because the number is per default an int and this
    //number here is too large. Solution: turn it into a long.

    long max = 123456789098L;//capital or small L allowed but capital is better recognized.

    //int oct = 08; octal numbers are from 0 to 7 so 08 gives an error.
    int firstOct = 010; //is 8 in decimal.
    int secondOct = 022; // is 18 in decimal.

    int sumOct = firstOct + secondOct;
    System.out.println("firstOct = " + firstOct + ", secondOct = " + secondOct + " and sumOct is "
    + sumOct + " in decimal.");
    System.out.println("firstOct = " + Integer.toOctalString(firstOct) + ", secondOct = "
        + Integer.toOctalString(secondOct) + " and sumOct is " + Integer.toOctalString(sumOct)
        + " in octal numbers.");

    //hexadecimal (0 - 9 and A - F)
    int firstHex = 0xF; // 15 in decimal
    int secondHex = 0x1E; // 30 decimal (start from the right: E = 14 * (16 ^ 0) + 1 * (16 ^ 1) = 30.
    int sumHex = firstHex + secondHex;
    System.out.println("firstHex = " + firstHex + ", secondHex = " + secondHex + " and sumHex is " +
        sumHex + " in decimal.");
    System.out.println("firstHex = " + firstHex + ", secondHex = " + secondHex + " and sumHex is " +
        sumHex + " in decimal.");
    System.out.println("firstHex = " + Integer.toHexString(firstHex) + ", secondHex = "
        + Integer.toHexString(secondHex) + " and sumHex is " + Integer.toHexString(sumHex)
        + " in hexadecimal.");

    //binary are prefixed with 0b.
    int firstBinary = 0b1001; // 9 in decimal.
    int secondBinary = 0b0111;// 7 in decimal.
    int sumBinary = firstBinary + secondBinary;
    System.out.println("firstBinary = " + firstBinary + ", secondBinary = " + secondBinary +
        " and sumBinary is " + sumBinary + " in decimal.");
    System.out.println("firstBinary = " + Integer.toBinaryString(firstBinary) + ", secondBinary = "
        + Integer.toBinaryString(secondBinary) + " and sumBinary is " + Integer.toBinaryString(sumBinary)
        + " in binary.");
  }

}
