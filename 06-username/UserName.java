import java.util.Scanner;
import java.util.Random;
public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    Scanner i = new Scanner(System.in);
    // get input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    
    System.out.print("Enter your favorite number: ");
    int num = i.nextInt();
    
    System.out.print("Are you a student or teacher: ");
    String type = s.nextLine();
    
    s.close();
    i.close();
    if (lower(type).equals("student")){
     System.out.println("Your username is " + lower(firstName) +  lower(getInitial(lastName)) + num + "@nycstudents.net" );
    } // close if method
    else{
     System.out.println("Your username is " + lower(getInitial(firstName)) +  lower(lastName) + num + "@schools.nyc.gov" );
    }// close else method
  } // end main method

  /*
   * Name:  getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
   } // end  getInitial method
  public static String lower(String t){
    return t.toLowerCase();
  }
  
  public static String generatePassword(int length) {
    String password="";
    char c;
    for(int i=0;i<= length;i++){
    int rand1 = (int)(Math.random()*(90-65+1)+65);
    int rand2 = (int)(Math.random()*(122-97+1)+97);
    int rand3 = (int)(Math.random()*(47-33+1)+33);
    } // close for method 
    
    
    return password;
  } // end generatePassword method

} // end class
