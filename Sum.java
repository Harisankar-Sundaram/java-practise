import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//scanner initialization
        System.out.println("Enter a and b:");
        int a=sc.nextInt();//input for a
        int b=sc.nextInt();//input for b
        System.out.println("Sum of a and b:"+(a+b));//output
        sc.close();//scanner close
    }
}