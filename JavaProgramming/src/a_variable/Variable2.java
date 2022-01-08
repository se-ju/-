package a_variable; //클래스의 위치

import java.util.Scanner;
// 반드시 패키지와 클래스 사이에 반드시 위치
// crtl + shift + 0

public class Variable2 { //클래스 바로 뒤는 클래스의 이름, 클래스

	public static void main(String[] args) { //메서드 : 명령문의 집합
		
		//main 메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 쓰임)
		
		//한줄주석 : ctrl + shift + c
		/*범위주석 : ctrl + shift + /(해제:\) 드레그 한 블럭을 주석처리*/
		
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
		
//		데이터의 형대(데이터 타입 + 이름)
		
		/*
		 * 기본형 타입 = ()는 크기, byte
		 * - 정수 : byte(1), short(2), *int(4)주로, long(8)
		 * - 실수 : float(4), *double(8)주로
		 * - 문자 : char(2)
		 * - 논리 : boolean(1) 참과 거짓을 표현하는 타입
		 */
		
		int x; //변수를 만드는 것을 변수 선언이라고 표현
		
		double y; //한 중괄호 안에서만 중복되지 않으면 된다.
		
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장한다.
		x = 10; //10을 x에 저장하겠다. 초기화 : 변수에 처음으로 값을 저장하는 것
		y = 3.14; //변수의 타입에 맞는 값을 저장해야한다.
		
		int abc = 30; //일반적으로 선언과 초기화를 한번에 한다.
		long I = 40L; //접미사 L을 붙여야 long타입이 된다.
		float f = 5.5f; //접미사 f를 붙여야 float타입이 된다.
		char c = '한'; //따옴표 안에 반드시 한 글자를 넣어야 한다.
		boolean b = true; //true, false
		
		// 8가지 기본형 타입을 사용해서 8가지 변수를 선언 및 초기화 해주세요.
		
		byte _byte = 5;
		short _short = 5;
		int _int = 5;
		long _long = 15L;
		float _float = 1.2f;
		double _double = 1.5;
		char _char = '고';
		boolean _boolean = true;
		
//		새로운 값 대입하기
		x = 30;
		y = 50;
		
//		앞에서 만든 8개의 변수에 새로운 값을 저장해주세요
		
		_byte = 1;
		_short = 2;
		_int = 3;
		_long = 100L;
		_float = 1.87f;
		_double = 1.96;
		_char = '호';
		_boolean = false;
		
//		값 변경으로 새로운 값을 대입해보자
		x = 300;
		
//	    tip) 선언 할때만 타입을 붙여준다
		
		/*
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)]
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)클래스만!!]
		 */
		
//		형변환(데이터의 차입을 다른 타입으로 변경하는 것)
		int ab = 50;
		long ac = 60L;
		short ad = 70;
		byte af = 80;
		
		
//		변수 4개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
		ab = (int)ac;
		ad = (short)ac;
		af = (byte)ac;
		ac = ab;
		ac = ad;
		ac = af;
		
//		출력(콘솔)
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포맷지정");
		
		System.out.println(x);
		System.out.println(y);
		
	    String str = "문자열"; //문자열을 표현하기 위한 클래스, string class, str은 참조변수
	    System.out.println("탭은\t4칸에 맞춰 띄워준다.");
	    System.out.println("줄마꿈을\n해준다.");
	    System.out.println("\"따옴표를 넣어준다.\"");
	    System.out.println("\\역슬레시를 넣어준다.");
//	    \ 탈출문자 \ 뒤에 오는 글자의 역할을 바꿔준다.
	    
////	    입력
	    Scanner s = new Scanner(System.in);
//	    
////	    자신의 이름을 저장할 변수를 선언하고 Scanner을 사용해 이름을 저장해주세요.
//	    System.out.print("이름입력>");
//	    String myName = s.nextLine();
//	    
////	    자신의 나이를 저장할 변수를 선언하고 Scanner을 사용해 나이를 저장해주세요.
//	    System.out.print("나이 입력>");
//	    int myAge = Integer.parseInt(s.nextLine());
	    
//	    이름과 나이를 모두 출력해주세요.
	    System.out.print("이름 입력 : ");
	    String myName = s.nextLine();
	    System.out.print("나이 입력 : ");
	    int myAge = Integer.parseInt(s.nextLine());
	    
	   
	    
	    
	    
	    
	    		
		
		
					
		
		
		
		
		

	}

}
