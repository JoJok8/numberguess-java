//Joe Sundermier- Computer Programming Final
//Guess the Number Main
import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class numbGuess {
  public static int guess;
  public static boolean max = false;
  public static boolean won = false;
  public static void main ( String[] args ){
 
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Welcome to guess the number! Please type 'a' for a number between 1-100 and 'b' for a number between 1-1000.");
  String entry = keyboard.nextLine();
  
  if(entry.equals("a")){
    max = true;
    System.out.println("Game starting! Game between 1-100.");
  }else if(entry.equals("b")){
    max = false;
    System.out.println("Game starting! Game between 1-1000.");
  } else {
    System.out.println("Please choose 'a' or 'b'.");
  }
  
  numbFunc.set(max);
  numbFunc.pick(max);
  
  while(won == false){
    System.out.println("Please guess a number!");
    guess = keyboard.nextInt();
    numbFunc.check(guess);
  }
  }
}