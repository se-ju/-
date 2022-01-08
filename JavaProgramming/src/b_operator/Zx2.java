package b_operator;

import java.util.Scanner;

public class Zx2 {

	public static void main(String[] args) {
		
		
		
		
		// 문제1) 5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		
		int qw = 5+2;
		int qe = 6-2;
		int qr = 5*7;
		int qt = 4/2;
		int qy = 5/2;
		
		System.out.println(qw + qe + qr + qt + qy);
		
		
			
				
		// 문제2) 아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		// result = result % 5;
		// result = result - 2; 
		
		int result = 1;
		
		result += 10;
		result %= 5;
		result -= 2;
		
	
			
		// 문제3) 다음을 한줄식 계산해서 최종 결과값을 출력해주세요.
		
		// 1. 123456 + 654321
	    // 2. 1번의 결과값  * 123456
	    // 3. 2번의 결과값  / 123456
	    // 4. 3번의 결과값 - 654321
	    // 5. 4번의 결과값 % 123456
		
		long v = 123456 + 654321;					
		System.out.println("더하기 : " + v);
		
		v *= 123456;
		System.out.println("곱하기 : " + v);
		
		v /= 123456;
		System.out.println("나누기 : " + v);
		
		v -= 654321;
		System.out.println("빼기 : " + v);
		
		v %= 123456;
		System.out.println("나머지 : " + v);
		
		
		
			
		// 문제4) 3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int sum = x + y + z;
		double avg = sum / 3;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		
					
		
		// 문제5) 다음의 문장들을 코드로 작성해주세요.
		// x는 y보다 작거나 같다.
	 	// x + 5와 y는 같다.
		// y는 홀수이다.
		// "기본형"과 "참조형"은 다르다.
		
		boolean a = true;
		
		a = x <= y;
		a = x + 5 == y;
		a = y % 2 == 1;
		a = "기본형" != "참조형";
		
		
		
		
		
		
		//문제6) 다음의 문장들을 코드로 작성해주세요.
		// x가 y보다 크고 x가 10보다 작거나 같다.
		// x가 짝수이고 y보다 작거나 같다.
		// x가 3의 배수이거나 5의 배수이다.
		
		a = x > y && x <= 10;
		a = x % 2 == 0 && x <= y;
		a = x % 3 == 0 || x % 5 == 0;
		
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		
		
 
		
		
		// 문제7) 2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		
		

		
			
		// 문제8) 숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		// 그외의 숫자를 입력하면 확인불가를 출력해주세요.
		
	    
	   
		
		// 과제2) 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
	
		
		
		
		
		
		
		
		
	}

}
