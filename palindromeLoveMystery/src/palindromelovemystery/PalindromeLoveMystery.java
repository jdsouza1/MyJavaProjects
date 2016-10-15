/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromelovemystery;

import java.util.*;

/**
 *
 * @author Personal
 */
public class PalindromeLoveMystery {

    /**
     * @param args the command line arguments
     */
      static boolean isPal(String input,int start,int end,boolean c){
      while(start < end){
      String startLetter = input.substring(start, start+1);
       String endLetter = input.substring(end, end+1);
       if(startLetter.equals(endLetter) == false){
       c = false;
       break;
       }
     start++;
      end--;
      }
      return c;
      }
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int noOfTestCases = input.nextInt();
            int StartPositon = 0;
            int endPosition;
            int counter = 0;
            for(int i= 1;i<=noOfTestCases;i++){
                boolean pali = true;
            String inputTestString = input.next();
            endPosition= inputTestString.length()-1;
           pali = isPal(inputTestString,StartPositon, endPosition, pali);
            System.out.println(pali);
     
            
            while(pali == false){
             String value = inputTestString; 
             int charValue = value.charAt(endPosition);
             String next = String.valueOf( (char) (charValue - 1)); 
             String instert = value.substring(0, endPosition - 2) + next;
      
             pali = isPal(next,StartPositon, endPosition, pali);
            }
            
//decrement       
 String value = "C"; 
int charValue = value.charAt(0); 
String next = String.valueOf( (char) (charValue + 1)); 
System.out.println(next);
            
            
            }
            
            
    }
    
}
