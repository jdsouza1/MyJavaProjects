/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isnegative;

/**
 *
 * @author Personal
 */
public class IsNegative {

    /**
     * @param args the command line arguments
     */
    
    public boolean isNegative(int j){
    if(j <= -1){
        return true;
        }
    return false;
    }
    public static void main(String[] args) {
        IsNegative obj = new IsNegative();
       System.out.println(obj.isNegative(0)); 
 
   
    }
    
}
