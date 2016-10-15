/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascaltriangle;

/**
 *
 * @author Personal
 */
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //1     1  0
      //1 1    2
     //1 2 1   3
    //1 3 3 1
     String pervious = "1331";
     String next="";
     int triangleSize = 3;
     
        for(int i =1; i < 1;i++){
            next = next + pervious.charAt(i);
            System.out.println(next);
           }
        
    }
    
}
