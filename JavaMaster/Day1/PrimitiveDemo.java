import java.util.*;

public class PrimitiveDemo{
    public static void main(String [] args) {
        byte a;//1 byte
        short b;//2 byte
        int c;//4 byte
        long d;//8 byte
        float e;//4 byte
        double f;//8 byte
        boolean g;// 1 or 4 byte
        char h;//2 byte
        System.out.println("byte: "+Byte.MIN_VALUE+","+Byte.MAX_VALUE+" short: "+Short.MIN_VALUE+","+Short.MAX_VALUE+" int: "+Integer.MIN_VALUE+","+Integer.MAX_VALUE+" long: "+Long.MIN_VALUE+","+Long.MAX_VALUE+" float: "+Float.MIN_VALUE+","+Float.MAX_VALUE+" double: "+Double.MIN_VALUE+","+Double.MAX_VALUE+" char: "+Character.MIN_VALUE+","+Character.MAX_VALUE);
    }
}