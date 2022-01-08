package e_oop;

public class oop {
	
	//새로운 OPP라는 클래스에서 SampleClass에서 만든 변수와 메서드 사용
	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 고드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.코드를 분리하면 재사용성이 좋다.
		 */
		
		/* SampleClass
		 * 용어정리
		 * 지역변수 - 메서드 안에서만 사용하는 변수
		 * 전역변수 - 클래스 전체 영역에서 사용하는 변수로 초기화하지 않아도 기본값으로 초기화된다. 
		 */
		
		/* SampleClass
		 * 메서드
		 * 변수를 가지고 할 일
		 * 선언방법 : 리턴타입 메서드명(파라미터) {}
		 * 파라미터(매개변수) : 실행에 필요한 정보
		 * 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
		 * ** 리턴타입이 있는경우 return을 해줘야하며, 리턴타입이 없는 void에서 return은 메서드를 종료시키는 역할을 한다.
		 */
		
		SampleClass sc = new SampleClass(); //객체 생성
		//객체생성, 메모리에 올라가고 저장된 주소를 반환한다.
		
		
		System.out.println(sc.field); //기본값 0
		// 0 출력 : 전역변수는 기본값이 출력
		
		
		String returnValue = sc.method(5);
		System.out.println(returnValue);
		//5 를 받아 명령을 수행하고 결과물을 리턴하는 메서드 출력
		
		
		sc.method2();
		//파라미터도 리턴타입도 없는 메서드 출력
		
		sc.flowTest1();
		
		//방금 만들 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메서드를 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		
		ClassMaker as = new ClassMaker();
	    
		as.a();
	    
		int b = as.b();
	    System.out.println(b);
	    
	    as.c("abc");
	    
		System.out.println(as.d(15, 48));
		
		
		
		

	}

}
