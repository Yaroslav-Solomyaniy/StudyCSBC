package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;
class Author{
    private String name;
    private String email;
    private String sex;

    public Author(String name, String email, String sex)
    {
        this.name = name;
        this.email = email;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
public class Main {

    public static void main(String[] args) {
        Author Serhey = new Author("Serhey","Serhey06@gmail.com","Male");
        Author Yaroslav = new Author("Yaroslav", "Soman74geeev@gmail.com", "Male");
        System.out.println(Serhey);
        System.out.println(Yaroslav);
        printTimeStamp();
    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianiy";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("\nMade by: " + sname + " on " + dateFormat.format(currentDate)); }

}
