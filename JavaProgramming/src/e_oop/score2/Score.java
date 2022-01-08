package e_oop.score2;

public class Score {

	public static void main(String[] args) {
		
		//student 안에서 구할 수 있는 메서드 최대한 채워서 해볼 것
		
		String[] studentNames = {"우리는", "꾸러기", "수비대"};
		
		Student[] students = new Student[studentNames.length];
		
		for(int i = 0; i < students.length; i++){
			students[i] = new Student();
			students[i].name = studentNames[i];
			students[i].randomScore();
			students[i].scoreSum();
			students[i].scoreAvg();
		}
		for(int i = 0; i < students.length; i++){
			students[i].scoreRank(students);
		}

		// 석차순 정렬
		for (int i = 0; i < students.length; i++) {
			int min = i;
			for(int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
			
		
		
		 // 과목합계
		  int[] sumcount = new int[3];		  
		  for (int i = 0; i < students.length; i++) {
			  sumcount[0] += students[i].kor;
			  sumcount[1] += students[i].eng;
			  sumcount[2] += students[i].math;
		  }
		  
		  // 과목별 평균
		  double[] avgcount = new double[3];
		  for (int i = 0; i < avgcount.length; i++) {
			  avgcount[i] = Math.round((double)sumcount[i]/students.length*100)/100.00;
		  }
		  
		  // 출력
		  System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		  for (int i = 0; i < students.length; i++) {
			  System.out.println(students[i].scoreInfo());
//					  students[i].name + "\t" + 
//					  students[i].kor + "\t" +
//					  students[i].eng + "\t" +
//				      students[i].math + "\t" +
//				      students[i].sum + "\t" +
//				      students[i].avg + "\t" +
//				      students[i].rank + "\t");
			  
		  }
		  
		  System.out.print("과목합계\t");
		  for (int i = 0; i < sumcount.length; i++) {
			  System.out.print(sumcount[i] + "\t");
		  }
		  
		  System.out.print("\n과목평균\t");
		  for (int i = 0; i < avgcount.length; i++) {
			  System.out.print(avgcount[i] + "\t");
		  }
		
		
		
	}

}
