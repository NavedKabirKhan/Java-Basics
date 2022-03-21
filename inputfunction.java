import java.util.Scanner;
public class inputfunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter Two Numbers ");
    double a,b,c;

    a=input.nextDouble();
    b=input.nextDouble();
    c=a+b;
System.out.println("Sum = "+c);
}
}