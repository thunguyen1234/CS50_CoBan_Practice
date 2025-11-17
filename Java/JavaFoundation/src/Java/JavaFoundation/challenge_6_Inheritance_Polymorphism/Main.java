package Java.JavaFoundation.challenge_6_Inheritance_Polymorphism;

import Java.JavaFoundation.challenge7Hashmap.challenge7Hashmap;
import Java.JavaFoundation.challenge8Exception.challenge8Exception;

public class Main{
public static void main(String[] args){
    Vehicle myVehicle = new Vehicle();
    myVehicle.drive();
    
    Car myCar = new Car();
    myCar.drive();
    challenge7Hashmap number_population = new challenge7Hashmap();
    number_population.printPopulation();
    challenge8Exception challenge8Exception = new challenge8Exception();
    challenge8Exception.arrayException();
}
}
