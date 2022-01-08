package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭 안의 문장을 수행한다. - else if(조건식){} : 다수의 조건이
		 * 필요할 때 if 뒤에 추가한다. - else{} : 조건식 이외의 경우를 위해 추가한다.(조건식이 따로 없다)
		 */

		int a = 1; // 실행 O
		// int a = 2; //실행 X

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 1) {
			System.out.println("a == 1");
		} else if (a == 2) {
			System.out.println("a == 2");
		} else if (a == 3) {
			System.out.println("a == 3");
		} else {
			System.out.println("else");
		} // 한번만 실행이 되더라도 if문을 나오게 된다.

		// 실수하는 부분 - 둘 다 실행되기에 의도한 바가 아니다.
		// 2번째 if 앞에 else 넣기
		if (a < 10) {
			System.out.println("a가 10보다 작다.");
		}
		if (a < 20) {
			System.out.println("a가 20보다 작다.");
		}

		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격
		int score = 70;

		if (60 <= score) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 점수에 등급을 부여
		score = 80;
		String grade = null; // null : 값이 없다. 참조형 타입의 기본값
		// 기본값 : 내가 저장하지 않았을 때 자동으로 저장되는 값
		// 기본형 타입은 기본값이 0
		// boolean : false 만 제외

//		if(90 <= score && score <= 100) {
//			grade = "A";
//		}else if(80 <= score) {
//			grade = "B";
//		}else if(70 <= score) {
//			grade = "C";
//		}else if(60 <= score) {
//			grade = "D";
//		}else {
//			grade = "F";
//		}
//		System.out.println(score + "점은 " + grade + "등급입니다.");

		score = 90;
		grade = null;

		// 자동정렬 : ctrl + shift + f
		// tab으로 띄어쓰기 정리하기

		if (90 <= score && score <= 100) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-;";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점은 " + grade + "등급입니다.");

		/*
		 * switch문 
		 * - switch(int/String){case 1: break;} 
		 * - 조건식의 결과는 정수와 문자열만 (JDK 1.7부터는 문자열 허용) 허용한다. 
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 20;
		
		switch(a) {
		case 10:
			System.out.println("a == 10");
			break;
		case 20:
			System.out.println("a == 20");
			break;
		default:
			System.out.println("default");
		} //switch보다는 if문을 더 많이 사용

		
		//월에 해당하는 계절을 출력
		int month = 1;
		String season = null;
		switch(month) {
		case 3:
		case 4:	
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
		case 9:
			season = "여름";
			break;
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:	
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season +"입니다.");
		
		
		
		//case문 줄여보기
		
		score = 80;
		
		grade = null;
		switch(score / 10) {
		
		case 10:
		case 9:	
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(grade + "등급");
		
		
//		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
//		
		Scanner s = new Scanner(System.in);
//		
//		System.out.println("---------------");
//		System.out.println("숫자를 입력해주세요 : ");
//		int num = Integer.parseInt(s.nextLine());
//		
//		
//		if (num == 0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("0이 아닙니다.");
//		}
//		
		// 홀수인지 짝수인지 출력해주세요.
		
		System.out.println("---------------");
		System.out.print("홀수 / 짝수 : ");
		int ad = Integer.parseInt(s.nextLine());
		
		if (ad % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
			
			
		// 점수 3개를 입력받아 합계, 평균, 등급을 출력해주세요.
		
		System.out.println("---------------");
		System.out.print("점수 : ");
		int score1 = Integer.parseInt(s.nextLine());
		System.out.print("점수 : ");
		int score2 = Integer.parseInt(s.nextLine());
		System.out.print("점수 : ");
		int score3 = Integer.parseInt(s.nextLine());
		
		int add = score1 + score2 + score3;
		int avg = add / 3;
		String grade1 = null;
		
		if (90 <= avg) {
			grade1 = "A";
		}else if(80 <= avg) {
			grade1 = "B";
		}else if(70 <= avg) {
			grade1 = "C";
		}else if(60 <= avg) {
			grade1 = "D";
		}else {
			grade1 = "F";
		}
		System.out.println("총점 : " + add + ", " + "평균 : " + avg + ", " + grade1 + "등급입니다.");

		
		
		// 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		
		
		
		 System.out.println("---------------");
		 
		 int n1 = (int)(Math.random() * 100) + 1;
		 int n2 = (int)(Math.random() * 100) + 1;
		 int n3 = (int)(Math.random() * 100) + 1;
		 
		 // 랜덤으로 나오는 숫자를 비교를 하면서 가장 작은 숫자를 1번에 넣는다.
		 
		  if(n1 > n2) {
			 int asd = n2; 
			 n2 = n1;
			 n1 = asd;
		 }if(n1 > n3) {
			 int asd = n1;
			 n1 = n3;
			 n3 = asd;
		 }if(n2 > n3){
			 int asd = n2;
			 n2 = n3;
			 n3 = asd;
		 }
		 System.out.println(n1 + " < " + n2 + " < " + n3);
		 
       
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		

		
		
		
		
	}

}
