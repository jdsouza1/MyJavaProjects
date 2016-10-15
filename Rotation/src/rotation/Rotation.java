/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotation;

/**
 *
 * @author Personal
 */
public class Rotation {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //joeljoel
        System.out.println(isRotation("joel","joel"));
    }
    public static boolean isRotation(String s1, String s2) {
    if(s1.length() != s2.length()){
    return false;
    }
    //not of no such occurence -1
    if(((s1+s1).indexOf(s2) != -1)){
    return true;
    }
    return false;
    }
}
