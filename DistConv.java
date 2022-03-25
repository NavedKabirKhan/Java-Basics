import java.util.Scanner;
public class DistConv {
    double km,m,cm,in,ft;
    Scanner ip=new Scanner(System.in);
    void set()
    {
        System.out.println("Enter the Distance in Km : ");
        km=ip.nextDouble();
    }
    void cal()
    {
        m=km*1000;
        cm=m*100;
        in=cm/2.5;
        ft=in*12;
    }
    void show()
    {
        System.out.println("km="+km);
        System.out.println("m="+m);
        System.out.println("cm="+cm);
        System.out.println("in="+in);
        System.out.println("ft="+ft);
    }
    public static void main(String arg[])
    {
        DistConv ob = new DistConv();
        ob.set();
        ob.cal();
        ob.show();
    }
}
