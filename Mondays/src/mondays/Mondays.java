/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mondays;

/**
 *
 * @author Personal
 */
import java.util.Calendar;
public class Mondays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // first monday of the year + 7 everytime
        
     Calendar date = Calendar.getInstance();
     date.set(2015, 2, 2);
    if(date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
        System.out.println("Gerard Pique was born on a Monday");
    }
    else{
    for(int i = 5; i < 208; i = i + 7){
        
    System.out.println(i);
          
         }
     }
    }
    
}
