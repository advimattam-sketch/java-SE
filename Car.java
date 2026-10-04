import java.util.*;
class Car{
    String brand;
    int price;
    Car(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println("Brand:" +brand);
        System.out.println("Price:" +price);
    }
    public static void main(String[]args){
        Car s1=new Car("Toyota",6000000);
        Car s2=new Car("Skoda",2000000);
        s1.display();
        s2.display();
    }
}