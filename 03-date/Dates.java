
/**
 * Think Java;Chapter 2 exercise 2
 *
 * @Zihao
 * @9/28/22
 */

import java.util.Scanner;
public class Dates{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String DayOfWeek = s.nextLine();
        System.out.println(DayOfWeek);
        
        System.out.print("Enter the month: ");
        String Month = s.nextLine();
        System.out.println(Month);
        
        System.out.print("Enter the day of the month: ");
        String DayOfMonth = s.nextLine();
        System.out.println(DayOfMonth);
        
        System.out.print("Enter the year: ");
        String Year = s.nextLine();
        System.out.println(Year);
        
        s.close();
        
        System.out.println("American format: "+ DayOfWeek + ", " + Month +
" "+ DayOfMonth + ", " + Year);
        System.out.println("European format: "+ DayOfWeek + " " + DayOfMonth +
" "+ Month + " " + Year);
     } // end of main method
} // end of class
