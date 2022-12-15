
/**
 * Write a description of class Rng here.
 *Create a random number guessing game
 * @Zihao Zheng
 * @9/30/22(V1.0)
 */
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    
    System.out.println("Before starting the game, what mode do you want\nEasy\nMedium\nHard");
    String mode = s.nextLine();
    
    int maximum;
    if (mode.equals("Easy")){
        System.out.println("Easy mode");
        maximum = 10;
    } // close if method
    else if(mode.equals("Medium")){
        System.out.println("Medium mode");
        maximum = 50;
    } // close else if method
    else{
        System.out.println("Hard mode");
        maximum = 100;
    } // close else method
    int mysteryNum = (int)(Math.random() * maximum)+1;
    System.out.print("I'm thinking a number between 1 and " + maximum + "(included), can you guess it: ");
    int guessNum = s.nextInt();
    if (guessNum == mysteryNum){
      System.out.println("You are correct! The number is "+mysteryNum);
    }// close if
    else if (guessNum>mysteryNum){
      System.out.println("The number is "+mysteryNum+", you were off by "+(guessNum-mysteryNum));
    }// close else if
    else{
      System.out.println("The number is "+mysteryNum+", you were off by "+(mysteryNum-guessNum));
    } //close else
  } //close main method
} //close class
