package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class addUserInfo {
	private static String uid, upw, uname;
	
   public static Connection makeConnection() {
      String url = "jdbc:mariadb://localhost/login";
      String db_id = "root";
      String db_password = "root";
      Connection con = null;
      
      try {
         Class.forName("org.mariadb.jdbc.Driver");
         System.out.println("드라이버 적재 성공");
         con = DriverManager.getConnection(url,db_id,db_password);
         System.out.println("데이터베이스 연결 성공");
      } catch(ClassNotFoundException e) {
         System.out.println("드라이버를 찾을 수 없습니다.");
      } catch(SQLException e){
         System.out.println("연결에 실패하였습니다.");
      }
      return con;
   }
   public static void addUSER(String id, String password, String name) {
      Connection con = makeConnection();
      try {
         Statement stmt = con.createStatement();
         String s = "INSERT INTO MEMBERS(id,password,name)VALUES";
         s += "('"+id+"','" + password +"','" + name +"')";
         System.out.println(s);
         int i = stmt.executeUpdate(s);
         if(i == 1)
            System.out.println("유저 정보 추가 성공");
         else
            System.out.println("유저 정보 추가 실패");
         
      }catch (SQLException e) {
         System.out.println(e.getMessage());
         System.exit(0);
      }
   }
   
   public static void deleteUser(String id) {
	   Connection con = makeConnection();
	   try {
			Statement stmt = con.createStatement();
			String s = "DELETE FROM members WHERE id = '";
			s += id + "'";
			int i = stmt.executeUpdate(s);
			if (i == 1)
				System.out.println("유저 정보 삭제 성공");
			else
				System.out.println("유저 정보 삭제 실패");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
   }
   
   public static String seleUSER(String id) throws SQLException {
       Connection con = makeConnection();
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("select * from members where id='"+id+"'");
       String passwd=null;
       while (rs.next()) {
          passwd = rs.getString("password");
       }
       return passwd;
    }
   
	public static void updatePW(String id, String password) {
		Connection con = makeConnection();
		
		try {
			Statement stmt = con.createStatement();
			String s = "UPDATE members SET password=";
			s +="'"+ password + "' WHERE id = '" +  id + "'";
			int i = stmt.executeUpdate(s);
			if (i == 1)
				System.out.println("유저 정보 수정 성공");
			else
				System.out.println("유저 정보 수정 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}
	public static void updateName(String id, String name) {
		Connection con = makeConnection();
		
		try {
			Statement stmt = con.createStatement();
			String s = "UPDATE members SET name=";
			s +="'"+ name + "' WHERE id = '" +  id + "'";
			int i = stmt.executeUpdate(s);
			if (i == 1)
				System.out.println("유저 정보 수정 성공");
			else
				System.out.println("유저 정보 수정 실패");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

}