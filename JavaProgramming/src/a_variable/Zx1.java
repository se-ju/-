package a_variable;

import java.util.Scanner;

public class Zx1 {

	public static void main(String[] args) {
		
		// x에 변수선언을 해보자. 
		
		int x;
		
		
		// y에 변수선언을 해보자.
		
		int y;
				
		
		
		// 동시 변수선언을 해보자.
		
		int a,b;
		
		
		// x에 50, y에 60의 값을 넣어보자.
		
		x = 1;
			
						
		// 선언과 초기화 한번에 해보자.
		
		y = 2;
				
				
		// 8가지 기본형 타입을 사용해서 8가지 변수를 선언 및 초기화 해보자.
		
		byte a1 = 1;
		short a2 = 5;
		int a3 = 92;
		long a4 = 80000L;
		float a5 = 65.123f;
		double a6 = 768.26546d;
		char a7 = 'r';
		boolean a8 = true;
		
		
		// 앞의 8개의 변수에 새로운 값을 저장해보자.
		
	    a1 = 3;
	    a2 = 6;
	    a3 = 100;
	    a4 = 90000L;
	    a5 = 89.34225f;
	    a6 = 89352.53d;
	    a7 = 'a';
	    a8 = false;
	    		
		
	    // 위의 값을 다른 타입으로 변경해보자.
	    	    
	    a3 = (int)a4;
	    a3 = (int)a6;
	    a5 = (float)a6;
	    
	    	
		// 자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해보자.
	    
	    
//	    System.out.println("이름음 입력해주세요 : ");
//	    Scanner c = new Scanner(System.in);
//	    String name = c.nextLine();
	    

	    
	    	    			    		
		// 자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 나이를 저장해보자.
		
//	    System.out.println("나이를 입력해주세요 : ");
//	    int age = c.nextInt();

	    	    	    
	    // 자신의 나이와 이름을 같이 출력해보자.
		
//	    System.out.println("이름 : " + name + ", 나이 : " + age);

		
		
	    //간단한 시간표 tool 출력해보기
		//     국어  영어  수학  사회  과학
	    //1교시
	    //2교시
	    //3교시
	    //4교시
	    //5교시
		
	
//	    System.out.println("\t국어\t엉어\t수학\t사회\t과학");
//	    System.out.println("1교시\n2교시\n3교시\n4교시\n5교시");
//		
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
	    
		System.out.println("=============회원가입=============");
		
		System.out.print("아이디> ");
		String id = s.nextLine();
		
		System.out.print("비밀번호 (4자리 숫자)> ");
		int pw = Integer.parseInt(s.nextLine());
		
		System.out.print("이름> ");
		String name = s.nextLine();
		
		System.out.print("나이> ");
		int age = Integer.parseInt(s.nextLine());
		
		System.out.print("키> ");
		double height = Double.parseDouble(s.nextLine());
		
		System.out.println("==========================");
		System.out.println("==========내 정보===========");
		System.out.println("아이디> " + id);
		System.out.println("비밀번호(4자리 숫자)> " + pw);
		System.out.println("이름> " + name);
		System.out.println("나이> " + age);
		System.out.println("키> " + height);
		System.out.println("회원가입 완료!!!");
		
		

	}

}
