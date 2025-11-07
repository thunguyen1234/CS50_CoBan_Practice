package Java.JavaFoundation.challenge_6_Inheritance_Polymorphism;
public class Vehicle{
    String color;
    //constructor
    Vehicle(){
        this.color= "white";
    }
    public void drive(){
        System.out.println("The "+ color+ " vehicle is driving.");
    }
}