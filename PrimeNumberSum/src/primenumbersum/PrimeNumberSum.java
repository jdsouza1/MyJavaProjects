/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbersum;

/**
 *
 * @author Personal
 */
public class PrimeNumberSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int divisor =0;
        int n =1;
        while(divisor != 60){     
      for(int i =1;i<=n;i++){
      if(n % i == 0){
           divisor++;
         }
      }
      n++;
        }
    System.out.println(divisor);
  
   }
}
