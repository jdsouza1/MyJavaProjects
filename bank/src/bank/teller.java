
package bank;
/*
creates getters and setters for requried variables
*/
public class teller{
  
  int totalcustomerperteller;
 boolean telleraviablity;
 //setter
  public void booltellers(boolean tellersetter) {
        this. telleraviablity = tellersetter;
    }
  //getter
  public boolean booltellers() {
       return telleraviablity;
    }
  //setter
  public void totalcustomers(int customersum) {
        this.totalcustomerperteller = customersum;
    }
  //getter
   public int totalcustomers() {
      return  totalcustomerperteller;
    }
   
    /*
    pre- condtion 
    the method takes in a time and makes a teller wait till he/she  avaiabile
    */
     public boolean isAvaiable(int time) throws InterruptedException {
 
 if (time == 0){
  
     return true;
 }
 else
 {
 // pauses for 1 second   
 Thread.sleep(2);
  return isAvaiable(time - 1);
  
  }
 }   
}
 /*
    post-condtion 
The method return true when a teller  avaiabile

*/

 
 