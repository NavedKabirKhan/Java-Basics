import java.util.Scanner;
public class salarycount {
    float bs,ta,da,gs;
    // bs = basic salary
    // ta = travelling allowance
    // da = dearness allowance
    // gs = gross salary
    Scanner ip = new Scanner(System.in);
    void set()
    {
        System.out.println("Enter Basic Salary : ");
        bs=ip.nextFloat();
    }
    void cal()
    {
        ta=(bs*10)/100;
        da=(bs*20)/100;
        gs=ta+da+bs;
    }
    void show()
    {
        System.out.println("Gross Salary = "+gs);
    }
    public static void main(String[] args) {
        salarycount ob = new salarycount();
        ob.set();
        ob.cal();
        ob.show();
    }
}
