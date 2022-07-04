/* That is called method dispatching that disallow the method of subclass*/
package com.company;

class Phone{
  public void music(){
    System.out.println("Music is on");
  }
  public void on(){
    System.out.println("Phone is on");
  }
}

class Smartphone extends Phone{
  @Override
  public void on(){
    System.out.println("Smartphone is on");
  }


  public void music1() {
    System.out.println("Smartphone music is on...");
  }
}
public class methoddispatch {
  public static void main(String[] args) {
    Phone obj = new Smartphone();
    obj.music();
    obj.on();
  }
}
