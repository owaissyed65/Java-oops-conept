package com.company;
import java.util.Scanner;

class userinputpprac{
    private int id;
    public void setId(int n){
        id = n;
}
    public int getId(){
        return id;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userinputpprac owais = new userinputpprac();
        System.out.println("input num");

        int a = sc.nextInt();
        owais.setId(a);
//        System.out.println(a);
        System.out.println(owais.getId());

    }
}
