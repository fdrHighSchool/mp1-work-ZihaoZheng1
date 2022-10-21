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
    
    System.out.print("What length of password do you want: ");
    int length = i.nextInt();
    s.close();
    i.close();
    if (lower(type).equals("student")){
     System.out.println("Your username is " + lower(firstName) +  lower(getInitial(lastName)) + num + "@nycstudents.net" );
    } // close if method
    else{
     System.out.println("Your username is " + lower(getInitial(firstName)) +  lower(lastName) + num + "@schools.nyc.gov" );
    }// close else method
    generatePassword(length);
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
  } // close lowercase method

  public static String generatePassword(int length) {
    String password="";
    for(int i=0;i< length;i++){
        int rand5 = (int)(Math.random()*4+1);//Select
        if (rand5==1){
            int rand1 = (int)(Math.random()*(26)+65);//random capital letter
            char c1=(char)rand1;
            password += c1;
         } //close if
        else if (rand5==2){
            int rand2 = (int)(Math.random()*(26)+97);//random lowercase
            char c2=(char)rand2;
            password += c2;
         }// close else if
        else if (rand5==3){
            int rand3 = (int)(Math.random()*(15)+33);//random special symbol
            char c3=(char)rand3;
            password += c3;
         }// close else if
        else{
            int rand4 = (int)(Math.random()*10+1);//random number
            password += rand4;
         }//close else
    }// close for loop method
     System.out.println("Your password is: "+password);
     return password;
    } // close generate method 
  } // end class
