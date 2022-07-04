package com.company;

import java.util.Random;

class myEmployee{
     private int id;
    private String name;
    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class getter {
    public static void main(String[] args) {
        myEmployee owais = new myEmployee();
        owais.setName("Owais");
        System.out.println(owais.getName());
        owais.setId(142);
        System.out.println(owais.getId());
        Random comp = new Random();
        int compinp = comp.nextInt(3);
        System.out.println(compinp);
    }
}
