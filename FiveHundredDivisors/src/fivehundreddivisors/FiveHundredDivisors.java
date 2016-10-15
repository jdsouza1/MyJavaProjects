/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivehundreddivisors;

/**
 *
 * @author Personal
 */
public class FiveHundredDivisors {

    /**
     * @param args the command line arguments
     * http://www.stealthcopter.com/blog/2009/11/python-factors-of-a-number/
     * find a number with 500 factors
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =1;
        int number =0;
        while(factors(number) < 500){
        number +=i;
        i++; 
        }
 //     long count = factors(1);
      
        System.out.println(number);
        
        //caculates runtime for the program
        long startTime = System.currentTimeMillis();
       long endTime   = System.currentTimeMillis();
       long totalTime = endTime - startTime;
        System.out.println("Total time in milliseconds is " + totalTime);
       
    }
    //returns the number of factors for a given input  
    static long factors(int number){
     long count =0;
     long sqrt = (long) Math.sqrt(number);
     for(int i=1;i<=sqrt;i++){
     if(number % i == 0){
        count+=2;
       }
   }
    if(sqrt * sqrt ==number){
    count--;
    }
     
      return count;
    }
    
}
   