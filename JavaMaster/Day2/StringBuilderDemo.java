import java.util.*;

public class StringBuilderDemo{
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("hi there");
        System.out.println("after append: "+s+" capacity: "+s.capacity());
        s.insert(8," java");
        System.out.println("after insert: "+s+" capacity: "+s.capacity());
        s.append(" here");
        System.out.println("after insert: "+s+" capacity: "+s.capacity());
        s.delete(13,18);
        System.out.println("after delete: "+s+" capacity: "+s.capacity());
        s.reverse();
        System.out.println("after reverse: "+s+" capacity: "+s.capacity());
    }
}