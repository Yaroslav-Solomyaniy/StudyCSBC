package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class GeometricObject
{
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){}
    protected GeometricObject(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }
    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}
public class Main {

    public static void main(String[] args) {
	printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
