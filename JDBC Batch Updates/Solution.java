import java.sql.*;
 class DBbatup
 {
 public static void main(String args[])
 {
 Connection con=null;
 Statement stmt=null;
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my123","root","root");
stmt = con.createStatement();
stmt.addBatch("update people set firstname='nasan',lastname='ellil' where id=1");
stmt.addBatch("update people set firstname='Eric',lastname='john' where id=2");
stmt.addBatch("update people set firstname='May',lastname='julian' where id=3");
System.out.println("records updated");
stmt.executeBatch();
//String sql = "update people set firstname=? , lastname=? where id=?";
PreparedStatement ps = null;
ps = con.prepareStatement("update people set firstname=? , lastname=? where id=?");
ps.setString(1, "Gary");
ps.setString(2, "Larson");
ps.setLong (3, 2);
ps.addBatch();
 ps.setString(1, "Stan");
 ps.setString(2, "Lee");
 ps.setLong (3, 3);
 ps.addBatch();
ps.executeBatch();
System.out.println("Records Updated using Prepared Statement");
 ResultSet rs=stmt.executeQuery("select * from people");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
}
 catch(Exception e)
 {
 System.out.println(e+" File not found");
 System.exit(0);
 }
 finally
 {
 }
} }