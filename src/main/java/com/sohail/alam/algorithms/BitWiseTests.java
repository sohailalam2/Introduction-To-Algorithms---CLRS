package com.sohail.alam.algorithms;

/**
 * Created by sohail.alam on 11/2/14.
 * <p/>
 * This class mainly demonstrate the use of bitwise operations in Java
 * <p/>
 * Source: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
 * Source: http://www.tutorialspoint.com/java/java_bitwise_operators_examples.htm
 */
public class BitWiseTests {


    private static final int A = 60;	/* 60 = 0011 1100 */
    private static final int B = 13;	/* 13 = 0000 1101 */

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");
        System.out.println("A = 60   =>  0011 1100");
        System.out.println("B = 13   =>  0000 1101");
        System.out.println("-------------------------------------------------------");

        bitwiseComplement();

        bitwiseShifts();

        allInOne();

    }

    /**
     * The unary bitwise complement operator "~" inverts A bit pattern;
     * it can be applied to any of the integral types, making every "0" A "1"
     * and every "1" A "0".
     * <br />
     * For example, A byte contains 8 bits; applying this operator to A value
     * whose bit pattern is "00000000" would change its pattern to "11111111".
     */
    private static void bitwiseComplement() {
        System.out.println("======================================================");
        System.out.println("Bitwise complement operator '~'");
        System.out.println("Operation: ~A  => Result: " + ~A);  // -61
        System.out.println("Operation: ~-A => Result: " + ~-A); //  59
        System.out.println("Operation: ~B  => Result: " + ~B);  // -14
        System.out.println("Operation: ~-B => Result: " + ~-B); //  12
        System.out.println("======================================================");
    }

    /**
     * The signed left shift operator "<<" shifts A bit pattern to the left,
     * and the signed right shift operator ">>" shifts A bit pattern to the right.
     * <br />
     * The bit pattern is given by the left-hand operand, and the number of
     * positions to shift by the right-hand operand.
     * <br />
     * The unsigned right shift operator ">>>" shifts A zero into the leftmost position,
     * while the leftmost position after ">>" depends on sign extension.
     */
    private static void bitwiseShifts() {
        System.out.println("======================================================");
        System.out.println("Bitwise shift operations");
        System.out.println("Operation: A<<1 => Result: " + (A << 1)); // 120
        System.out.println("Operation: A<<2 => Result: " + (A << 2)); // 240
        System.out.println("Operation: A<<3 => Result: " + (A << 3)); // 480
        System.out.println("......................................................");
        System.out.println("Operation: A>>1 => Result: " + (A >> 1)); // 30
        System.out.println("Operation: A>>2 => Result: " + (A >> 2)); // 15
        System.out.println("Operation: A>>3 => Result: " + (A >> 3)); // 7
        System.out.println("......................................................");
        System.out.println("Operation: A>>>1 => Result: " + (A >>> 1)); // 30
        System.out.println("Operation: A>>>2 => Result: " + (A >>> 2)); // 15
        System.out.println("Operation: A>>>3 => Result: " + (A >>> 3)); // 7
        System.out.println("======================================================");
    }

    /**
     * The bitwise & operator performs A bitwise AND operation.
     * <br />
     * The bitwise ^ operator performs A bitwise exclusive OR operation.
     * <br />
     * The bitwise | operator performs A bitwise inclusive OR operation.
     */
    private static void allInOne() {

        System.out.println("======================================================");
        System.out.println("All in One Example...");
        System.out.println();
        System.out.println("A & B    =>  0000 1100  =  " + (A & B));   // 12  = 0000 1100
        System.out.println("A | B    =>  0011 1101  =  " + (A | B));   // 61  = 0011 1101
        System.out.println("A ^ B    =>  0011 1101  =  " + (A ^ B));   // 49  = 0011 0001
        System.out.println("~A       =>  1100 0011  = " + (~A));      // -61 = 1100 0011
        System.out.println("A << 2   =>  1111 0000  = " + (A << 2));  // 240 = 1111 0000
        System.out.println("A >> 2   =>  0000 1111  =  " + (A >> 2));  // 215 = 0000 1111
        System.out.println("A >>> 2  =>  0000 1111  =  " + (A >>> 2)); // 215 = 0000 1111
        System.out.println("======================================================");
    }
}
