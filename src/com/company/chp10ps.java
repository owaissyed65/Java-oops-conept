package com.company;

import java.util.Scanner;

class Circle{
   public int Radius;

    Circle(int r){
    this.Radius = r ;
    }

     public double area(){
        return Math.PI*this.Radius*this.Radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super (r);
        this.height = h;
    }

    public double volume(){
        return Math.PI*this.Radius*this.Radius*this.height;
    }
}
public class chp10ps {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius: ");
      int r = input.nextInt();
      System.out.print("Enter the height: ");
      int h = input.nextInt();
      Cylinder1 obj = new Cylinder1(4,5);
      System.out.printf("\n");
      System.out.println("This Is the total area of circle: "+obj.area());
      System.out.println("This is the total volume of cylinder: "+obj.volume());
  }
}

