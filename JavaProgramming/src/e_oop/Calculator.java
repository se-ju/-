package e_oop;

public class Calculator {

	//+,-,*,/,% 다섯개의 연산을 수행할 수 있는 계산기 클래스를 만들어주세요.
	
	
	double add(double a, double b) {
		return a + b;
	}
	
	double substract(double a, double b) {
		return a - b;
	}
	
	double multiply(double a, double b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
	
	double mod(double a, double b) {
		return a % b;
	}
	
	public static void main(String[] args) {
		//Calculator 클래스를 사용해 다음을 계산해주세요.
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator c = new Calculator();
		
		double result = c.add(123456, 654321);
		result = c.multiply(result, 123456);
		result = c.divide(result, 123456);
		result = c.substract(result, 654321);
		result = c.mod(result, 123456);
		
		System.out.println(result);
		
		
	
		
		
	}
	
	
}
