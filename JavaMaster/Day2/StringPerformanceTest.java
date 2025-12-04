import java.util.*;

public class StringPerformanceTest{
    public static void main(String[] args){
        String s="hi";
        StringBuilder s1=new StringBuilder("hi");
        long sst=System.nanoTime();
        for(int i=0;i<3;i++) {
            s=s+" hi";
        }
        long set=System.nanoTime();
        long sbst=System.nanoTime();
        for(int i=0;i<3;i++) {
            s1.append(" hi");
        }
        long sbet=System.nanoTime();
        System.out.println("String time :"+(set-sst));
        System.out.println("String Builder time: "+ (sbet-sbst));
    }
}