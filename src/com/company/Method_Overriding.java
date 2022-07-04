package com.company;

class A {
  //  int a;
  //  public int owais(int a){
  //    this.a=a;
  //    return a;
  //  }
  public void meth1() {
    System.out.println("I am Method 1 of Class A");
  }
}

class B extends A {
  @Override
  public void meth1() {
    System.out.println("I am Method 1 of class B");
  }
}

public class Method_Overriding {
  public static void main(String[] args) {
    B b = new B();
    b.meth1();
    //      b.meth1();
  }
}
