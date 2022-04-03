import java.util.Scanner;
public abstract class theory
{
int s1,s2;
void getdata1()
{ Scanner s=new Scanner(System.in);
System.out.println("Enter the marks1:");
s1=s.nextInt();
System.out.println("Enter the marks2:");
s2=s.nextInt();
}
abstract String display();
}
import java.util.Scanner;
public class practical extends theory
{String rem;
void getdata2()
{ Scanner s=new Scanner(System.in);
System.out.println("Enter the marks1:");
s1=s.nextInt();
System.out.println("Enter the marks2:");
s2=s.nextInt();
}
public String display()
{ if(s1>=50 && s2>=50)
rem="pass";
else rem="fail";
return rem;
}
}