public class add2noclass {
    int a=10,b=20,c;
    void add()   //this class will peform the calculation 
    {
        c=a+b;
    }
    void show()  //this class will show output
    {
        System.out.println("Sum = "+c);
    }
    public static void main(String[] args) {
        add2noclass ob = new add2noclass();
        ob.add();
        ob.show();
    }
}
