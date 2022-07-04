package com.company;

import javax.xml.namespace.QName;

class Base { // That is called BAse superclass
  int x;

  //    public Base(int x) {  //constructor
  //        this.x = x;
  //    }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}

class Derive extends Base { // That is inherit from base superclass
  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Base B = new Base();
    Derive D = new Derive();
    B.setX(5);
    System.out.println("The value orignal recall in its parent class " + B.getX());
    //      B.sety(); // It can be valued because it is not a subclass of superclass
    D.setX(10); /* It is inherit from super class base into derive class */
    D.setY(20); /* It is inherit from super class base into derive class */
    System.out.println("The value extend in superclass thats called inheritance " + D.getX());
    System.out.println(
        "The value orignal goes in subclass which are superclass of base thats called inheritance "
            + D.getY());
  }
}
