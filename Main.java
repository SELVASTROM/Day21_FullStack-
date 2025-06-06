import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/students_db";
        String user="root";
        String password="WJ28@krhps";
        String query="INSERT INTO students (id,name,age) VALUES (?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            PreparedStatement pst=con.prepareStatement(query);
            for(int i=1;i<=3;i++){
                System.out.print("Enter the student  "+i+" id value :");
            pst.setInt(1, s.nextInt());
            s.nextLine(); 
            System.out.print("Enter the "+i+" student Name :");
            pst.setString(2,s.nextLine());
            System.out.print("Enter the "+i+" student age :");
            pst.setInt(3,s.nextInt());
            
            int rowInserted=pst.executeUpdate();
            System.out.println(rowInserted+"row(s) inserted");
            }
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        s.close();
    }
}
