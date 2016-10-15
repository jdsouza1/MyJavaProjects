// Name :- Joel Dsouza
package bank;
/*
Purpose of the program
You are to write a program name bank.java that simulates a bank. The program will prompt the user asking if they want to run the program again. If yes, then start the program over. If no, then terminate the program. 

The execution phase run for 2 minutes during which time customers will arrive randomly between 2 - 6 seconds and be placed into a queue. Each customer will have a property relating to the amount of time he/she wants to spend with a teller, which is to be randomly generated  to be between 2 and 5 seconds. 

There would be a maximum of 5 tellers to attend to the customers. When you start the simulation, each teller is occupied.You will need to generate a random time for each of the first 5 customers occupying the tellers at the begining of the 2 minutes simulation.

As they finish attending a customer (based upon the amount of time associated with each customer), that teller becomes available for the next customer in the queue. As a customer is removed from the queue and sent to an "available" teller, that Teller availability is set to "False". Customers are allocated to any one of the 5 tellers that becomes available, and so on... until the time of 2 minutes for the simulation is finished. 

If after 2 minutes, there are still customers in the queue, we would discard them, but still count them in the total count of customers that visited the bank. Also add into the total count of customer the first five customers that the tellers started out with as well as to the individual teller's total. 

*/

/*
Data structures used
Queues
*/
/*
how to use the program and expected input/output -
Hit the run button
expected input
yes or no for try again function
expected output
The total amount of customers that visited the bank for that 2 minutes. 
2. The total amount of customers that each teller helped. 
3. The total amount of time that each teller was occupied. 
4. The total amount of customers that did not get to see a teller. 

*/
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Bank {
     private int tellers=5; //total number of tellers 
    private static int bobcounter =1;
    private static int totalbobtime =0;
    private static int tomcounter =1;
     private static int totaltomtime =0;
   private int totalbankvist; //The total amount of customers that visited the bank for that 2 minutes.
   private int totalnoteller; // The total amount of customers that did not get to see a teller.
   public Queue<Customers> qe=new LinkedList<Customers>();
    
 //generates a random number between 2 to 5    
 public int randspentime() { 
 Random rand = new Random();   
 int random = rand.nextInt(4) + 2;
 System.out.println(random);
 return random;
 }

 
 
 /*
 pre-conditon
runs for 2 mins
 generates random arrival times
 generates random  times
 creates teller objects
 checks if a teller is avaiable
 sends customer to avaiable teller
 */
 public void execution() throws InterruptedException {
 long start = System.currentTimeMillis();
long end = start + 2*60*1000; // 60 seconds * 1000 ms/sec. 
while (System.currentTimeMillis() < end)
{
  //generates random arrrival time between 2 -5 
  Random rand = new Random();   
 int random = rand.nextInt(5) + 2; 
   // generates a customer
 
  Customers Joel = new Customers();
 
  Thread.sleep(random*1000);
  qe.add(Joel);
 System.out.println("customer walks in : " + qe.size());
 
 //generates a random number between 2 to 5 to simulate random 
 Random randTellertime = new Random();   
 int randtellertime = randTellertime.nextInt(5) + 2;
 //sets teller avaiablity to false because the teller start with one customer
boolean telleravaiable= false;  
teller bob = new teller();
teller tom = new teller();
teller jerry = new teller();
teller berry = new teller();
teller garry = new teller();

  if(!qe.isEmpty()){
//sets teller avaiablity to false because the teller start with one customer
 bob.equals(telleravaiable);
  tom.equals(telleravaiable);
  jerry.equals(telleravaiable);
berry.equals(telleravaiable);
berry.equals(telleravaiable);
if(bob.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 bob.equals(true);
 bob.totalcustomers(bobcounter++);
 totalbobtime = randtellertime + totalbobtime;
System.out.println("The customers that saw bob were :" + bob.totalcustomers());
System.out.println("Bobs total time taken : " + totalbobtime);
}else if(tom.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 tom.totalcustomers(tomcounter++);
 totalbobtime = randtellertime + totalbobtime;
 System.out.println("The customers that saw tom were :" + tom.totalcustomers());
 System.out.println("Toms total time taken : " + totaltomtime);
}
else if(jerry.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 jerry.totalcustomers(bobcounter++);
 totalbobtime = randtellertime + totalbobtime;
System.out.println("The customers that saw jerry were :" + jerry.totalcustomers());
 System.out.println("Jerry total time taken : " + totalbobtime);
}else if(berry.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 berry.totalcustomers(bobcounter++);
 totalbobtime = randtellertime + totalbobtime;
System.out.println("The customers that saw bob were :" + berry.totalcustomers());
 System.out.println("Bobs total time taken : " + totalbobtime);
}else if(garry.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 garry.totalcustomers(bobcounter++);
 totalbobtime = randtellertime + totalbobtime;
System.out.println("The customers that saw bob were :" + garry.totalcustomers());
 System.out.println("Bobs total time taken : " + totalbobtime);
}else if(garry.isAvaiable(randtellertime) == true)
{  
 Thread.sleep(randtellertime*1000);   
 qe.poll();
 garry.totalcustomers(bobcounter++);
 totalbobtime = randtellertime + totalbobtime;
System.out.println("The customers that saw bob were :" + garry.totalcustomers());
 System.out.println("Bobs total time taken : " + totalbobtime);
}

     }
  System.out.println("Total number of people that didnt see the teller " + qe.size());
 System.out.println("Total number of people that visted the bank  " + bob.totalcustomers());
    }
 }
  /*
 post contidtion
After 2 mins the generates total time per teller and generates the current size of the queue which is the number of people currently didnt get to see the teller 
 */
 
 //generates a random number between 2 to 6  
  public void randarrivetime() throws InterruptedException { 
 Random rand = new Random();   
 int random = rand.nextInt(5) + 2; 
 System.out.println(random);
 }
/* precondition
  Before entring this method the program doesnt have any opition to contunie run.
  The follow code gives the option to run the program again
  
*/
    public void tryagian() throws InterruptedException{
  System.out.println("Do you want to run again? (yes/no):  ");
Scanner sc = new Scanner(System.in);
String read = sc.nextLine();
if(read.contains("yes"))
{
  execution();
}
else {
exit();
}
}
    /* postcondition
  After this method runs the program either exits or runs agian
*/
    /* precondition
 This method terminates the program
*/
    public void exit(){
    System.out.println(0);
    }
    /* precondition
when this method is called the program is terminated
*/
    //calls the methods in the progam using an object and runs it
    public static void main(String[] args) throws InterruptedException {
  Bank obj = new Bank();
  obj.execution();
  obj.tryagian();
     
    }
    
}
