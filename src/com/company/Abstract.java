package com.company;
abstract class Parent{
  public Parent()
  {
    System.out.println("Me ek constructor hu parent ka");
  }
  abstract public void greet1();
  abstract public void greet2();
}
class child extends Parent{
  @Override
  public void greet1(){
    System.out.println("Me ek override method hu abstract parent ka 1");
  }
  public void greet2(){
    System.out.println("Me ek override method hu abstract parent ka 2");
  }
}
class child1 extends child{
  public void th(){
    System.out.println("I Am th");
  }
}
public class Abstract {
  public static void main(String[] args) {
  child1 c = new child1();
  c.th();
  c.greet1();
  c.greet2();

  }
}
