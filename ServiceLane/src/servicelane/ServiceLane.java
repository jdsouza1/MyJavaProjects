/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicelane;

/**
 *
 * @author Personal
 */
import java.io.*;
import java.util.*;

public class ServiceLane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first input is the length of the width array
        //second input is the number of test cases
        //get the smallest number of the given in range in array width
        //1 bike
        //2 car
        // 3 bus
        int Smallnumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
         int  arrayLength = input.nextInt();
        
        System.out.println("Enter number of test cases");
        int testCases = input.nextInt();
        
         Scanner arrayNumbers = new Scanner(System.in);
        int[] ServiceLaneIntArray = new int[arrayLength];
        
        for(int i=0;i<arrayLength;i++){
         System.out.println("Fill the array with numbers between 1 and 3");
ServiceLaneIntArray[i]= arrayNumbers.nextInt();
            
        }
        
         for(int j=0;j<=testCases;j++){
           Scanner EnterLane =  new Scanner(System.in);
            System.out.println("Enter the first number of the test case");
           int firstNumber = EnterLane.nextInt();
             System.out.println("Enter the second number of the test case");
            int secondNumber = EnterLane.nextInt();
             
            Smallnumber = smalval(firstNumber,secondNumber,ServiceLaneIntArray);
            System.out.println("The smallest value in that range is " + Smallnumber);
    }
    
   }
      static int smalval(int a,int b,int [] array){
    int smallest =4;
    while(a <= b){
    if(array[a] <= smallest){
    smallest = array[a];
       } 
     a++; 
    }
    return smallest;
  }

  
}
