package com.company;
class newCons{
    private int id;
    private String name;

    public newCons() {
         id = 54;
         name = "Owais";
    }

    public newCons(String myname,int myid) {
         id = myid;
         name = myname;
    }
    public newCons(int myid) {
         id = myid;
         name = "Owais";
    }
    public int getId() {return id;}
    public void setName(String n){ name = n; }
    public String getName() {return name;}
    public void setId(int i){ id = i; }
}

public class newConstructor {
    public static void main(String[] args) {
//        newCons owais = new newCons();
//        newCons owais = new newCons(45);
        newCons owais = new newCons();
//        owais.setId(23);
        System.out.println(owais.getId());
        System.out.println(owais.getName());

    }
}
