package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class addUserInfo {
	private static String uid, upw, uname;

// DB연결 메소드
// con을 통해 객체의 데이터에 접근 가능
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

// 신규 회원 가입
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

// 유저 정보 삭제
// 실제 사용되는 곳에선 버튼을 누르면 유저 정보 삭제 및 종료 실행
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

// 로그인 확인 메소드
// 입력 받은 id값을 통해 password가 일치하는지 확인
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
   
// 유저 정보 수정
// 객체에 저장된 id 값을 토대로 password 변경
// 2개의 변경 메소드가 있는 이유는 개별 수행을 위해
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

// 유저 정보 수정
// 객체에 저장된 id값을 토대로 name 변경
// 2개의 변경 메소드가 있는 이유는 개별 수행을 위해
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