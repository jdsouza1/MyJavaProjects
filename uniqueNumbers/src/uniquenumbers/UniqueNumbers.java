/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquenumbers;

/**
 *
 * @author Personal
 */
public class UniqueNumbers {

    /**
     * @param args the command line arguments
     */
    
    public  int uniqueNumbers(String str){
    int counter =0;
    char [] chararray = str.toCharArray();
    
    for (int j=0;j<chararray.length;j++) {
    for (int k=j+1;k<chararray.length;k++) {
        if (chararray[k] ==chararray[j]){ // or use .equals()
            counter += 1;
       
          }
        
       }   
 
    }
    return counter;
    }  
    
    
    public static void main(String[] args) {
        //0-1000000
         UniqueNumbers obj = new UniqueNumbers();
         int j;
         int range =20;
         int sum = 0;
        for(int i=0; i <= range;i++){
    String k = new Integer(i).toString();
       j = obj.uniqueNumbers(k);
       sum = j + sum ;
        }
       System.out.println(range-sum);
            
    }
    
}
