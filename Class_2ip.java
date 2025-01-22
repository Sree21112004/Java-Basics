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
    	Mobile m1=new Mobile();
    	m1.brand=sc.nextLine();
    	m1.model=sc.nextLine();
    	m1.price=sc.nextDouble();
    	m1.batteryCapacity=sc.nextInt();
    	sc.nextLine();
    	m1.myCall();
    	m1.myMess();
    	m1.display();
    	
    	System.out.println();
    	Mobile m2=new Mobile();
    	m2.brand=sc.nextLine();
    	m2.model=sc.nextLine();
    	m2.price=sc.nextDouble();
    	m2.batteryCapacity=sc.nextInt();
    	sc.nextLine();
    	m2.myCall();
    	m2.myMess();
    	m2.display();
}
}


