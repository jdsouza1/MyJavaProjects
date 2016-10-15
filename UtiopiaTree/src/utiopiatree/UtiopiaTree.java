/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiopiatree;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class UtiopiaTree {
static int Springcycle(int a) {
        return a*2;
    } 
static int Summercycle(int a) {
        return a+1;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int numberofcycles = sc.nextInt(); 
        int treeheight=1;
        if(numberofcycles == 0){
            System.out.println(treeheight);
        }else
        if(numberofcycles == 1){
            System.out.println(Springcycle(treeheight));
        }
         for(int i = 0; i < numberofcycles; ++i){
            if(i%2!=0){
            treeheight= Summercycle(treeheight);
            }else{
             treeheight= Springcycle(treeheight);
            }
              
             }
         
    }
    
}
