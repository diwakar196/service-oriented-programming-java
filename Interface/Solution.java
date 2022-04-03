import java.util.Scanner;
public interface int1 {
    int regno=101;
    void input();
    String compute();
    void display(String s1);
    }
    interface int2 extends int1
    {
    void display();
    }
    public class stuint implements int2
    {
    int jm,cm,pm,tot,avg;
    String remarks;
    Scanner s;
    public void input()
    {
    s=new Scanner(System.in);
    System.out.println("Enter the Java mark, Cm, PM");
    jm=s.nextInt();
    cm=s.nextInt();
    pm=s.nextInt();
    }
    public String compute()
    { tot=jm+cm+pm;
    avg=tot/3;
    if(avg>=75)
    remarks="Passed with Distinction";
    else if(avg>=60 && avg<75)
    remarks="Passed with I class";
    else if(avg>=50 && avg<60)
    remarks="Pass";
    else remarks="Fail";
    return remarks;
    }
    public void display(String s)
    { System.out.println("Reg no is:"+regno);
    System.out.println("Total is:"+tot);
    System.out.println("Avg is:"+avg);
    System.out.println("Remarks"+s);
    }
    public static void main(String[] args)
    { int1 i1=new stuint();
    i1.input();
    String s1=i1.compute();
    i1.display(s1); }
    }