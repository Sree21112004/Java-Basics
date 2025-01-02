/******************************************************************************

                        Methods(Instance Variable)

*******************************************************************************/

import java.util.*;
public class Main {
    int intVar;
    boolean boolVar;
    String stringVar;
    
    public void displaymethodAefaults(){
       System.out.println("Default inVar: "+intVar);
       System.out.println("Default inVar: "+intVar);
       System.out.println("Default inVar: "+boolVar);
       System.out.println("Default inVar: "+StringVar);
    }
    
    public static void main(String[] args){
        Main obj1=new Main();
        Main obj2=new Main();
        
        System.out.println("obj1 instanceVar : "+obj1.instanceVar);
        System.out.println("obj2 instanceVar : "+obj2.instanceVar);
        obj1.methodA();
        obj1.methodB();
    }
}