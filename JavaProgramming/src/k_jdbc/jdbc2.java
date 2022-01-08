package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class jdbc2 {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 *  - 자바와 데이터베이스를 연결해주는 라이브러리
		 *  - ojdbc : 오라클 JDBC
		 *  
		 * JDBC 작성 단계
		 * 1. Connection 생성(DB 연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출 (select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기 
		 */
		
		//마우스 오른쪽 - build path
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PSJ91";
		String password = "java";		
		
		//데이터베이스 접속 정보
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		//기본 세팅
		//컴파일에러 -> try-catch

		try {			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from cart"
					+ " where cart_member = ?"
					+ " and cart_qty > ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "b001"); //?의 인덱스, 넣을 값
			ps.setInt(2,3);
			
			rs = ps.executeQuery();
			
//			rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터 ctrl + 1 -> local variable
//	      ↓
			
			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount(); //컬럼 수
			
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close(); } catch(Exception e) {}
			if(ps != null) try {ps.close(); } catch(Exception e) {}
			if(con != null) try {con.close(); } catch(Exception e) {}
		}

	}

}
