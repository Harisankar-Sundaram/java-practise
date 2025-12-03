import java.util.Scanner;

public class EvenOdd{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);//Scanner initialization
        System.out.println("Enter a number to check odd or even:")
        int x=sc.nextInt();//input x
        if(x%2==0) {//condition to check odd or even
            System.out.println(x+" is Even");//result
        }
        else{
            System.out.println(x+" is Odd");//result
        }
        sc.close();//Scanner close
    }
}