import java.util.Scanner;
public class leapyearifelse {
    int year;
    Scanner ip= new Scanner (System.in);
    void set()
    {
        System.out.println("Enter Year  ");
        year=ip.nextInt();
    }
    void cal()
    {
        if(year%4==0)
        {
            System.out.println("Is a Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        leapyearifelse ob = new leapyearifelse();
        ob.set();
        ob.cal();
    }
}
