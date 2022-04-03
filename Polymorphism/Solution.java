import java.util.Scanner;
class Bank
{ //int roi;
int getroi()
{ return 2;
}
}
class SBI extends Bank
{ int getroi()
{
return 4;
}
}
class HDFC extends Bank
{ int getroi()
{ return 5;
}
}
class poly {
public static void main(String[] args)
{
double p,n,r,r1,r2,si;
double ci;
Scanner s=new Scanner(System.in);
System.out.println("Enter p,n,r");
p=s.nextInt();
n=s.nextInt();
Bank b=new Bank();
r=b.getroi();
si=(p*n*r)/100;
double amt=p+si;
ci=p*Math.pow((1+r/100),n);
System.out.println("Amt is:"+amt+"\n"+"CI is:"+ci);
SBI sb=new SBI();
r1=sb.getroi();
si=(p*n*r1)/100;
ci=p*Math.pow((1+r1/100),n);
System.out.println("SI is:"+si+"\n"+"CI is:"+ci);
HDFC h=new HDFC();
r2=h.getroi();
si=(p*n*r2)/100;
ci=p*Math.pow((1+r2/100),n);
System.out.println("SI is:"+si+"\n"+"CI is:"+ci);
}
}
