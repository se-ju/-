package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 *  - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 *  - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 *  - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 *  - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 */
				 
		
		 int[] arr = new int[10];
			
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random()*100)+i;			 
		 }
		 System.out.println("점수 : " + Arrays.toString(arr));
		 
		 //석차구하기	 
//		 int[] rank = new int[arr.length];
//		 for(int i = 0; i < rank.length; i++) {
//			 rank[i] = 1;
//		 }
//		 
//		 for (int i = 0; i < arr.length; i++) {
//              for(int j = 0; j < arr.length; j++) {
//            	  if(arr[i] < arr[j]) {
//            		  rank[i]++;
//            	  }
//              }
//	
//		 }
//		 System.out.println("등수 : " + Arrays.toString(rank));
         
		 
		 
		 //선택정렬
				  
//		 for (int i = 0; i < arr.length; i++ ) {
//			  int min = i; //첫 번째 값의 위치
//			  for(int j = i + 1; j < arr.length; j++) {
//				  if(arr[j] < arr[min]){ //최소값의 위치
//					  min = j;
//				    }
//			  }
//			  int temp = arr[i];
//			  arr[i] = arr[min];
//			  arr[min] = temp;//맨 앞 인덱스 i랑 최소값의 위치 바꾸기
//		 }
//		 System.out.println("정렬 : " + Arrays.toString(arr));
		 
		 		 
		 
		 //버블정렬
//		 int temp = 0;
//		 for (int i = 0; i < arr.length+1; i++) {
//			 
//		 }for (int j = 0; j < arr.length+1; j++) {
//			  if(arr[j] > arr[j+1]) {   //앞의 큰 수 바꾸기
//				 temp = arr[j+1];
//				 arr[j] = arr[j+1];
//				 arr[j+1] = temp;
//			  }
//		 }
//		 System.out.println("버블정렬 : " + Arrays.toString(arr));
		 
		 for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr.length - 1 - i; j++) {
			   if(arr[j] > arr[j + 1]) {   
				  int temp = arr[j];
				  arr[j] = arr[j + 1];
				  arr[j + 1] = temp;
			    }
			  }
			   
		 }
		 System.out.println("버블정렬 : " + Arrays.toString(arr));
		 
		 
		 
	 }
		 

}
