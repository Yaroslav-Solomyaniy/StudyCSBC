package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;
class Circle {
    private double radius = 0.5;
    private String  color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}

class Main {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(); // r = 0.5
        System.out.println("Радіус круга 1: " + firstCircle.getRadius());
        System.out.printf("Площа круга 1: %.1f", firstCircle.getArea());

        Circle secondCircle = new Circle(2); // r = 2
        System.out.println("\nРадіус круга 2: " + secondCircle.getRadius());
        System.out.printf("Площа круга 2: %.1f", secondCircle.getArea());
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianiy";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate)); }

}
