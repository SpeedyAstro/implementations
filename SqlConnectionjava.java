import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlConnectionjava {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","792002","792002");
            PreparedStatement ps = con.prepareStatement("insert into register values('anubhav','pandeyanubhav888@gmail.com')");
            ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
