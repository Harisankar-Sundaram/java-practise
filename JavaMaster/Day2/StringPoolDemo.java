import java.util.*;

public class StringPoolDemo{
    public static void main(String[] args) {
        String s="hello";//refernce returned from pool
        String s1="hello";//reference returned from pool
        System.out.println(s==s1);//true
        String s2=new String("im here");//creates individual memory
        String s3=new String("im here");//creates individual memory
        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true
    }
}