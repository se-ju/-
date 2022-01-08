package a_variable;

import java.util.Scanner;

public class join {

	public static void main(String[] args) {
		/*  
		 * 아래와 같은 프로그램을 만들어주세요 .
		 * 
		 *  ============ 회원가입 ===============
		 *  아이디>admin
		 *  비밀번호(4자리숫자)>1234
		 *  이름 > 홍길동
		 *  나이 > 99
		 *  키 > 180.5
		 *  ==================================
		 *  =========== 내 정보 ================
		 *  아이디 : admin
		 *  비밀번호 : 1234
		 *  이름 : 홍길동
		 *  나이 : 99세
		 *  키 : 180.5cm
		 *  ===================================
		 *  회원가입 완료!
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("========== 회원가입 ==========");
		
		System.out.print("아이디>");
		String id = s.nextLine();
		
		System.out.print("비밀번호(4자리숫자)>");
		int password = Integer.parseInt(s.nextLine());
		
		System.out.print("이름>");
		String name = s.nextLine();
		
		System.out.print("나이>"); // 나이는 int로
		int age = Integer.parseInt(s.nextLine());
		
		System.out.print("키>"); // 키는 double로
		double height = Double.parseDouble(s.nextLine());
		
		
		System.out.println("=========== 내 정보 ============");
		System.out.println("아이디 : " + id); // 변수를 같이 출력하기 위해서 +로 추가해준다.
		System.out.println("비밀번호  : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("회원가입 완료!");
	}

}
