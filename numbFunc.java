//Joe Sundermier- Computer Programming Final
//Guess the Number Functions
import java.util.Random;
import java.util.Scanner;
import java.lang.System;
import java.lang.Math;

public class numbFunc {
  private static int guesses;
  public static boolean won = false;
  public static int num = 0;
  public static int set(boolean max){
    if(max == true){ //max is true or false; true = 100, false = 1000
      guesses = 7;
    } else if(max == false){
      guesses = 10;
    } else {
    return 0;
    }
  return 0;}
  
  public static int pick(boolean max){
    if(max == true){
    int range = (100 - 1) + 1;
    return num = (int)(Math.random() * range) +1;
    } else if(max == false){
    int range = (100 - 1) + 1;
    return num = (int)(Math.random() * range) +1;
    }
  return 0;
  }
  
  public static String check(int guess){
    if(guesses >0){  
    if(guess < num){
        System.out.println("You guessed " + guess + ".");
        System.out.println("The answer is higher! Guess again.");
        guesses = guesses - 1;
        System.out.println("You have " + guesses + " guesses left.");
      }else if(guess > num){
        System.out.println("You guessed " + guess + ".");
        System.out.println("The answer is lower! Guess again.");
        guesses = guesses - 1;
        System.out.println("You have " + guesses + " guesses left.");
      } else if(guess == num){
        System.out.println("You guessed "+ guess +".");
        System.out.println("You guessed the right number! You win!");
        System.out.println("You had "+guesses+ " guesses left.");
        won = true;
        System.exit(0);
      }                     
    }else if (guesses == 0){
    System.out.println("You're out of guesses! You lose.");
    System.out.println("The number you had to guess was " + num + ".");
    System.out.println("Please restart the program to play again.");
    System.exit(0);
    
    }
  return "error";}
   }