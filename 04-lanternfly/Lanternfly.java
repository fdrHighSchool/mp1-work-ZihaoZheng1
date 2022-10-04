
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(blue+"The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println(yellow + "You can do better than that!" + reset);
        } // end if statement
        else if (num < 100) {
            System.out.println(green + "Thanks for doing your part" + reset);
        } // end else if  statement
        else {
            System.out.println(red + "The biggest enemy of lanternfly" + reset);
        } // ebd else statement
    } // end main method
    public static final String red = "\u001B[31m";
    public static final String reset = "\u001B[0m";
    public static final String yellow = "\u001B[33m";
    public static final String green = "\u001B[32m";
    public static final String blue = "\u001B[34m";
} // end class