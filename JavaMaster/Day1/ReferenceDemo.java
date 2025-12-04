import java.util.*;

class Demo{
    int x;
    void display() {
        System.out.println("value of x: "+x);
    }
}
public class ReferenceDemo{
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.x=10;//first reference
        d1.display();
        Demo d2=d1;//second reference
        d2.x=20;
        d1.display();//value changed and displayed
    }
}