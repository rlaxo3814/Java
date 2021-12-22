package mc.sn.jdbc.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchMain main= new SearchMain();
		main.test1();
	}
	
	
	public void test1() {
		//전체조회 테스트 --> readAll호출
		//this.readAll();
		try {
			this.readAll();
			readCondition("JYP     ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//조건 조회
		//this.readCondition(null);
			}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//컴퓨터 위치
		String id = "HR";
		String pwd = "1234";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pwd);
		
		return con;
	}
	
	
	public void readAll() throws SQLException, ClassNotFoundException {
		//전체 조회 userTBL
		/* 1. DB 연결
		 * 2. 쿼리를 보내는 통로 생성 
		 * 3. 쿼리 보내고
		 * 4. 결과 받고
		 * 5. 연결종료
		 * 6. 결과처리
		 */
		Connection con = this.getConnection();//1.반드시 외우기
		Statement stmt = con.createStatement();//2.반드시 외우기
		String sql = "select * from userTBL";//3.반드시 외우기
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery(sql);//4.반드시 외우기
		while(rs.next()){
			//조회한 내용을 컬렉션으로 변경
			System.out.println(rs.getString("userId")+","+rs.getString("userName")+","+rs.getInt("birthYear"));
		}
		rs.close();//5.반드시 외우기
		stmt.close();
		con.close();
	}
	
	public void readCondition(String data) throws ClassNotFoundException, SQLException {
		//조건 조회
		String sql = "select * from userTBL WHERE userId = ?";
		Connection con = this.getConnection();
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, data);
		System.out.println(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			//조회한 내용을 컬렉션으로 변경
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getInt(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
