import java.util.Scanner;

public class Swap{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=sc.nextInt();//input a
        int b=sc.nextInt();//input b
        System.out.println("The numbers before swapped: "+a+" "+b);
        int c=a;//using c temporary variable for swapping
        a=b;
        b=c;
        System.out.println("The numbers after swapped: "+a+" "+b); //output
        sc.close();//scanner close
    }
}