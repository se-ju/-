package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {

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
			con = DriverManager.getConnection(url, user, password);
					
			String sql = "select *"
					+ " from member";
			ps = con.prepareStatement(sql);
					
			//select
			rs = ps.executeQuery(); 
					
			//insert, update, delete
		 	//int result = ps.executeUpdate(); //영향받은 행(row)의 수를 리턴
		    
			while(rs.next()){ //rs의 다음행이 있는지 없는지 확인하는 메서드
				String memId = rs.getString(1); //인덱스로 값을 가져오기(인덱스는 1부터 시작)
				String memPass = rs.getString("MEM_PASS"); //컬럼명으로 값을 가져오기
				String memName = rs.getString("MEM_NAME");
				System.out.println("MEM_ID : " + memId + " \t MEM_PASS : " + memPass
						+ " \t MEM_NAME : " + memName);
		 	
		 	}
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close(); } catch(Exception e) {}
			if(ps != null) try {ps.close(); } catch(Exception e) {}
			if(con != null) try {con.close(); } catch(Exception e) {}
		} //open한 순서 반대로 close

	}

}
