package d_array;

import java.util.Arrays;

public class Score2 {

	public static void main(String[] args) {
		
		
		// 이름과 과목에 대한 배열을 지정하고 생성한다.
		String[] names = {"너","나","우리"};
		String[] subjects = {"국어","영어","수학","사회","과학","Oracle","Java"};
		int[][] score = new int[names.length][subjects.length];
				
				
		// 랜덤 점수로 나타날 점수를 생성해준다.
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j <score.length; j++) {
				score[i][j]=(int)(Math.random()*101);
			}
		}		
				
				
		// 랜덤으로 생성된 각 학생의 점수에 대한 합계와 평균을 구한다. 
		int[] nameSum = new int[score.length];
		int[] nameAvg = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				nameSum[i] += score[i][j];
			}
			//nameAvg = Math.round((double)nameSum[i]);
		}
		
				
		// 각 과목의 합계와 평균을 구한다.
			
				
				
		// 석차를 구한다.
				
				
				
		// 이름과 과목, 합계, 평균, 석차 나타내기
				
				
				
		// 학생들의 이름, 랜덤으로 생성된 성적과 결과에 따른 합계 및 평균, 석차까지 나타내기
				
				
				
		// 과목합계와 과목평균 결과
		
		
		
		
		
		

	}

}
