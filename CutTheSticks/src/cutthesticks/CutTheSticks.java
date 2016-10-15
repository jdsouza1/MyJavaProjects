/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutthesticks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class CutTheSticks {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
            int arrayLength= input.nextInt();
            
           int[] array = new int[arrayLength];
           
            for(int i=0;i<arrayLength;i++){
            array[i]=input.nextInt();  
            } 
           // System.out.println("The smallest vaule in array is " + SmallestValue(array));
            
             int currentSmallval =SmallestValue(array);
            // int counter =0;
          //  System.out.println("The largest index value is " + LargestValue(array));
              int largestIndexVal = LargestValue(array);
            
              while(array[largestIndexVal] != 0){
                  //counter =0;
                   System.out.println("The current array is " + Arrays.toString(array));
                  currentSmallval =  SmallestValue(array);
                 System.out.println("The current smallest value is " + currentSmallval);
              for(int i=0;i<arrayLength;i++){
                  if(array[i] != 0){
              array[i] =array[i] - currentSmallval;
            //  counter++; 
                  }
                }
               //System.out.println("The number of sticks cut were " + counter);
             }
              System.out.println("The updated array is " + Arrays.toString(array));
              
   }
    //returns smallest value of a array
    static int SmallestValue(int a[]){
    int smallest =a[0];
    Arrays.sort(a);
    int arrayLength = a.length;
     for(int i=0;i<arrayLength;i++){    
         if(a[i] == 0){
         continue;
         }
         else if(a[i] <= smallest){
                smallest = a[i];
             }
         }
        return smallest;
    }
    //returns the largest index vaule
      static int LargestValue(int a[]){
    int largest =0;
   int index =0;
    int arrayLength = a.length;
     for(int i=0;i<arrayLength;i++){
             if(a[i]>= largest){
              largest = a[i];
                index =i;
            }   
         }
     
        return index;
    }
    
    
}
