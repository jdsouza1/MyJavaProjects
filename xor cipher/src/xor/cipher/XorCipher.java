/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xor.cipher;

/**
 *
 * @author Personal
 */
import java.math.BigInteger;
        
public class XorCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String CTtxt ="0000000000001a000d00";
        String binaryCTxt =hexToBin(CTtxt);
       
        //converts the hex to string
        StringBuilder output = new StringBuilder();
        String tempStr ="";
    for (int i = 0; i < CTtxt.length(); i+=2) {
        String str = CTtxt.substring(i, i+2);
        output.append((char)Integer.parseInt(str, 16));
        tempStr = tempStr + output;
         
    }
    
    System.out.println(tempStr);
         String keyy = "hacker";
         
         
        char [] key={'h','a','c','k','e','r'};
              String Msg = "";
              int xor;
              char temp;
              //converts key to binary char array
            char [] charKey={};
              for(int x =0; x < key.length;x++){
                String binarykey = Integer.toBinaryString(key[x]);
                //System.out.println(charKey);
              }
              
              
              int count = 0;  
        for(int i =0; i < CTtxt.length();i++){
                   //String and char
            xor = CTtxt.charAt(i) ^ (key[count]);
            
          System.out.println(xor);
            temp = (char)xor;
            Msg = Msg + temp; 
            count++;
            if(count >= 6){
            count =0;
            }
        }
      System.out.println(Msg);
      
       // System.out.println(hexToBin(CTtxt));
    }
    
    static String hexToBin(String s) {
  return new BigInteger(s, 16).toString(2);
  }
    

}