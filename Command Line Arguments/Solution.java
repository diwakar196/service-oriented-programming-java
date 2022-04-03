public class cmd1 {
public static void main(String[] args)
{
int jm,cm,rm,regno;
int tot;
float avg;
String name,remarks;
regno=Integer.parseInt(args[0]);
name=args[1];
jm=Integer.parseInt(args[2]);
cm=Integer.parseInt(args[3]);
rm=Integer.parseInt(args[4]);
tot=jm+cm+rm;
avg=(float) (tot/3.0);
if(jm>=50 && cm>=50 && rm>=50)
remarks="Pass in all Subjects";
else remarks="Fail in subjects";
System.out.println("Regno is:"+regno);
System.out.println("Name is:"+name);
System.out.println("java Mark is:"+jm);
System.out.println("C Mark is:"+cm);
System.out.println("R mark is:"+rm);
System.out.println("Total is:"+tot);
System.out.println("Average is:"+avg);
System.out.println("Remarks is:"+remarks);
}
}
