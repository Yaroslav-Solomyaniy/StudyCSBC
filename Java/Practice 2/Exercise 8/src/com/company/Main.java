package com.company;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//*************  КИЇВ ****************************
	System.out.println("Введіть довготу м.Київ ==>");
	double longitudeKiev = scan.nextDouble();
	System.out.println("Введіть широту М.Київ ==>");
	double latitudeKiev = scan.nextDouble();

	//*************  Львів ****************************
        System.out.println("Введіть довготу м.Львів ==>");
        double longitudeLviv = scan.nextDouble();
        System.out.println("Введіть широту М.Львів ==>");
        double latitudeLviv = scan.nextDouble();

        //************* Харків ****************************
        System.out.println("Введіть довготу м.Харків ==>");
        double longitudeXarkiv = scan.nextDouble();
        System.out.println("Введіть широту М.Харків ==>");
        double latitudeXarkiv = scan.nextDouble();

        //*************  Одеса ****************************
        System.out.println("Введіть довготу м.Одеса ==>");
        double longitudeOdessa = scan.nextDouble();
        System.out.println("Введіть широту М.Одеса ==>");
        double latitudeOdessa = scan.nextDouble();
        //************* sout ***********************
        System.out.println("Київ | Довгота:"+longitudeKiev+"/ Широта:"+latitudeKiev);
        System.out.println("Львів | Довгота:"+longitudeLviv+"/ Широта:"+latitudeLviv);
        System.out.println("Харків | Довгота:"+longitudeXarkiv+"/ Широта:"+latitudeXarkiv);
        System.out.println("Одеса | Довгота:"+longitudeOdessa+"/ Широта:"+latitudeOdessa);
        //*************Convert to Radian**********************
        double radianLongitudeKiev = convertToRadian(longitudeKiev);
        double radianLatitudeKiev = convertToRadian(latitudeKiev);
        double radianLongitudeLviv = convertToRadian(longitudeLviv);
        double radianLatitudeLviv = convertToRadian(latitudeLviv);
        double radianLongitudeXarkiv = convertToRadian(longitudeXarkiv);
        double radianLatitudeXarkiv = convertToRadian(latitudeXarkiv);
        double radianLongitudeOdessa = convertToRadian(longitudeOdessa);
        double radianLatitudeOdessa = convertToRadian(latitudeOdessa);
        //
        double distanceKievHarkiv = distance(radianLongitudeKiev,radianLongitudeXarkiv,radianLatitudeKiev,radianLatitudeXarkiv);
        double distanceKievLviv = distance(radianLongitudeKiev,radianLongitudeLviv,radianLatitudeKiev,radianLatitudeLviv);
        double distanceXarkivLviv = distance(radianLongitudeXarkiv,radianLongitudeLviv,radianLatitudeXarkiv,radianLatitudeLviv);
        double distanceOdessaHarkiv = distance(radianLongitudeOdessa,radianLongitudeXarkiv,radianLatitudeOdessa,radianLatitudeXarkiv);
        double distanceOdessaLviv = distance(radianLongitudeOdessa,radianLongitudeLviv,radianLatitudeOdessa,radianLatitudeLviv);
        //
        System.out.println("Відстань між Києвом та Харьковом:"+ distanceKievHarkiv);
        System.out.println("Відстань між Києвом та Львовом:"+distanceKievLviv);
        System.out.println("Відстань між Харьковом та Львовом:"+distanceXarkivLviv);
        System.out.println("Відстань між Одесою та Харьковом:"+distanceOdessaHarkiv);
        System.out.println("Відстань між Одесою та Львовом:"+distanceOdessaLviv);
        //
        double summGeron = triangle(distanceKievHarkiv,distanceKievLviv,distanceXarkivLviv)+triangle(distanceOdessaHarkiv,distanceOdessaLviv,distanceXarkivLviv);
        double geronOne = triangle(distanceKievHarkiv,distanceKievLviv,distanceXarkivLviv);
        double geronTwo = triangle(distanceOdessaHarkiv,distanceOdessaLviv,distanceXarkivLviv);
        System.out.println("Площа триктуника з міст(Київ,Харків,Львів): "+ geronOne);
        System.out.println("Площа трикутника з міст(Одеса, Харків, Львів): "+geronTwo);
        System.out.println("Площа трикутника з усіх міст: "+summGeron);
        printTimeStamp();
    }
    public static double convertToRadian(double a)
    {
        return a*Math.PI/180;
    }
    public static double distance(double x1, double x2, double y1, double y2)
    {
        double R = 6371.01;
        return  R * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
    }
    public static double triangle(double x1,double x2,double x3)
    {
        double p1 = (x1+x2+x3)/2;
        return Math.sqrt(p1*(p1-x1)*(p1-x2)*(p1-x3));
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
