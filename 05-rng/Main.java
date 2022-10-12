
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
    if (mode.equals("Easy")){
        System.out.println("Easy mode");
        int maximum = 10;
    }
    else if(mode.equals("Medium")){
        System.out.println("Medium mode");
        int maximum = 50;
    }
    else{
        System.out.println("Hard mode");
        int maximum = 100;
    }
    int mysteryNum = (int)(Math.random()*maximum)+1;
    System.out.print("I'm thinking a number between 1 and 10(included), can you guess it: ");
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
