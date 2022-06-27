
import java.sql.*;
public class Employee {
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Di7023510013$");
Statement stmt=con.createStatement();
stmt.executeUpdate("drop table emp5;");
stmt.executeUpdate("create table emp5(eno int(5),ename varchar(20),esal int(5), edes varchar(10))");
stmt.executeUpdate("insert into emp5 values('101','aaa','5000','manager'),('102','bbb','6000','officer'),('104','ddd',8000,'accountant');");
stmt.executeUpdate("delete from emp5 where eno=101;");
stmt.executeUpdate("update emp5 set esal=10700 where eno=104;");
ResultSet rs=stmt.executeQuery("select * from emp5");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
con.close();
}catch(Exception e){ System.out.println(e);}
}
}
