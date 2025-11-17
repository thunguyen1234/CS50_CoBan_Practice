package Java.JavaFoundation.challenge7Hashmap;

import java.util.HashMap;




//         Viết code Java trong hàm main để thực hiện các bước sau:

// Khai báo một HashMap với String làm Key (Tên Quốc gia) và Integer làm Value (Dân số, tính bằng triệu).

// Thêm ba cặp Key-Value bất kỳ (ví dụ: "Vietnam", 100).

// Lấy giá trị: Dùng phương thức get() để in ra dân số của một quốc gia cụ thể.

// Kiểm tra: Dùng phương thức containsKey() để kiểm tra xem một quốc gia nào đó có tồn tại trong Map không,

//sau đó in ra thông báo tương ứng.
public class challenge7Hashmap{



public void printPopulation(){
    //khai báo hashmap- biến thành viên
    HashMap<String, Integer> population = new HashMap<>();
    //constructor: thêm cặp key-value
population.put("Viet Nam", 99000);
population.put("Sing", 1000);
population.put("China", 1000000);
//method get() và containsKey()

int VietNam_population = population.get("Viet Nam");
boolean check_vietnam = population.containsKey("Viet Nam");
System.out.println("is vietnam exist in the population list?   " + check_vietnam);
System.out.println("Vietnam's population : " + VietNam_population);

int Sing_population = population.get("Sing");
boolean check_sing = population.containsKey("Sing");
System.out.println("is vietnam exist in the population list?   " + check_sing);
System.out.println("Sing's population : " + Sing_population);

int China_population = population.get("China");
boolean check_china = population.containsKey("Sing");
System.out.println("is vietnam exist in the population list?  " + check_china);
System.out.println("China's population : " + China_population);
};

}