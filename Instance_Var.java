/******************************************************************************

                        Methods(Instance Variable)

*******************************************************************************/

import java.util.*;
public class Main {
    int instanceVar=30;
    
    public void methodA(){
       System.out.println("Accessing instanceVar in methodA: "+instanceVar);
    }
    
    public void methodB(){
       System.out.println("Accessing instanceVar in methodB: "+instanceVar);
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