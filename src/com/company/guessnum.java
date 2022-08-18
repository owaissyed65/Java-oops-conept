package com.company;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

class Exercise{
    public int number;
    public int guessnumber = 0;
    public int input;

    public Exercise(){            //constructor
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    public void takeuserinput(){            //method
        System.out.println(number);
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        this.input = sc.nextInt();
    }
    boolean iscorrectnumber(){
        guessnumber++;
        if ( input == number )
        {
        System.out.printf("You Input Correct Number....%d \n You attempt this number %d ",number , guessnumber);
            return true;
        }
        else {
            System.out.println("You Input Wrong Number....");
            return false;
        }
    }
    public int getGuessnumber() {           //getter
        return guessnumber;
    }
    public void setGuessnumber(int guessnumber) {       //setter
        this.guessnumber = guessnumber;
    }
}
public class guessnum {
  public static void main(String[] args) {
      Exercise game=new Exercise();
      boolean b = false;
        while(!b)
        {
      game.takeuserinput();
      b=game.iscorrectnumber();
      System.out.println(b);
        }
  }
}
