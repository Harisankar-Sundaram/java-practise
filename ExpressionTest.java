import java.util.Scanner;

public class ExpressionTest{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);//Scanner initialization
        System.out.println("Enter a number to evaluate increment:");
        int x=sc.nextInt();//input x
        int res=x++ + ++x;//post and then pre increment
        x-=2;//to see the difference decrement two
        int res2=++x + x++;//pre and then post increment
        System.out.println("result of increments in order of post,pre and pre,post: "+res+" "+res2);//output
        sc.close();//scanner close
    }
}