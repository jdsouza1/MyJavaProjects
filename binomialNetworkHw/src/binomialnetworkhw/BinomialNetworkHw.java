/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomialnetworkhw;

/**
 *
 * @author Personal
 */
    import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BinomialNetworkHw {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
    int N=40;
    int n=10;
    double p= 0.1;
    //gives a  4 decimal unit precision
    while(n <= 40){
    MathContext mc = new MathContext(4); 
    //double result=factorial(N)/(factorial(n))*(factorial(N-n)) * (Math.pow(p, n))*(Math.pow(1-p,N-n));
    String resultN = factorial(N);
    String resultn = factorial(n);
    String subResult = factorial(N-n);
   //convert string to bigInteger 
    BigInteger factN = new BigInteger(resultN);
    BigInteger factn = new BigInteger(resultn);
    BigInteger subfact = new BigInteger(subResult);
   
    //convert 2nd half of equation to bigdecimal 
    double part2 = (Math.pow(p, n))*(Math.pow(1-p,N-n));
    BigDecimal Part2 = BigDecimal.valueOf(part2);
   
    //
    BigInteger part1 = factN.divide(factn.multiply(subfact));
    BigDecimal Part1 = new BigDecimal(part1);
    BigDecimal sum = new BigDecimal(0);
    BigDecimal finalresult = Part1.multiply(Part2,mc);
      sum = finalresult.add(sum);
   System.out.println(sum); 
       n++;
       }
    }
  public static String factorial(int n) { 
     BigInteger fact = new BigInteger("1");
     BigInteger bigInt = new BigInteger(String.valueOf(n));
       for (BigInteger i = BigInteger.valueOf(1);i.compareTo(bigInt) <= 0;  i = i.add(BigInteger.ONE)) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
            return fact.toString();
   }
  
}
