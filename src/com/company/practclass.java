package com.company;
class Staff{
    int id ;
    String name;
    int salary;
    public void getdetail(){
        System.out.println("Your name is " + name);
        System.out.println("Your ID is " + id);
    }
    public int getSalary(){
        return salary;
    }

    Staff(int idd , String namee , int salaryy){
        id = idd;
        name = namee;
        salary = salaryy;
    }

}

public class practclass {
    public static void main(String[] args) {
        Staff owais = new Staff(142,"Owais",35000);
        Staff mem1 = new Staff(115,"Bilal",35000);
//        staff bilal = new staff();
//        owais.id =142;
//        owais.name ="Owais";
//        bilal.id =131;
  /*
        bilal.name ="Bilal";
        owais.salary=32000;
        bilal.salary=12000;
        owais.getdetail();
        bilal.getdetail();
   */
        System.out.println(owais.name + " " + owais.id + " " + owais.salary);
        System.out.println(mem1.name + " " + mem1.id + " " + mem1.salary);
//        System.out.println(bilal.name+ " Salary is "+bilal.getSalary());

    }

}
