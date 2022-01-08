package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
		
        /*
         *  비트 연산자
         *  - |, &, ^, ~, <<, >>
         *  - 비트 단위로 연산한다.
         *   
         *  참조 연산자(.)
         *  - 무언가를 불러 올 때
         *  
         *  삼황연산자(?:)
         *  - 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
         */
		
		//1byte : 01010101(bit)
		
		System.out.println(10 | 15); //| : 둘다 0인 경우 0 그외 1|
		//10 : 00001010(bit)
		//15 : 00001111(bit)
		//     00001111(bit) - 15 출력
		
		int x = 10;
		int y = 20;
		
		int result = x < y ? x : y; //조건식의 boolean값을 출력한다.
		System.out.println(result); 
		
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println(gender);
		//문제는 1을 제외한 모든 숫자가 여자로 출력된다.
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println(gender);
		
	    // 문제7) 2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번재 숫자를 입력해주세요 : ");
		int a = Integer.parseInt(s.nextLine());
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int b = Integer.parseInt(s.nextLine());
		int result0 = a < b ? b : a; 
		System.out.println("더 큰 숫자는?  " + result0);
		
		// 문제8) 숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		// 그외의 숫자를 입력하면 확인불가를 출력해주세요.
		
		System.out.print("숫자를 입력해주세요 : ");
		int inNo = Integer.parseInt(s.nextLine());
		String gen = (inNo == 1) || (inNo == 3) ? "남자" 
				: (inNo == 2) || (inNo == 4) ? "여자" : "확인불가";
		System.out.println("성별 : " + gen);		
		
		
		
				
	
		
		
		
		
		
		
		
		
		
		
	}

}
