/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10001st.prime;

/**
 *
 * @author Personal
 */
public class Prime {

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int counter=0;
      int primeNumber =0;
      while(counter <= 10001){
          for(int i=3;i<=10000000;i++){
         if(isPrime(i) == true){
          primeNumber =i;
          
          }
          counter++;
          }
      
      }
        System.out.println(primeNumber);
        
    }
  private static boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
     }
}
