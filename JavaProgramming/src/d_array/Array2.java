package d_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.(같은타입)
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 */

		
		
		int num[];
		
		num = new int[5];
		
		num = new int[] {1,2,3,4,5};
		
		
	    System.out.println(num[4]);
		
	  //배열은 주로 반복문과 같이 쓰인다. for문을 사용하여 배열된 값에 10을 곱해주기
//	   for (int i = 0; i > num.length; i++) {
//		   System.out.println(num[i]);
//	   }for (int i = 0; i > num.length; i++) {
//		   num[i] = (i+1) * 10;
//	   }
//	   System.out.println(Arrays.toString(num));
	    
	  //배열은 주로 반복문과 같이 쓰인다. for문을 사용하여 배열된 값에 10을 곱해주기
//	   for (int i = 0; i < num.length; i++) {
//		   System.out.println(num[i]);
//	   }for (int i = 0; i <num.length; i++) {
//		   num[i] = (i+1) * 10;
//	   }
//	   System.out.println(Arrays.toString(num));
	   
	  //배열은 주로 반복문과 같이 쓰인다. for문을 사용하여 배열된 값에 10을 곱해주기
//	   for (int i = 0; i < num.length; i++) {
//		    System.out.println(num[i]);		   
//	   }for (int i = 0; i < num.length; i++ ) {
//		    num[i] = (i+1) * 10;
//	   }
//		System.out.println(Arrays.toString(num));
	    
	    //배열은 주로 반복문과 같이 쓰인다. for문을 사용하여 배열된 값에 10을 곱해주기
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}for (int i = 0; i < num.length; i++ ) {
//			num[i] = (i + 1) * 10;
//		}
//		System.out.println(Arrays.toString(num));
	    
	    //배열은 주로 반복문과 같이 쓰인다. for문을 사용하여 배열된 값에 10을 곱해주기
	    for (int i = 0; i < num.length; i++) {
	    	System.out.println(num[i]);
	    }for(int i = 0; i< num.length; i++) {
	    	num[i] = (i + 1) * 100;
	    }
	    System.out.println(Arrays.toString(num));
	    
		  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
