/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romantranslate;

/**
 *
 * @author Personal
 */
public class RomanTranslate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      // under 4000 and in the 1000
        //extract the 1000 place.take the number divided by a 1000.Add Ms accordingly
        //extract the hundereds place.take the number divided by a 100.Add the   accordingly
       //add 1 to all my index
        
        int year = 1246;
        String putItAllTogether = "";
  //1-9
  String[] RomanUnits = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    
   //1-9
   String[] RomanTens = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
  
   //1-9                      
   String[] RomanHundereds = {"C","CC","CCC","D","DC","DCC","DCCC","CM"};
   
   String RomamMilliumen = "M";
   

   String yearStr = Integer.toString(year);
   char thousandChar = yearStr.charAt(0);
  // System.out.println(thousandChar);
   
   // convert to ascii  
    int CharAscci   = (int) thousandChar;
    // convert to integer
    int ThousandIndex = Character.getNumericValue(CharAscci);
 
   String Milliumen = "";
  // System.out.println(ThousandIndex);
  if(yearStr.length() == 4 ){
   for(int i = 0; i < ThousandIndex;i++){
      Milliumen +=RomamMilliumen; 
   
        }
  }
     //  System.out.println(Milliumen);
       

    
   //Unit Place
   
  
   String unit ="";
   String yearUStr = Integer.toString(year);
   //System.out.println(yearUStr.length());
   char UnitChar = yearUStr.charAt(yearUStr.length()-1);
   
   // convert to ascii  
    int UnitCharAscci   = (int) UnitChar;
    // convert to integer
    int UnitIndex = Character.getNumericValue(UnitCharAscci);
    
    //if number is not 0 then -1 then refer to the index in the array
    if(UnitIndex != 0){
        UnitIndex = UnitIndex - 1;
      unit = RomanUnits[UnitIndex];
    }
 //   System.out.println(unit);
   
   
  
   
   //tens Place
   String ten ="";
   String yearTStr = Integer.toString(year);
   char TenChar = yearTStr.charAt(yearUStr.length()-2);
   
   // convert to ascii  
    int TensCharAscci   = (int) TenChar;
    // convert to integer
    int TensIndex = Character.getNumericValue(TensCharAscci);
    
    if(TensIndex != 0){
        TensIndex = TensIndex - 1;
      ten = RomanTens[TensIndex];
    }
  //  System.out.println(ten);
   
    
  
   //Hundered Place
   String hundered ="";
   String yearHStr = Integer.toString(year);
   char HunderedChar = yearHStr.charAt(yearUStr.length()-3);
   
   // convert to ascii  
    int HundredCharAscci   = (int) HunderedChar;
    // convert to integer
    int HundredIndex = Character.getNumericValue(HundredCharAscci);
    
    if(HundredIndex != 0){
        HundredIndex = HundredIndex - 2;
      hundered = RomanHundereds[HundredIndex];
    }
  //  System.out.println(hundered);
   
   putItAllTogether = Milliumen + hundered + ten + unit;
    
   System.out.println(putItAllTogether);
           
           }
   
  
}

