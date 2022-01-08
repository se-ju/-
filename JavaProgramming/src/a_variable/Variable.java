package a_variable; //클레스의 위치

import java.util.Scanner;
//반드시 패키지와 클래스 사이에 반드시 위치
//ctrl + shift + o

public class Variable { //클래스 바로 뒤는 클래스의 이름, 클래스

	public static void main(String[] args) { //메서드 : 명령문의 집합
		//main 메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 쓰임)
		
		//한줄 주석 : ctrl + shift + c
		/*범위 주석 : ctrl + shift + /(해제:\) 드레그 한 블럭을 주석처리 */
		
		/* 
		* 데이터
		* - 기본형
		* - 배열
		* - 클래스
		*
		* 조작
		* - 산술연산
		* - 비교연산
		* - 논리연산
		* - 조건문
		* - 반복문
		*/

		//데이터의 형태(데이터 타입) + 이름
		
		/* 외우기
		* 기본형 타입 - ()는 크기, byte
		* - 정수 : byte(1/-128~127),short(2/-3만~3만), 
		*		 *int(4/약20억)주로, long(8)
		* - 실수 : float(4/7자리), *double(8/15자리)주로
		* - 문자 : char(2/음수값을 가질 수 없음)
		* - 논리 : boolean(1) 참과 거짓을 표현하는 타입
		*/
		
		int x;
		//변수를 만드는 것을 변수 선언이라고 표현한다.
		
        //double x;
		double y; // 한 중괄호 안에서만 중복되지 않으면 된다.
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장한다.
		x = 10; //10을 x에 저장하겠다. 초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
		long I = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; //따옴표 안에 반드시 한 글자를 넣어야 한다.
		boolean b = true; //true, false
		
		//8가지 기본형 타입을 사용해서 8가지 변수를 선언 및 초기화 해주세요.
		
		byte a1 = 1;
		short a2 = 2;
		int a3 = 3;
		long a5 = 5L;
		float a6 = 1.1f;
		double a7 = 2.1;
		char a8 = '박';	
		boolean a9 = true;
				
		x = 20; //값 변경 : 새로운 값을 대입하면 된다.
		y = 1.5; //선언 할때만 타입을 붙여준다.
		
		// 앞에서 만든 8개의 변수에 새로운 값을 저장해주세요.
		
		a1 = 3;
		a2 = 6;
		a3 = 9;
		a5 = 10L;
		a6 = 2.7f;
		a7 = 3.2;
		a8 = '준';
		a9 = false;
		
		/*
		* 명명규칙
		* - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
		* - 숫자로 시작할 수 없다.
		* - 예약어는 사용할 수 없다.
		*   (예약어 : 자바에서 이미 사용하고 있는 단어)
		* - [낙타식 표기법을 사용한다.(mySampleVariable)]
		* - [클래스명의 첫글자는 대문자로 한다.(MySmpleClass)클래스만!!!]		
		*/
		
		//형변환(데이터의 타입을 다른 타입으로 변경하는 것)
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long;
		_long = _int; //표현범위가 작은 타입에서 큰 타입의 형변환은 생략할 수 있다.(작은 쪽 -> 큰 쪽)
		// 데이터를 손실할 가능성 때문에
		
		// 변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
		
		int _in = 100;
		long _lon = 100L;
		
		_in = (int)_long;
		
		
		//출력(콘솔)
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포멧 지정");
		//ctrl + f11
		
		System.out.println(x);
		System.out.println(y);
		
		String str = "문자열"; //문자열을 표현하기 위한 클래스, string class, str은 참조변수
		System.out.println(str + x + y);
		System.out.println(x + y + str);
		//숫자끼리 연산 후 문자열로 변환된다.
		
		//탈출 문자(Escape 문자)
		System.out.println("탭은\t4칸에 맞춰 띄워줍니다.");
		System.out.println("줄바꿈을\n해줍니다.");
		System.out.println("\"따옴표를 넣어줍니다.\"");
		System.out.println("\\역슬레시를 넣어줍니다.");
		// \ 탈출문자 \ 뒤에 오는 글자의 역할을 바꿔준다.
		
		//입력
		Scanner s = new Scanner(System.in);
		
//		System.out.print("아무거나 입력해주세요>");
//		String str2 = s.nextLine(); 
//		//괄호가 붙으면 무조건 메서드다.
//		//사용자가 입력할 때까지 실행이 중단된다.
//		System.out.println("입력받은 내용 : " + str2);
//		
//		System.out.print("숫자 입력>");
//		int num = s.nextInt();
//		System.out.println("입력받은 숫자 : " + num);
//		System.out.print("문자열 입력>");
//		String str3 = s.nextLine();
//		System.out.println("입력받은 문자열 : " + str3);
//		System.out.println("입력 끝!");
//		
//		//버그가 있어서 가능한 안사용하는 것이 좋다.
//	
//		System.out.print("숫자입력>");
//		int num = Integer.parseInt(s.nextLine()); //정수
//		double num2 = Double.parseDouble(s.nextLine()); //실수
//		System.out.println(num);
		
		
		
		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해주세요.
		
//		Scanner scan = new Scanner(System.in);
		System.out.println("자신의 이름을 입력하시오 >");
		String myName = s.nextLine();
//		System.out.println(myName);
		
//	    System.out.print("이름 입력>");
//	    String myName = s.nectLine();
	    
	    //자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 나이를 저장해주세요.
	    System.out.print("나이를 입력하시오 >");
	    int myAge = Integer.parseInt(s.nextLine()); 
	    
	    //이름과 나이를 출력해주세요.
	    System.out.println("이름 : " + myName + " / 나이 : " + myAge);
	    
		
		
		
	    }

}
