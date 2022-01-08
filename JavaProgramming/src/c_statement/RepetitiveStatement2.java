package c_statement;

public class RepetitiveStatement2 {

	public static void main(String[] args) {
		
		/*
		 * 반복문
		 * - for문
		 * - while 문
		 * - do-while문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 */
		
		for(int i = 1; i<= 10; i++) {
			System.out.println(i);
		}
		//for문 안에 int i;는 지역변수이기 때문에 for문 밖에서 사용을 못한다.	
        //i라는 변수의 값을 1무터 시작해서 10이 될 때까지 1씩 증가한다. 1~10까지 출력
		//비슷한 문장이 반복될 때 사용
		
		//초기화 : 조건식과 증감식에 사용할 변수 초기화
		//조건식 : 연산결과가 true이면 블럭안의 내용을 수행
		//조건식 : 변수를 증가/감소시켜 반복문을 제어
		
		int sum = 0; //1부터 10까지 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		
	}

}
