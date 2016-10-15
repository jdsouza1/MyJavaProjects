/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionarraysum;

import java.util.Hashtable;

/**
 *
 * @author Personal
 */
public class MillionArraySum {

    /**
     * Find 2 numbers in a array that add up to 100 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arry = new int[1000000];
        int sum =0;
        int keyValue =0;
        Hashtable FindSum = new Hashtable();
        for(int i=0;i< 1000000;i++){
        arry[i] = (int) Math.ceil(Math.random() * 100);
        }
        
        
        for(int j=0;j<arry.length;j++){
            if(FindSum.containsKey(arry[j])){
               keyValue = (int) FindSum.get(arry[j]);
               sum = keyValue + arry[j];
               System.out.println("Array Value "+ arry[j] + " Key Found  " + FindSum.get(arry[j]) + " Sum = " + sum);
           }else{
               FindSum.put(100-arry[j],arry[j]);
            }
        }
        
            
    }
    
}
