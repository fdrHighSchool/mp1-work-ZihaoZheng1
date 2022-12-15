
/**
 * Write a description of class coordinatePlane here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class coordinatePlane {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String point1, point2;
    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again
    do {
     System.out.print("Please enter a point in the form (x, y): ");
     point1 = s.nextLine();
    }while(checkInput(point1)==false);
    // write a statement to store the input
    
    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again
    do {
    System.out.print("Please enter a second point: ");
    point2 = s.nextLine();
    }while(checkInput(point2)==false);
    int x1=getX(point1);
    int x2=getX(point2);
    int y1=getY(point1);
    int y2=getY(point2);
    System.out.println("x value of first and second points are: "+x1+", "+x2);
    System.out.println("y value of first and second points are: "+y1+", "+y2);
    System.out.println("First point lies in "+quadrant(x1,y1)+", second point lies in "+quadrant(x2,y2)); 
    System.out.println("Distance between first point and second point is: "+euclideanDistance(x1,y1,x2,y2));
    System.out.println("Distance for taxicab between first point and second point is: "+taxicabDistance(x1,y1,x2,y2));
  } // end main method
// test your methods below:
  /*
   * N: checkInput
   * P: determine whether or not the input followed correct format
   * I: String user typed in
   * R: ???
   */
   public static boolean checkInput(String userInput){
     boolean result = false;
     if (userInput.indexOf("(")==0){
       if (userInput.indexOf(", ")!=-1){
         if(userInput.indexOf(", ")!=1){
          if(userInput.indexOf(")")==userInput.length()-1){
           result = true;
           System.out.println("valid");
          }//close if method
         }//close if method
       }//close if method
     }//close if method
     if (result==false){
         System.out.println("invalid");
     }// close if method
     return result;
   }// close checkInput method

  /*
   * N: getX
   * P: get the x-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: x-coordinate (int)
   */
  public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
  } // end getX method

  /*
   * N: getY
   * P: get the y-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: y-coordinate (int)
   */
   public static int getY(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(", ");

    // grab substring
    String y = point.substring(commaPos+2, point.length()-1);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(y);
  } // end getY method

  /*
   * N: quadrant
   * P: determine which quadrant the point lies in
   * I:
   * R:
   */
   public static String quadrant(int x, int y){
       String quad="";
       if (x>0){
         if (y>0){
            quad="quadrant 1";
        } // end if method
         else{
            quad="quadrant 4";
         } // end else method
       }
       else{
        if (y>0){
            quad="quadrant 2"; 
        } // end if method
        else{
            quad="quadrant 3";
        } // end else method
       }
       return quad;
   }// end quadrant method


  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
        sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */
   public static double euclideanDistance(double x1, double y1, double x2, double y2) {
    double solution=0;
    double part1=Math.pow((x2-x1),2);
    double part2=Math.pow((y2-y1),2);
    solution=Math.sqrt(part1+part2);
    return solution;
   }// end euclideanDistance method   
  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
        abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */
   public static double taxicabDistance(double x1,double y1,double x2,double y2) {
    double solution=Math.abs(x2-x1);
    solution+=Math.abs(y2-y1);
    return solution;
  }// end texicabDistance method
} // end class