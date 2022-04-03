import java.util.Scanner;
class fund extends Exception
{ Scanner s;
int bal,amt;
String m;
fund(String s)
{ bal=500;
m=s;
System.out.println(m);
}
void compute()throws fund
{
try
{
System.out.println("Enter Amount");
s=new Scanner(System.in);
amt=s.nextInt();
if(bal<amt)
throw new fund("Insufficient");
else
bal=bal-amt;
System.out.println(bal);
}
catch(fund e)
{
System.out.println(e.getMessage());
}
finally{
}
}
}
class ex1 {
public static void main(String[] args) {
try
{
fund f=new fund("User Define Exception:");
f.compute();
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}