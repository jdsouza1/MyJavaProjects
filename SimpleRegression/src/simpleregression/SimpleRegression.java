/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleregression;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
public class SimpleRegression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    File file = new File("C:\\Users\\Personal\\Desktop\\oculus\\data.txt");
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    DataInputStream dis = null;
    int fileCount=0;
    
    try {
      fis = new FileInputStream(file);
 
      // Here BufferedInputStream is added for fast reading.
      bis = new BufferedInputStream(fis);
      dis = new DataInputStream(bis);
 
      double [] outputarray;
      // dis.available() returns 0 if the file does not have more lines.
      while (dis.available() != 0) {
 
      // this statement reads the line from the file and print it to
        // the console.
        StringTokenizer st = new StringTokenizer(dis.readLine());
          String newString = st.nextToken();
          StringTokenizer tokenizer = new StringTokenizer(newString,"=,;");
          tokenizer.nextToken();
          tokenizer.nextToken();
          double d1 = Double.parseDouble(tokenizer.nextToken());
          double d2 = Double.parseDouble(tokenizer.nextToken());
          double d3 = Double.parseDouble(tokenizer.nextToken());
          double d4 = Double.parseDouble(tokenizer.nextToken());
          double d5 = Double.parseDouble(tokenizer.nextToken());
          fileCount++;
         // outputarray = {d1,d2,d3,d4,d5};
          
        System.out.println(dis.readLine());
        
      }
    System.out.println("FileCount"+ fileCount);
      // dispose all the resources after using them.
      fis.close();
      bis.close();
      dis.close();
 
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
    

