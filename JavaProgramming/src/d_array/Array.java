package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		 /*
		  *  배열
		  *  - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.(같은 타입)
		  *  - 참조형 타입이다.
		  *  - 인덱스로 값을 구분한다.
		  *  - 길이를 변경 할 수 없다.
		  */

		int[] array; //배열의 주소를 저장할 공간이 만들어진다.(변수명 뒤에 붙여도 괜찮다. 보통 타입 뒤에)
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다. []는 배열의 길이/크기를 지정한다.5칸 짜리 배열을 만들겠다.
		
		 /*
		  * array(변수) = 100번지(주소)
		  * {0,0,0.0,0}
		  */
		
		array = new int[] {1,2,3,4,5};
//		array = {1,2,3,4,5};
		int[] array2 = {1,2,3,4,5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		//배열은 주로 반복문과 같이 쓰인다.
		
		for(int i = 0; i < array.length; i++) {
		    System.out.println(array[i]);	
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (i + 1) * 10;
		}
		
		System.out.println(Arrays.toString(array));
		
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array1 = new int[10];

		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(array1));
		
		
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		int sum = 0;		
		for(int i = 0; i < array1.length; i++) {
			sum += array1[i];
		}
		double avg = sum / array1.length;
		System.out.println("합계 : " + sum + "," + "평균 : " + avg);
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int min = array1[0];
		int max = array1[0];
				
		for(int i = 0; i < array1.length; i++) {
			if (min > array1[i]){
			    min = array1[i];
			}
			if (max < array1[i]){
				max = array1[i];
			}
		}
		System.out.println("MAX : "+ max + ", MIN : " + min);
		
		
		//배열의 값 섞기
		
		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		
		for (int i = 0; i < shuffle.length*10; i++) {
			int random = (int)(Math.random()*shuffle.length);
			int temp = shuffle[0];
			shuffle[0] = shuffle[random];
			shuffle[random] = temp;			
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[]val = new int[10];
		for(int i = 0; i < 500; i++) {
			int num = (int)(Math.random()*10)+1;
			val[num -1 ] ++;}
//		for (int i =0; i< val.length; i++) {
//			System.out.println((i + 1 + ": " + val[i]+"번"));
//		}
	    System.out.println(Arrays.toString(val));
		
		
		
		
		
	}

}
