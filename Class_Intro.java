/******************************************************************************

                                    Class

->Blueprint or template that has fields and methods
->Fields: Static variables and instance variables
->Object is an instance of a class
*******************************************************************************/
import java.util.*;
public class Mobile{
    public String brand;
    public String model;
    public double price;
    public int batteryCapacity;
    public void myCall(){
        System.out.println("Calling...");
    }
    public void myMess(){
        System.out.println("Sending Message");
    }
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model "+model);
        System.out.println("Price "+price);
        System.out.println("Battery Capacity: "+batteryCapacity);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	Mobile m=new Mobile();
	m.brand=sc.nextLine();
	m.model=sc.nextLine();
	m.price=sc.nextDouble();
	m.batteryCapacity=sc.nextInt();
	m.myCall();
	m.myMess();
	m.display();
}
}


