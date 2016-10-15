/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertbits;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class InsertBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
           System.out.println("Enter the first integer(M) :"); 
           int M = sc.nextInt(); 
            System.out.println("Enter the second integer(N) :"); 
            int N = sc.nextInt(); 
            System.out.println("Enter ending bit (i) :"); 
            int i = sc.nextInt();
            System.out.println("Enter starting bit (j) :"); 
            int j = sc.nextInt();

            //System.out.println("First number in Binary "+Integer.toBinaryString(M));
            //System.out.println("Second number in Binary "+ Integer.toBinaryString(N));
            //divide and concure
            int mask = -1;//11111
            mask = mask << (j+1); ///shifting to the length of from 1111  1100 
            mask = ~mask;       //not the mask 0011
           // System.out.println(Integer.toBinaryString(mask));
            int d = N | ((M << i) & mask);//and with the mask
           String binaryvalue = Integer.toBinaryString(d);
            int decimalvalue =  Integer.parseInt(binaryvalue, 2);
           // System.out.println("The  number in binary is :" + Integer.toBinaryString(d));
             System.out.println("The  number in decimal is :" + decimalvalue);
    }
    
}
