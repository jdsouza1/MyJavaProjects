/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xorcipherjackssolution;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class XorCipherJacksSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
String test = scan.nextLine();
String key = scan.nextLine();
for(int i = 0; i < test.length();i+=2){
int c = 16*charToHex(test.charAt(i)) + charToHex(test.charAt(i+1));
int out = c^key.charAt((i/2)%key.length());
System.out.print((char)out);
}
scan.close();
}

public static int charToHex(char c){
if(c >= '0' && c <= '9') return (c-'0');
if(c >= 'a' && c <= 'f') return (c-'a'+10);
return -1;
}
    }
    

