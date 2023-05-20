import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Anup@123");
            Statement s = c.createStatement();
            String query = "create database if not exists VITBhopal;";
            s.execute(query);
            query = "use VITBhopal;";
            s.execute(query);
            query = "create table if not exists VIT_University (School_Id int, School_Name varchar(15), dean int);";
            s.execute(query);

            query = "insert into VIT_University values (1, 'Computer', 738234);";
            s.execute(query);
            query = "insert into VIT_University values (2, 'Mechanical', 738235);";
            s.execute(query);
            query = "insert into VIT_University values (3, 'Electrical', 738236);";
            s.execute(query);
            query = "insert into VIT_University values (4, 'Electronics', 738237);";
            s.execute(query);

            query = "create table if not exists programmes (programme_id int, programme_name varchar(15), school_id int, programme_chair int);";
            s.execute(query);
            query = "insert into programmes values (101, 'SCSE', 1001, 999);";
            s.execute(query);
            query = "insert into programmes values (102, 'SMEC', 2001, 777);";
            s.execute(query);
            query = "insert into programmes values (103, 'SECE', 3001, 666);";
            s.execute(query);
            query = "insert into programmes values (104, 'SEEE', 4001, 555);";
            s.execute(query);

            query = "create table if not exists faculty (faculty_id int, faculty_name varchar(15), mobile varchar(10), email_id varchar(30));";
            s.execute(query);
            query = "insert into faculty values (999, 'Ram', '9898988582', 'R@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (777, 'Shyam', '7875421332', 'S@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (666, 'Mohan', '8845122542', 'M@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (555, 'Raju', '6448452325', 'R@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (738234, 'Raja', '8452424545', 'Ra@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (738235, 'Kartik', '8452424852', 'K@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (738236, 'Naman', '8452424963', 'N@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (738237, 'Sara', '8452424741', 'S@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (1010, 'Hena', '8452412485', 'H@gmail.com');";
            s.execute(query);
            query = "insert into faculty values (1011, 'Drishti', '8452448521', 'D@gmail.com');";
            s.execute(query);
            ResultSet rs = s.executeQuery("select * from VIT_University; ");
            while (rs.next()) {
                int id = rs.getInt("School_Id");
                String name = rs.getString("School_Name");
                int dean = rs.getInt("dean");
                System.out.println("ID's are" +id + " " +"name are"+  name + " " +"dean is "+  dean);
            }

            ResultSet rp = s.executeQuery("select * from programmes; ");
            while (rp.next()) {
                String prname = rp.getString("programme_name");
                System.out.println("All programmes " + prname);
            }

            int programmeChair = 0;
ResultSet rs3 = s.executeQuery("select * from programmes where programme_name = 'SCSE';");
while(rs3.next())
{
programmeChair = rs3.getInt("programme_chair");
}
ResultSet rs4 = s.executeQuery("select * from faculty where faculty_id = "+programmeChair+" ;");
while(rs4.next())
{
System.out.println("Programme Chair Name: "+rs4.getString("faculty_name"));
}
            int dean_id = 0;

            ResultSet rr = s.executeQuery("select * from VIT_University where School_Id = 1;");

            while (rr.next())

            {

                dean_id = rr.getInt("dean");

            }

            ResultSet rs5 = s.executeQuery("select * from faculty where faculty_id = " + dean_id + ";");

            while (rs5.next())

            {

                System.out.println("Dean Email ID: " + rs5.getString("email_id") + ";");

            }

            

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
