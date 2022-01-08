package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java점수를
		 * 0~100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 * 박성진		90		90		90		90		90		90			90			90		90.00	1
		 * 이정수		90		90		90		90		90		90			90			90		90.00	1
		 * 노현정  	90		90		90		90		90		90			90			90		90.00	1
		 * 정지수		90		90		90		90		90		90			90			90		90.00	1
		 * 양동현		90		90		90		90		90		90			90			90		90.00	1
		 * 과목합계	450		450		450		450		450		450			450     
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00		90.00    
		 */
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("강정윤");
		students.add("고성식");
		students.add("김민경");
		students.add("김민호");
		students.add("김은혜");
		students.add("김재웅");
		students.add("노현정");
		students.add("민진홍");
		students.add("박상진");
		students.add("박상현");
		students.add("박세준");
		students.add("손효선");
		students.add("양동현");
		students.add("양승혁");
		students.add("양아연");
		students.add("이유정");
		students.add("이응주");
		students.add("이정수");
		students.add("정석철");
		students.add("정지수");
		students.add("조화랑");
		students.add("주창규");
		students.add("한영민");
		students.add("황선부");
		students.add("인대덕");
				
		
		ArrayList<String> subjects = new ArrayList<>();
		
		subjects.add("국어");
		subjects.add("영어");
		subjects.add("수학");
		subjects.add("사회");
		subjects.add("과학");
		subjects.add("Oracle");
		subjects.add("JAVA");		
		
		
		
		//랜덤 점수 만들기
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		for (int i = 0; i < scores.size(); i++) {
			ArrayList<Integer> score = new ArrayList<>();
			for (int j = 0; j < subjects.size(); j++) {
				score.add((int)(Math.random()*101));
			}
			scores.add(score);
		}
		
		
		//학생 점수 합계, 평균 구하기
		ArrayList<Integer> sSum = new ArrayList<>();
		ArrayList<Double> sAvg = new ArrayList<>();
		for (int i = 0; i < scores.size(); i++) {
			int sum = 0;
			for	(int j = 0; j < subjects.size(); j++) {
				sum += scores.get(i).get(j);
			}
			double avg = Math.round((double)sum/subjects.size()*100)/100.00;
			sSum.add(sum);
			sAvg.add(avg);		
		}
		
		
		//석차구하기
		ArrayList<Integer> ranks = new ArrayList<>();
		for (int i = 0; i < sSum.size(); i++) {		
		ranks.add(1);
		for (int j = 1; j < sSum.size(); j++) {
			if (sSum.get(i) < sSum.get(j)) {
				ranks.set(i, ranks.get(i) + 1);
				}
			}
		}
		
		
		//석차정렬하기
		for (int i = 0; i < ranks.size(); i++) {
			int num = i;
			for (int j = i + 1; j < ranks.size(); j++) {
				if (ranks.get(j) < ranks.get(num)) {
					num = j;
				}
			}
			String name = students.get(i);
			students.set(i, students.get(num));
			students.set(num, name);

			ArrayList<Integer> list = scores.get(i);
			scores.set(i, scores.get(num));
			scores.set(num, list);

			Integer sum = sSum.get(i);
			sSum.set(i, sSum.get(num));
			sSum.set(num, sum);

			Double avg = sAvg.get(i);
			sAvg.set(i, sAvg.get(num));
			sAvg.set(num, avg);

			int rank = ranks.get(i);
			ranks.set(i, ranks.get(num));
			ranks.set(num, rank);
		}
		
		
		//과목 점수 합계, 평균 구하기
		ArrayList<Integer> subSums = new ArrayList<>();
		ArrayList<Double> subAvgs = new ArrayList<>();
		for(int i = 0; i < subjects.size(); i++){
			int sum = 0;
			for(int j = 0; j < students.size(); j++){
				sum += scores.get(j).get(i);
			}
			
			subSums.add(sum);
			subAvgs.add(Math.round((double)sum / students.size() * 100) / 100.0);
		}
		
		
		//출력하기
		System.out.print("이름");
		for (int i = 0; i < subjects.size(); i++) {
			System.out.println("\t" + subjects.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < scores.size(); i++){
			System.out.print(students.get(i) + "\t");
			for(int j = 0; j < scores.get(i).size(); j++){
				System.out.print(scores.get(i).get(j) + "\t");
			}
			System.out.println(sSum.get(i) + "\t" + sAvg.get(i) + "\t" + ranks.get(i));
		}	
		
		
		System.out.print("과목합계");
		for(int i = 0; i < subSums.size(); i++){
			System.out.print("\t" + subSums.get(i));
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i = 0; i < subAvgs.size(); i++){
			System.out.print("\t" + subAvgs.get(i));
		}
		System.out.println();	
		
		
		
		

	}

}
