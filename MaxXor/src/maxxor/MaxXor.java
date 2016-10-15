/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxxor;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
/*problem link
https://www.hackerrank.com/challenges/maximizing-xor
*/
public class MaxXor {

 static int maxXor(int l, int r) {
       
      int res = Integer.MIN_VALUE;
        for(int i = l; i <= r; i++){
            for(int j= l; j <= r; j++){
                int tmp = i ^ j;
                if(tmp>res)
                    res = tmp;
            }
        }
        return res;
      

    }
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
            
       }
    }
    

