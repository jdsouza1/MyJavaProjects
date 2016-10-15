/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Personal
 */
import java.math.BigInteger;
import java.util.*;
public class Test {

   
    public static void main(String[] args) {
 //decrement the last index and inserts the string       
 String value = "abc"; 
 int endPosition = value.length() - 1;
     int charValue = value.charAt(endPosition);
String next = String.valueOf( (char) (charValue - 1)); 
      String instert = value.substring(1, endPosition) + next;
        System.out.println(instert);
        
 /*String value = "abd"; 
String lowestVaule = "a";
int lowValue = value.charAt(0); 
int charValue = value.charAt(2); 
String next = "";
System.out.println(charValue);
while(charValue != lowValue){
next = String.valueOf( (char) (charValue - 1)); 
charValue--;    
}
System.out.println(next);
    */
      }
   }


