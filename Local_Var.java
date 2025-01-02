/******************************************************************************

                        Methods(Local Variable)

*******************************************************************************/

import java.util.*;
public class Main {
    public static void methodA(){
       int localVar=10;
       System.out.println("Inside methodA : "+localVar);
       
    }
    public static void methodB(){
       int anotherVar=10;
       System.out.println("Inside methodB : "+anotherVar);
       
    }
    public static void main(String[] args){
        methodA();
        methodB();
    }
}