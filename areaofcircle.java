import java.util.Scanner;
public class areaofcircle {
    double a,r,pi=3.14;
    Scanner input=new Scanner(System.in);
    void set()
    {
        System.out.println("Enter Radius ");
        r=input.nextDouble();
    }
    void cal()
    {
        a=pi*r*r;
    }
    void show()
    {
        System.out.println("Area of Circle is "+a);
    }
    public static void main(String[] args) {
        areaofcircle ob=new areaofcircle();
        ob.set();
        ob.cal();
        ob.show();
    }
}
