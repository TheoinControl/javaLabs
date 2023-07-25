package com.qa;

public class Main {
    public static void main(String[] args) {


        Rectangle r = new Rectangle("rectangle1", "yellow", 0, 0, 10, 10);
        Rectangle r2 = new Rectangle("rectangle2", "green", 2, 2, 5, 2);
        System.out.println(r);
        System.out.println(r2);

        System.out.println(r + ", CentrePoint is: "
                + r.getCentrePoint() + ", Area is: " + r.getArea()
                + ". Is it square? " + r.isSquare());
        System.out.println(r2 + ", CentrePoint is: "
                + r2.getCentrePoint() + ", Area is: " + r2.getArea()
                + ". Is it square? " + r2.isSquare());



        //create some circle objects
        Circle c = new Circle ("circle1", "red", 0,0, 10);
        Circle c2 = new Circle ("circle2", "blue", 10,10, 5);

        //print out the circle objects
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c + ", CentrePoint is: " +
                c.getCentrePoint() + ", Area is: " + c.getArea());
        System.out.println(c2 + ", CentrePoint is: " +
                c2.getCentrePoint() + ", Area is: " + c2.getArea());

    }
}
