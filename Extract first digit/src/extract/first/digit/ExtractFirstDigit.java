/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extract.first.digit;

import com.sun.org.apache.xpath.internal.axes.SubContextList;

/**
 *
 * @author Personal
 */
public class ExtractFirstDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 8173768;
        int log = (int)(Math.log10(number));
        int power = (int)(Math.pow(10, log-2));
        int extracted = number / power;
        System.out.println(extracted);
    }
    
}
