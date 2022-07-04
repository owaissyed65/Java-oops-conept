/* FIrst of all it sees that value have argument if consy doesnt contain argument it simply print if
is contain argument it earch argument const and use super for this. */
package com.company;

class Base1 {
  public Base1() {
    System.out.println("I am a Constructor");
  }

  public Base1(int a) {
    System.out.println("I am an overload Constructor " + a);
  }
}

class Derive1 extends Base1 {
  Derive1() {
    System.out.println("I am derived class constructor");
  }

    Derive1(int x,int y) {
    super(x); /* Super  */
    System.out.println("I am overload constructor in drive class " + y);
  }
}
class childofderive extends Derive1{
  childofderive(){
    System.out.println("I am childofderive class Constructor");
  }
  childofderive(int p,int q,int l){
    super(p,q);
    System.out.println("I am childofderive class Constructor "+l);
  }
}
public class Constinherit {
  public static void main(String[] args) {
//        Base1 b = new Base1();
//        Base1 b1 = new Base1(3);
//    Derive1 d1 = new Derive1();
//    Derive1 d = new Derive1(3,4);
//    childofderive cd = new childofderive();
    childofderive cd1 = new childofderive(2,3,4);

  }
}
