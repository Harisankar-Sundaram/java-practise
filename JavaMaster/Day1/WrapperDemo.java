import java.util.*;

public class WrapperDemo{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);//Auto-boxing
        list.add(20);//Auto-Boxing
        int a=list.get(0);//Auto-unboxing
        int b=list.get(1);//Auto-unboxing
        Integer c=120;
        Integer d=120;
        System.out.println("In range with equalality operator: "+(c==d));
        System.out.println("In range with equals: "+c.equals(d));
        c=210;
        d=210;
        System.out.println("In range with equalality operator: "+(c==d));
        System.out.println("In range with equals: "+c.equals(d));
    }
}