/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckynumbers;

/**
 *
 * @author Personal
 */
public class Luckynumbers {

   public  int LuckyNumbers(String str){
    int counter =0;
    char [] chararray = str.toCharArray();
   if ((chararray.length == 3) | (chararray.length == 7)){ // or use .equals()
          counter += 1;       
      }
      return counter;
    }
   
    public static void main(String[] args) {
        Luckynumbers obj = new Luckynumbers();
         int ReturnHolder;
         //change the range to however long you want it to be
         int range = 110;
         int sum = 0;
         int luckynumbercounter = 0;
         int  luckyrange = 100;
         //change the 1000 to whatever u range you want it to be
         while(luckyrange <= 100){
         luckynumbercounter = luckynumbercounter + 2;
         
         luckyrange =  luckyrange * 10;
         }
         
        for(int i=100; i <= range;i++){
    String k = new Integer(i).toString();
       ReturnHolder = obj.LuckyNumbers(k);
       sum = ReturnHolder + sum;
        }
       sum =  luckynumbercounter + sum;
       System.out.println(sum);
    }
    
}
