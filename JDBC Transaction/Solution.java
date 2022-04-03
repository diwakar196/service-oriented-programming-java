import java.sql.*;
 class DBbatup
 {
 public static void main(String args[])
 {
 Connection con;
 try
 { Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my123","root","root");
 Statement stmt=null;
 try{
 con.setAutoCommit(false);
 stmt = con.createStatement();
stmt.executeUpdate("update stud1 set lname='John' where rollno=101");
 System.out.println("Row updated successfully");
 }
 finally {
 if(stmt != null) {
 stmt.close();
 }
 }
 CallableStatement cs;
 Statement s2;
 try
 { cs=con.prepareCall("{call proc1(?,?,?)}");
 cs.setInt(1,102);
cs.setString(2,"Gary");
 cs.setString(3,"Larson");
 cs.addBatch();
 cs.setInt(1,104);
 cs.setString(2,"Stan");
 cs.setString(3,"Lee");
 cs.addBatch();
 cs.executeBatch();
System.out.println("Two Records Updated using Callable Statement");
 s2=con.createStatement();
 ResultSet rs=s2.executeQuery("select * from stud1");
 while(rs.next())
 {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
 }
 }
 finally
 { }
 con.commit();
 } catch(Exception e)
 { System.out.println("Error"+e.getMessage());
 }
 finally
 { }
 } }
