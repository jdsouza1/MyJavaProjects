/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisp;

import java.util.*;
/**
 *
 * @author Personal
 */

    /**
     */
public class Lisp{
    public static void main(String[] args){
    int [] arry = {1,2,3,4,5,6};   
    int i=0;
    int j=1;
    ArrayList<Integer> min = new ArrayList<>();
    ArrayList<Integer> max = new ArrayList<>();
   while(j < arry.length){ 
     if(arry[i] > arry[j]){ //bz we are comparing only 2 elements
            max.add(arry[i]);
            min.add(arry[j]);
            }else{
            max.add(arry[j]);
            min.add(arry[i]);
            }   
     i++;
     j++;
   }    
    //splitAndCompare(arry,i,j,max,min);
    System.out.println("MinList" + Arrays.toString(min.toArray()));
    System.out.println("MaxList" + Arrays.toString(max.toArray()));
    int maxium = Collections.max(max);
    int minium = Collections.min(min);
    System.out.println("Max number " + maxium);
    System.out.println("Min number " + minium);          
    }
}
    
    
    


  