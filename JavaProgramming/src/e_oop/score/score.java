package e_oop.score;

public class score {

	public static void main(String[] args) {
		
		String[] studentNames = {"민진홍", "노현정", "박상진","이정수"};
		
		Student[] students = new Student[studentNames.length];
		
		for (int i = 0; i < students.length; i++) {
						
			students[i]= new Student();
			
			students[i].name = studentNames[i];
			students[i].kor = (int)(Math.random()*101);
			students[i].eng = (int)(Math.random()*101);
			students[i].math = (int)(Math.random()*101);
			students[i].rank = 1;
			
			
		}	

		  // 합계, 평균
		
		  for (int i = 0; i < students.length; i++) { 
			  students[i].sum = students[i].kor + students[i].eng + students[i].math;
			  students[i].avg = Math.round(students[i].sum / 3.0 * 100)/100.00;
		  }
		  
		  
		  // 석차
		  
		  for (int i = 0; i < students.length; i++) {
			  for (int j = 0; j < students.length; j++) {
				  if (students[i].avg < students[j].avg){
						students[i].rank++;
					}
				  
			  }
						  
		  }
		  
		  
		  // 석차순 정렬
		  
		  for (int i = 0; i < students.length; i++) {
			  int min = i;
			  for (int j = i+1; j < students.length; j ++) {
				  if (students[j].rank < students[min].rank) {
					  min = j;
				  }
			  }
			  Student temp = students[i];
			  students[i] = students[min];
			  students[min] = temp;
		  }
		  
		  
		  // 과목합게, 과목평균
		  
		  int[] sumcount = new int[3];		  
		  for (int i = 0; i < students.length; i++) {
			  sumcount[0] += students[i].kor;
			  sumcount[1] += students[i].eng;
			  sumcount[2] += students[i].math;
		  }
		  double[] avgcount = new double[3];
		  for (int i = 0; i < avgcount.length; i++) {
			  avgcount[i] = Math.round((double)sumcount[i]/students.length*100)/100.00;
		  }
		  
		  // 출력
		  
		  System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		  for (int i = 0; i < students.length; i++) {
			  System.out.println(
					  students[i].name + "\t" + 
					  students[i].kor + "\t" +
					  students[i].eng + "\t" +
				      students[i].math + "\t" +
				      students[i].sum + "\t" +
				      students[i].avg + "\t" +
				      students[i].rank + "\t");
			  
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
