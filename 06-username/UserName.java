import java.util.Scanner;

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
    if (type.equals("student")){
     System.out.println("Your username is " + firstName +  getInitial(lastName) + num + "@nycstudents.net" );
    } // close if method
    else{
     System.out.println("Your username is " + getInitial(firstName) +  lastName + num + "@schools.nyc.gov" );
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

} // end class
