package d_array;

import java.util.Arrays;

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
		
		String[] students = {"강정윤","고성식","김민경","김민호","김은혜",
				             "김재웅","노현정","민진홍","박상진","박상현",
				             "박세준","손효선","양동현","양승혁","양아연",
				             "이유정","이응주","이정수","정석철","정지수",
				             "조화랑","주창규","한영민","황선부","어피치"};
		
		String[] subjects = {"국어","영어","수학","사회","과학","Oracle","Java"};
		
		int[][] scores = new int[students.length][subjects.length];
		
		
		//랜덤점수 구하기 -> 합계, 평균 -> 석차 -> 과목합계,평균  -> 이름 합계 평균 순으로 출력하기 
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 101);
			} 
			//System.out.println(Arrays.toString(scores[i]));
		}
		
		int[]sum = new int[scores.length];
		double[]avg = new double[scores.length];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];
			} avg[i] = Math.round((double)sum[i]/scores[i].length*100)/100.0;
			//System.out.println((i + 1) + "번  학생 --- 합계 : " + sum[i] + ", " + "번 평균 : " + avg[i]);
		} 
		
		int[]rank = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < scores.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}	
			//System.out.println((i+1) + "번 학생 석차 : " + rank[i]);
		}
		
		
		int[]sumnum = new int[subjects.length];
		double[]avgnum = new double[subjects.length];
		
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				sumnum[i] += scores[i][j];			
			} avgnum[i] = Math.round((double)sum[i]/subjects.length*100)/100.0;
			//System.out.println((i) + 1 + "과목 --- 합계 : " + sumnum[i] + ", " + "번 평균 : " + avgnum[i]);
		}
		
		
		
		System.out.print("이름");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
