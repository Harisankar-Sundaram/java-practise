import java.util.Scanner;

public class StrLen{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);//scanner initialization
        System.out.println("Enter the strin to find length:");
        String str=sc.nextLine();//input str
        System.out.println("The length of the String: "+str.length());//output
        sc.close();//scanner close
    }
}