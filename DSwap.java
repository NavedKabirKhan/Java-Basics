import java.util.Scanner;
public class DSwap{
    int a,b;
    Scanner ip=new Scanner (System.in);
void set()
{
    System.out.println("Enter Values of a and b");
    a=ip.nextInt();
    b=ip.nextInt();
}
void swapping()
{
    a=a+b;
    b=a-b;
    a=a-b;
}
void show()
{
    System.out.println("a="+a);
    System.out.println("b="+b);
}
public static void main(String arg[])
{
    DSwap ob = new DSwap();
    ob.set();
    ob.swapping();
    ob.show();
}
}