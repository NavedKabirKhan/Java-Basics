import java.util.Scanner;
public class Swap{
    int a,b,c;
    Scanner ip=new Scanner (System.in);
void set()
{
    System.out.println("Enter Values of a and b");
    a=ip.nextInt();
    b=ip.nextInt();
}
void swapping()
{
    c=a;
    a=b;
    b=c;
}
void show()
{
    System.out.println("a="+a);
    System.out.println("b="+b);
}
public static void main(String arg[])
{
    Swap ob = new Swap();
    ob.set();
    ob.swapping();
    ob.show();
}
}