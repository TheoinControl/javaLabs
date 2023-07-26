package com.qa;
public class Main {
    public static void main(String[] args) {
        //create some objects
        Circle c = new Circle ("circle1", "red", 0,0, 10);
        Circle c2 = new Circle ("circle2", "blue", 10,10, 5);
        //print out the objects
        System.out.println(c);
        System.out.println(c2);

        System.out.println("Circle location before move: " + c.getCurrentLocation());
        c.move(10.5, 4.3);
        System.out.println("Circle location after move: " + c.getCurrentLocation());
    }


}