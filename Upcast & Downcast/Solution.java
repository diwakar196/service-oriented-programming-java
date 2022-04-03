class Alliance
{ }
class ACED extends Alliance
{ static void method(Alliance a)
{ if(a instanceof ACED)
{ ACED d=(ACED)a;
System.out.println("Student of ACED");
}
}}
class ASOB extends Alliance
{ static void method(Alliance a)
{ if(a instanceof ASOB)
{ ASOB d=(ASOB)a;
System.out.println("Student of ASOB");
} }
}
class downcast {
public static void main(String[] args)
{ Alliance a1=new ACED();
Alliance a2=new ASOB();
ACED.method(a1);
ASOB.method(a2);
}
}
