class Box
{
double width,height,depth;
Box()
{height=10; width=10; depth=20; }
Box(double l)
{
width=height=depth=l;
}
Box(double w,double h,double d)
{ width=w;
height=h;
depth=d;
}
Box(Box ob)
{ width=ob.width;
height=ob.height;
depth=ob.depth;
}
double volume()
{ System.out.print("The volume of Box is:");
return (width*height*depth);
}
}
class BoxWeight extends Box
{
double weight;
BoxWeight()
{super(); }
BoxWeight(double l)
{super(l);
weight=l;
}
BoxWeight(double w,double h,double d,double w1)
{ super(w,h,d);
weight=w1;
}
BoxWeight(BoxWeight ob)
{ super(ob);
weight=ob.weight;
}
}
class BoxShiftment extends BoxWeight
{ double cost;
BoxShiftment()
{super(); }
BoxShiftment(double l)
{super(l);
cost=l; }
BoxShiftment(double w,double h,double d,double w1,double c)
{ super(w,h,d,w1);
cost=c; }
BoxShiftment(BoxShiftment ob)
{ super(ob);
cost=ob.cost; }}
class BoxEx
{ public static void main(String a[])
{ BoxShiftment bs1=new BoxShiftment();
System.out.println(bs1.volume());
BoxWeight bw1=new BoxWeight(10);
System.out.println(bw1.volume());
//bs1=bw1;
bw1=bs1;
System.out.println(bw1.volume());
}}
