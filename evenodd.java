import java.util.Scanner;
public class evenodd {
    int no;
    Scanner ip = new Scanner(System.in);
    void set()
    {
        System.out.println("Enter a Number : ");
        no=ip.nextInt();
    }
    void cal()
    {
        if(no%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        evenodd ob = new evenodd();
        ob.set();
        ob.cal();
    }
}
