/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eventreservation;

/**
 *
 * @author RC_Student_lab
 */
 import java.util.Scanner;

public class EventReservation {
   public static String code = "22439_17";
   public static String passWord1 = "@Tim769gohy";
    public static boolean checkBookingCode(){
        String bookingCode;
        /*this boolean method checks if the entered bookingCode 
        contains an underscore and it's length is less than 12 characters.*/
        
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the bookingCode>>");
         bookingCode = obj.nextLine();
            
         //the method returns true when the conditions are met by the code otherwise is false.
        return bookingCode.contains("_") && bookingCode.length()<12;
       
    }
    
     public static String makeReservation(){
         String bookingCode;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter the bookingCode>>");
         bookingCode = obj.nextLine();
         String  password;
         System.out.println("Enter password>>");
         password = obj.nextLine();
         if(!bookingCode.equals(code)){
             return "Booking code is incorrectly formatted.";
         }
         if(!password.equals(passWord1)){
             return "Password does not meet the complexity requirements.";
         }
         if(bookingCode.equals(code)&& password.equals(passWord1)){
             return "Reservation successfully made!";
         }
         return "";
     }  
      public static void main(String[] args) {
          
          makeReservation();
          
      }
}
        