package com.company;
/*
 problem 1:
*/
class Cylinder{
    private int radius;
    private int height;
    public Cylinder(int radiuss, int heightt){
        radius = radiuss;
        height = heightt;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radiuss) {
        this.radius = radiuss;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heightt) {
        this.height = heightt;
    }
    public double surfacearea() {
        return (2 * Math.PI * radius * radius) +(2 * Math.PI * radius * height);
    }
    public double volume() {
        return (  Math.PI * radius * radius * height);
    }
}
class Rectangle{
    private int height;
    private int breaadth;

}

public class chp9ps {
    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();
        Cylinder cylinder = new Cylinder(9,12);
//        cylinder.setRadius(9);
        System.out.println(cylinder.getRadius());
//        cylinder.setHeight(12);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.surfacearea());
        System.out.println(cylinder.volume());

    }

}

