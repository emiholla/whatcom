import java.util.*;


/*
 *
 *  Josephine Hollandbeck
 *  CS 140 - 1130
 *  Calendar 1.0
 *  02/9/18
 *
 *  
 */


      // this program will take user input and return two grid-like calendars with numbered days; 
      // one from user input, the other being the current month, displayed below the requested month.
      
class zerCalender2{
   public static final int SIZE = 6;
   public static void main(String [] args){
      
      // provide user with menu choices
      System.out.println("Please choose from the menu what you would like to do:");
      Scanner input = new Scanner(System.in); 
      String date = input.next();
      System.out.println("\"e\" to enter a date and display the corresponding calendar.\n\"t\" to get today's date and calendar.\n\"n\" to display the next month.\n\"p\"to display the previous month.\n\"q\"to quit the program. ");
         if(datedata.equals("e")) {
            dateGo(input);
         }else if(datedata.equals("t")){
            todayGo(input);
         }else if(datedata.equals("n")){
            nextGo(input);
         }else if(datedata.equals("p")){
            previousGo(input);
         }else if(datedata.equals("q")){
            quitGo(input);
         }else{
            System.out.println("That is not on the menu.");
         }

      
      
            
      // pulling the current date for calendar
      Calendar today = Calendar.getInstance();
      int currentMonth = today.get(Calendar.MONTH) +1;
      int currentDay = today.get(Calendar.DATE);
 
      //get the user input for what date to display
      public static void dateGo
      
      // what date the user wants to see    
      int day = dayFromDate(datedata);
      int month = monthFromDate(datedata);
 
      // displayDate call
      displayDate(month, day);
      System.out.println();
      
  
      // print out the calendar requested by user
      //do a printf here for alignment!!!!
      System.out.println("                       You requested Month: "+month+"                   ");  
      drawMonth(month);    
      System.out.println();
      System.out.println();
      System.out.println();
      // print out the current calendar
      System.out.println("                      Current Month : "+currentMonth+"                   ");  
      drawMonth(currentMonth);
   }
   
   // assigns integers to variables for month and day captured in user input
   public static int dayFromDate(String date){
           int charley = date.indexOf("/");
         String dias = date.substring(charley+1,date.length());
         return Integer.parseInt(dias);
         }
   public static int monthFromDate(String date){
            int whiskey = date.indexOf("/");
         String dey = date.substring(0,whiskey);
         return Integer.parseInt(dey);
            
         }
         
      // draws up the monthly view
   public static void drawMonth(int month){   
      for(int i = 0; i < 5; i++){   
         drawRow(i);  
      }
      for(int j = 0; j < SIZE * 7 + 15; j++){  
         System.out.print("&");
      }
      
   }
   
   // displays the month and date of calendar being viewed
   public static void displayDate(int month, int day){
      System.out.println("Month: "+ month);
      System.out.println("Day: "+ day);
   }
   
   // method for drawing a row with symbols and spaces
   public static void drawRow(int row){
      for(int j = 0; j < SIZE * 7 + 15; j++){   
         System.out.print("&");
      }
      System.out.println();
      for(int k = row*7+1; k < row*7+8; k++){
         System.out.printf("! %-"+SIZE+"d",k);
      }
      System.out.println("|");
      for(int o = 0; o < 3; o++){
         for(int k = 0; k < 8; k++){
            System.out.print("|");
            
               
            for(int s =0; s <= SIZE; s++){
               System.out.print(" ");
            }
         }
         System.out.println();
           
      }


   }
  
    
}