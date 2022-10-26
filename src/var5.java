//Swap two numbers using third variable

public class var5 {
    public static void main(String[] args) {
        int x=20;
        int y=30;
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);
       x=x+y;
       y=x-y;
       x=x-y;
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);
    }
}
