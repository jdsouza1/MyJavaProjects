/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lonely.integer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * solution 
 * a^a = 0 
and a^0 = a 
so if you have an element repeated 2n times, it's xor is 0. and the lonely element remains as it is.
 */
public class LonelyInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Enter array size");
        Scanner input = new Scanner(System.in);
            int arrayLength= input.nextInt();
            
           int[] array = new int[arrayLength];
           int number=0;
            for(int i=0;i<arrayLength;i++){
            array[i]=input.nextInt();
            
            } 
           // System.out.println("Array before sort " + Arrays.toString(array));
            Arrays.sort(array);
           //  System.out.println("Array after sort " + Arrays.toString(array));
            if(arrayLength % 2 != 0){
            for(int i=0;i<arrayLength;i++){
              number = number ^ array[i];
                }
             }
              System.out.println("The lonely number is " + number);
         }    
      }

            
            
            
    
    

