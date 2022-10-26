//taking input through user by adding Scanner class like
/*
 By importing :
 java.util.import Scanner :class
 */
import java.util.Scanner;
public class var6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        Taking input as an integer
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Entered lucky number is : "+ a);
//        taking string as a input
        System.out.println("Enter your name :");
        String b=sc.next();
        System.out.println("your name is "+b);
        float d=sc.nextFloat();
        System.out.println(d);
    }
}
