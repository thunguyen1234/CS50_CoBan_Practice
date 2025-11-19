package Java.JavaFoundation.challenge8HashmapConstructor;
    public class Main{
    public static void main(String[] args){
        CityData cityData = new CityData();
        cityData.updatePopulation("Hanoi", 8500000);
        cityData.updatePopulation("Saigon", 9000000);
        cityData.printStatus("Hanoi");
        cityData.printStatus("Saigon");
        cityData.printStatus("Hue");
        
    }
}