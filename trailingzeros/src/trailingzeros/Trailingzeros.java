/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailingzeros;

import java.math.BigInteger;

/**
 *
 * @author Personal
 */
public class Trailingzeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int counter = 0;

        BigInteger fact = calculateFactorial(5);

        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            fact = fact.divide(BigInteger.TEN);
            counter = counter + 1;
        }
        System.out.println("The number of trailing zeros are " + counter);

    }

    public static BigInteger calculateFactorial(long number) {

        BigInteger result = BigInteger.ONE;

        for (long i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

}
