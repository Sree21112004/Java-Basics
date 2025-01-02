/******************************************************************************

                        Methods(Area of circle)

*******************************************************************************/

import java.util.*;
public class Main {
    public static double area_circle(double radius){
       return Math.PI*radius*radius;
       
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double radius1=6;
       double area1=area_circle(radius1);
       System.out.println("Area of circle 1 is "+area1);
       
       double radius2=12;
       double area2=area_circle(radius2);
       System.out.print("Area of circle 2 is "+area2);
    }
}