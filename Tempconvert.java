import java.util.Scanner;
public class Tempconvert{
    double C,F;
    Scanner ip=new Scanner(System.in);
    void set()
    {
        System.out.println("Enter Temperature (in Fahrenheit) ");
        F=ip.nextDouble();
    }
    void convert()
    {
       C=(F-32)*5/9;
    }
    void show()
    {
        System.out.println("Temperature in Celsius is "+C);
    }
    public static void main(String[] args) {
        Tempconvert ob=new Tempconvert();
        ob.set();
        ob.convert();
        ob.show();
    }
}


    
    
    