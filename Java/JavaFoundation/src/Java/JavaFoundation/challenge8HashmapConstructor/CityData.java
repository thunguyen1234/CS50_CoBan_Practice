package Java.JavaFoundation.challenge8HashmapConstructor;

import java.util.HashMap;

public class CityData {
    // khai báo hashmap- biến thành viên
    HashMap<String, Integer> cityPopulation;

    // CONSTRUCTOR
    public CityData() {
        // khởi tạo hashmap trong constructor bằng new
        cityPopulation = new HashMap<>();
        // thêm dữ liệu ban đầu
        cityPopulation.put("Hanoi", 8000000);
        cityPopulation.put("Saigon", 9000000);
        cityPopulation.put("Danang", 3000000);
    }
    // method

    public void printStatus(String city) {
        boolean check_city = cityPopulation.containsKey(city);
        System.out.println("is " + city + " exist in the city list?  " + check_city);
        System.out.println("City: " + city + " has " + cityPopulation.get(city) + "  people");
        System.out.println("-----");

    }

    public void updatePopulation(String city, int population) {
        cityPopulation.put(city, population);
    }
}
