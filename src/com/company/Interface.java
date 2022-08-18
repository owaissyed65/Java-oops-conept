package com.company;
interface Bicycle{
    void Brake();
    void Speed();
}
interface horn{
    void hornkg();
    void hornmhn();
}
class AvonCycle implements Bicycle , horn{
    public void Brake(){
    System.out.println("I am Brake");
    }
    public void Speed(){
    System.out.println("I am Speed");
    }
    public void hornkg(){
    System.out.println("I am pee pee");
    }
    public void hornmhn(){
        System.out.println("I am poo poo");
    }
}

public class Interface {
  public static void main(String[] args) {
  AvonCycle mycycle = new AvonCycle();
  mycycle.Brake();
  mycycle.Speed();
  mycycle.hornmhn();
  mycycle.hornkg();
  }
}
