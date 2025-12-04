import java.util.*;

class A{
    int x;
    void display(){
        System.out.println("value of x: "+x);
    }
}
public class MemoryDemo{
    static void test(){
        int x=30;
        System.out.println("value of x is: "+x);
    }
    public static void main(String[] args){
        A a=new A();
        A b=new A();
        a.x=10;
        b.x=20;
        a.display();
        b.display();
        test();
    }
}