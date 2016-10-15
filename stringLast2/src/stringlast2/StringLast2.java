/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlast2;

/**
 *
 * @author Personal
 */
public class StringLast2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    last2("cool");
    }
    
    public static int last2(String str) {     
            int count=0;
            int lastindex = str.length();
            String find = str.substring(lastindex-1,lastindex);
            if(str == ""){
                    return count;
            }
            for(int i=0;i<lastindex-1;i++){
                if(str.substring(i, i+1).equals(find)){
                    count++;
               }
            } 
           return count;
              }

}
