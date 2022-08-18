package com.company;
interface mycamera{
  void takesnap();
  void Recordvideo();
}
interface myWifi{
  String[] getnetwork();
  void connectnetwork();
}
class Cellphone{
  void callnumber(){
    System.out.println("Connect to the number");
  }
  void connect(){
    System.out.println("Connecting......");
  }
}
class mySmartphone extends cellphone implements mycamera,myWifi{
  public void takesnap(){
    System.out.println("Taking Snap...");
  }
  public void Recordvideo(){
    System.out.println("Taking Video...");
  }
  public String[] getnetwork(){
    String[] getlist = {"Owais","Huzaifa","Bilal"};
    return getlist;
  }
  public void connectnetwork(){
    System.out.println("Connect to the network");
  }
}
public class Default {
  public static void main(String[] args) {
  mySmartphone ms = new mySmartphone();
  ms.connectnetwork();
  String [] arr = ms.getnetwork();
  for (String item :arr ) {
      System.out.println("This is the list of network"+item);
  }

  }
}
