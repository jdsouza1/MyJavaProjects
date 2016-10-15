package SmartWind;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

public class SmartWind {
    
    public static Scanner read;
    
    public static void main(String[] args) throws IOException { 
        
    try { 
        //Counts numbers in txt
        int counter = 0;
        //Sum of numbers in txt
        double sum = 0;
        //Line read in txt
        String line = null; 
 
    Scanner input = new Scanner(System.in); 

    //Prompts user to input file path
    System.out.println("Enter file path for desired input: "); 
    String fileName = input.nextLine(); 

    //Creates a fileReader
    BufferedReader in = new BufferedReader(new FileReader(fileName)); 

    //Itterate a loop until the end of the file is reached 
    while((line = in.readLine()) != null) { 

    //Add each line read to counter
    counter++; 

    //Find sum of all numbers 
    sum+=Double.parseDouble(line); 
    } 

    //Calculates the average 
    double average = sum/counter; 

    //Displays the output 
    System.out.println("The average of the data is: " + format(average)); 
    System.out.println("The sum of the data is: " + sum); 
    System.out.println("The number of wind points is " + counter); 

    } 
    
    catch (IOException e) { 
        System.out.println("I/O exception!"); 
    } 
} 

    //Formats the numbers as a decimal 
    public static String format(double number) { 
        DecimalFormat d = new DecimalFormat("0.00"); 
        return d.format(number); 
    } 
}
