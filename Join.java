import java.sql.*;
public class Join {
    public static void main(String[] args) {
        String query="SELECT e.emp_id,e.emp_name,d.dept_name "+
        "from students e join Students_dept d on e.dept_id=d.dept_id ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_db","root","WJ28@krhps");
            Statement st=con.createStatement();
            ResultSet rst=st.executeQuery(query);
            while (rst.next()) {
                System.out.println("ID : "+rst.getInt("emp_id")+" , Student Name : "+rst.getString("emp_name")+
                " , Student Department : "+rst.getString("d.dept_name"));
            }
            rst.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
