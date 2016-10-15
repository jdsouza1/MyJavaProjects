/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenunder10billion;

/**
 *
 * @author Personal
 */
import java.math.*;

public class EvenUnder10Billion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //n/2 (n/2+1);  
        //summation of all natural numbers
        //
        //if you want the summation of a particular number take that number and divide it by n
        //for example n/3(n/3+1)/3
        BigInteger max = new BigInteger("10000000000");
        BigInteger sum = BigInteger.ZERO;
        //3
        //n*2  3(4).12
        BigInteger Outnumber = max.divide(BigInteger.valueOf(2));
        BigInteger Innumber = Outnumber.add(BigInteger.valueOf(1));
        sum = Outnumber.multiply(Innumber);       
        System.out.println(sum);
    }
    
}
