package com.company;

class employee{
    int id;
    String name;
        public void emplyeedetails(){
            System.out.println("My ID is "+id);
            System.out.println("My Name is "+name);

        }
}
public class ownclass {
        int sum(){
        return 0;

        }
    public static void main(String[] args) {
        employee owais = new employee(); // Instantiating a new class object
        employee Huzaifa = new employee(); // Instantiating a new class object
        // Setting attributes.
        owais.id = 12;
        owais.name = "Owais";
        Huzaifa.id = 17;
        Huzaifa.name = "Huzaifa";
        ownclass object = new ownclass(); // This is the method for non static method in class of file
        System.out.println(object.sum()); //
        owais.emplyeedetails();
        Huzaifa.emplyeedetails();
//        System.out.println(owais.id);
//        System.out.println(owais.name);

    }
}
