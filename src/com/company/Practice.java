package com.company;
/*
Practice Questions..
 */
    class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }

        public void setName(String n) {
            name = n;
        }
    }
    class cellphone{
        public void Ringing(){
            System.out.println("Ringing.......");
        }
        public void Vibrating(){
            System.out.println("Vibrating ....|| ");
        }
    }
    class Square{
        int side;
        public int Area(){
            return side*side;
        }
        public int Perimemter(int n){
            return n*side;
        }

    }
public class Practice {
    public static void main(String[] args) {
        /*Problem 1 */
        Employee owais = new Employee();
//        owais.setName("I Am Owais");
//        owais.salary=42000;
//        System.out.println(owais.getName());
//        System.out.println(owais.getSalary());
        /*Problem 2 */
//        cellphone motoe4 = new cellphone();
//        motoe4.Ringing();
//        motoe4.Vibrating();
        /*Problem 3 */
        Square sq = new Square();
        int n = 4;
        sq.side=4;
        System.out.println(sq.Area());
        System.out.println(sq.Perimemter(n));
    }
}
