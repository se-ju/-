package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종진화 형태이다. (기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		// 배열의 단점은 타입이 같아야 하는 점이 단점 
		
		//변수
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
		//배열
		int[][] scores;
		int[] sum2;
		double[] avg2;
		
		//클래스
		int[] arr = new int[3];
		Student student = new Student(); //객체 생성(인스턴스화)
		//클래스의 내용을 실제로 사용할 수 있게 메모리에 올려놓는 것
		
		student.kor = 80; //.은 참조연산자(클래스 안에 있는 변수를 불러오는 것)
		student.eng = 90;
		student.math = 75;
		
		student.sum = student.kor + student.eng + student.math;
		
		//평균
		student.avg = student.sum/3.0;
		student.avg = Math.round(student.sum/3.0*100)/100.00;
		System.out.println("합계 : " + student.sum + "/n평균 : " + student.avg);
		
		Student[] students = new Student[5];
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();
		students[4] = new Student();
		
		students[0].kor = 90;
	
		
		
		
		
		
	}

}

class Student{
//	클래스를 통해 학생 한명을 포함하려고 한다. 스튜던트라는 데이터가 탄생한 것 
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
	
}