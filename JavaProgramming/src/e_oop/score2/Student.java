package e_oop.score2;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	
	//랜덤 점수 생성 메서드
	void randomScore(){
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
	}
	
	//과목 합계 메서드
	int scoreSum() { //합계를 구하는데 필요한 정보를 이미 가지고 있어서 파라미터X
		return sum = kor + eng + math;
		//sum = kor + eng + math;
		//return sum;
	}
	
	//과목 평균 메서드
	double scoreAvg() {
		return avg = Math.round(scoreSum() / 3.0 * 100)/100.00;
	}
	
	//석차 메서드 (비교대상이 있으면 구할 수 있다.)
	//정렬은 학생과 상관이 없다.
	int scoreRank(Student[] students) {
		rank = 1;
		for (int i = 0; i < students.length; i++)
			if (scoreSum() < students[i].scoreSum()) {
			rank++;
			}
				return rank;
	}
	
	
	
	//정보 제공 메서드
	
	String scoreInfo() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
	                  + sum + "\t" + avg + "\t" + rank;
	}
		
	}


