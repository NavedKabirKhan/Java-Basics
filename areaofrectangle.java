import java.util.Scanner;
public class areaofrectangle {
    double a,l,b;
    Scanner input=new Scanner(System.in);
    void set()
    {
        System.out.println("Enter length ");
        l=input.nextDouble();
        System.out.println("Enter Bredth ");
        b=input.nextDouble();
    }
    void cal()
    {
        a=l*b;
    }
    void show()
    {
        System.out.println("Area of Rectangle is "+a);
    }
    public static void main(String[] args) {
        areaofrectangle ob=new areaofrectangle();
        ob.set();
        ob.cal();
        ob.show();
    }
}
