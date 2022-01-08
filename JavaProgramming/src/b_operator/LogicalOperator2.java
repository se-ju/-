package b_operator;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		/*
		 * 논리 연산자
		 * - &&(AND), ||(OR, !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = 0 < x && x < 10 || x < y;
		// &&가 먼저 실행 ||다음에 실행
		// 비교연산이 먼저 실행된 다음 논리연산이 실행
		// 산술연산 > 비교연산 > 논리연산
		
		b = !(x < y); //연산을 먼저 실행해야 하기에 괄호를 하고서 ! 해주기
		System.out.println(b);
		
		// 효율적인 연산(주의해야 할 점)
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //fa;se
		
		b = true && true; //true
		b = true && false; //true
		b = false && true; //true
		b = false && false; //true
		// 왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행되지 않는다.
		
		int a = 10;
		b = a < 5 && 0 < a++; //효율적인 연산을 하기에 앞이 false라면 증감연산은 작동하지 않는다.
		System.out.println(a);
		
		// 문제6) 다음의 문장들을 코드로 작성해주세요.
		// x가 y보다 크고 x가 10보다 작거나 같다.
		// x가 짝수이고 y보다 작거나 같다.
		// x가 3의 배수이거나 5의 배수이다.
		
		b = x > y && x <= 10;
		b = x % 2 == 0 || x <= y;
		b = x % 3 == 0 || x % 5 ==0;
		
		
		

	}

}
