package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		
		//사용자에게 숫자를 입력받아 그 숫자만큼 랜덤으로 뽑는 것(중복되면 안될 것)		

		Scanner s = new Scanner(System.in);	
		
//		String[] student;
//		student = new String[25]; 
//		student = new String[] {"강정윤","고성식","김민경","김민호","김은혜",
//				                "김재웅","노현정","민진홍","박상진","박상현",
//				                "박세준","손효선","양동현","양승혁","양아연",
//				                "이유정","이응주","이정수","정석철","정지수",
//				                "조화랑","주창규","한영민","황선부","어피치"};
//		
//		int count[];
//		
//		System.out.println("인원수를 적어주세요 : ");
//		int num = Integer.parseInt(s.nextLine());
//		
//		count = new int[num];
//		for (int i = 0; i < count.length; i++) {
//			 boolean flag = false;
//	    	 for(int j = 0; j < count.length; j++){
//	    	 if(count[j] == count[j]) {
//	    		 flag = true;
//	    	}
//	 		}
//	 	    if(flag){
//	 	    	break;
//	 	    }
//	 		System.out.print(count[i]+" ");
//	 	}
           String[] students = {"강정윤","고성식","김민경","김민호","김은혜",
	                            "김재웅","노현정","민진홍","박상진","박상현",
	                            "박세준","손효선","양동현","양승혁","양아연",
	                            "이유정","이응주","이정수","정석철","정지수",
	                            "조화랑","주창규","한영민","황선부","어피치"};
           
           System.out.println("몇 명 뽑을까요?");
           int count = Integer.parseInt(s.nextLine());
           
           String[] pick = new String[count];
           int pickCount = 0;
           do {
        	   int random = (int)(Math.random() * students.length);
        	   
        	   boolean flag = true;
        	   for(int i = 0; i < pick.length; i++) {
        		   if(students[random].equals(pick[i])) {
        			   flag = false;
        		   }
        	   }
        	   if(flag) {
        		   pick[pickCount++] = students[random];
        	   }
        	   
           }while(pickCount < count);
           System.out.println(Arrays.toString(pick));
	 
		
		
	}

}
