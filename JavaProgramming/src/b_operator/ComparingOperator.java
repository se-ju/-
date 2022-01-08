package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		
        /*
         * 비교 연산자 
         * - <, >, <=, >=, ==(같다), !=(다르다) ,프로그램에서 !는 부정의 의미로 사용
         * - 문자열 비교 : equals() (메서드를 사용해야 한다.)
		 */

		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		
		b = x <= y - 15; //산술연산이 비교연산보다 우선순위가 높다.먼저 실행
		
		String str1 = "abc";
 		String str2 = "ABC";
// 		b = str1 == str2; //같다
 		b = str1 != str2; //다르다
 		System.out.println(b);
 		// 주소를 비교하고 있는 것
 		
 		// 데이터
 		// - 기본형(8가지, 변수에 직접 저장)
 		// - 참조형(나머지, 주소를 변수에 저장, 배열과 클래스)
 		// 데이터를 저장하는 것이 다르다.
 		
// 		b = str1.equals(str2); //같다
 		b = !str1.equals(str2); //다르다
 		System.out.println(b);
 		
 		// 문제5) 다음의 문장들을 코드로 작성해주세요.
 		
 		// x는 y보다 작거나 같다.
 		 		
 		// x + 5와 y는 같다.
 		
 		// y는 홀수이다.
 		
 		// "기본형"과 "참조형"은 다르다.
 		
 		System.out.println(" --------------- ");
 		
 		b = x <= y;
 		b = x + 5 == y;
 		b = y % 2 ==1;
 		b = !"기본형".equals("참조형");
 		
 		
 		
 		
 		
 		
 		
 		
	}

}
