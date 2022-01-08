package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		// 과제2) 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		double num1 = Double.parseDouble(s.nextLine());
		System.out.print("두번째 숫자 : ");
		double num2 = Double.parseDouble(s.nextLine());
		System.out.print("연산자 입력 : ");
		String a = s.nextLine();
		
		double num = a.equals("+") ? num1 + num2 : 
			          a.equals("-")? num1 - num2 :
			          a.equals("*")? num1 * num2 :	  
			       	  a.equals("/")? num1 / num2 :
			          a.equals("%")? num1 % num2 : 0;
		
		num = Math.round(num * 100000) / 100000.0;
		
		//System.out.print("계산결과 ----- " + num);
		System.out.println(num1 + "" + a + "" + num2 + " = " + num);
		

	}

}
