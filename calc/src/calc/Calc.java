/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Personal
 */
import java.util.*;
public class Calc {
 
 
  Stack s= new Stack();
 
 
 public String input(){
   System.out.println("Enter your prefix notation : ");
  Scanner input = new Scanner(System.in);
  String str = input.next();
  return str;
 }
 
 
 
 
 
 public void  toPostfix(String str){
     String st = " ";   
      
   str = str.replaceAll("\\s","");   //removes all white space from String
   str = str.toLowerCase();
   str.split(st);
    //System.out.print(str);
 System.out.println(st);
 }
 
 public void hasproriety(char a, char b){
 if(a >= b){
 s.pop();
 }
 else{
 s.push(b);
   }

 }
 
 
 
 //Method to verify whether a character is an operator or not.
   public Boolean isOperator(char str){
   switch(str){
      
    case '+':  return true;
    case '-': return true;
    case '/': return true;
    case '%': return true;
    case '*': return true;
    default: return false;
           
       }
 
   } 
 
   
 
 
 public static void main(String[] args) {    
       Calc obj = new Calc();
       obj.toPostfix(obj.input());       
}
        
        // Let's add some items to it
   //             for (int i = 1; i <= 10; i++)
   //             {
      //                  s.push ( new Integer(i));
    //            }

                // Last in first out means reverse order
       //         while (!s.empty())
         //       {
         //               System.out.print ( s.pop() );
         //               System.out.print ( ',' );
        //        }

                // Empty, let's lift off!
         //       System.out.println (" LIFT-OFF!");
    
    
 
}