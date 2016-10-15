/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acountingsheep;

import java.util.*;
import java.math.*;

/**
 *
 * @author Personal
 */
public class ACountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Scanner input = new Scanner(System.in);
       //int testCases = input.nextInt();
      
       Hashtable CheckSleep = new Hashtable();
       //populate the key for hashtable
       for(int j=0; j < 10;j++){
           CheckSleep.put(j,"null");
           
       }
       //System.out.println(CheckSleep);
       int number = 200;
       int countFull = 0;
       int divideTen =number;
       while(divideTen != 0){
            System.out.println(ReturnDigtis(divideTen));
            if(!(CheckSleep.containsValue(ReturnDigtis(divideTen)))){
                if((CheckSleep.containsKey(ReturnDigtis(divideTen)))){
                    countFull++;
                    CheckSleep.put(ReturnDigtis(divideTen), ReturnDigtis(divideTen));
                 }
            }
            divideTen = divideTen/10;
       }
       //when countFull is 9 then all digits are cont
      System.out.println(countFull);
       /* 
       for(int i =0;i< testCases; i++){
            if(number == 0){
                System.out.println("INSOMNIA");
            }else{
              int j =1;
            
                number = number *j;
                j++;
              }
            }
        */
       }
   public static int ReturnDigtis(int number){
      int  modTen=0;
      int divideTen =number;
        while(divideTen != 0){
                modTen = divideTen%10;
                break; 
        }
    return modTen;
     } 
}
 
    

