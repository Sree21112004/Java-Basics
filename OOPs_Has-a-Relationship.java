/******************************************************************************

                                    OOPs

Key Concepts:
1. Class
2.Object
3.Inheritance
4.Abstraction
5.Polymorphism
6.Encapsulation

->Inheritance
Process of creating a new class by acquiring properties of existing class
    a. HAS-A Relationship
*******************************************************************************/
class SuperA
{
    int x=100;
    public void display(){
        System.out.println("display method from superA");
    }
}
class sub{
    SuperA a=new SuperA();
    int y=200;
    public void display(){
        System.out.print("Display method fromsub class");
    }
}
public class Main{
    public static void main(String args[]){
        sub b=new sub();
        System.out.println("x val is : "+b.a.x);
        System.out.println("y val is : "+b.y);
        b.a.display();
        b.display();
    }
}