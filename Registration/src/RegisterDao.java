import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	private String dburl="jdbc:mysql://localhost:3306/family";
	private String uname="root";
	private String pwd="9963";
	private String driver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String driver) {
		try {
			Class.forName(driver);
			System.out.println("driver load success");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl,uname,pwd);
			System.out.println(" data base connection success");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Member member) {
	
	String result="data inserted successfully";
	
	loadDriver(driver);
	Connection con=getConnection();
	String sql="INSERT INTO member VALUES(?,?,?,?)";
	PreparedStatement ps;
	try {
	    ps=con.prepareStatement(sql);
		ps.setString(1,member.getUname());
		ps.setString(2,member.getPasward());
		ps.setString(3,member.getEmail());
		ps.setString(4,member.getPhone());
		ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
		result="data not entered";
	}	
	return result;
	}

}
