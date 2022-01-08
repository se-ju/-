package j_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collection Framework (다수의 데이터를 다룬다.)
		 * - List // 배열의 상위호환, 인덱스로 저장
		 * - Map // 커널로 저장
		 * - Set // 중복되는 값 저장X
		 * 
		 * ArrayList의 주요 메서드 // 장점 - 값을 읽는 속도가 빨라서 자주 쓴다. 단점 - 저장하는 속도가 늦다.
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다. 기존의 값이 한칸 뒤로 밀리게 된다.
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.(수정)
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.(읽기)
		 * - int size() : 저장된 객체의 수를 반환한다.
		 * - Object remove(int index) : 저장된 위치의 객체를 제거한다.바로 뒤의 값이 앞으로 오게되어 채워진다.
		 */
		
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100); 
		//기본적으로 아무타입이나 저장가능. 
		//어떤 타입이 나올지 모른다. 그렇기에 지정을 한다.
		
		ArrayList<Integer> list = new ArrayList<>();
		//<>컬랙션에 어떤 타입을 저장할 것인지에 대한  것,클래스만 저장가능
		/*
		 * WrapperClass
		 * 
		 * byte		: Byte
		 * short	: Short
		 * int		: Integer
		 * long		: Long
		 * float	: Float
		 * double	: Double
		 * boolean	: Boolean
		 * char		: character
		 */
		
		list.add(10);
//		list.add("abc");
		list.add(new Integer(20));
		//WrapperClass 끼리는 자동으로 형변환이 가능
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1,40);
		System.out.println(list);
		
//		list.add(5,50); //인덱스를 벗어나면 에러가 난다.
		
		
		//수정
		Integer before =list.set(2, 50);
		System.out.println("before : " + before);
		System.out.println(list);
		
		//읽기
		int get = list.get(2); 
		System.out.println(get);
		
				
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.remove(i));
//		}
//		System.out.println(list);
		
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		
		//list에 1~100 사이의 랜덤값을 10개 저장하시오.
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random()*100+1);
			list.add(random);
		}
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < 10; i++) {
			sum += list.get(i);
		}
		avg = Math.round((double)sum / list.size() * 100)/100.0 ;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int max = list.get(0);
		int min = list.get(0);
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
		
			if(list.get(i) > max) {
					max = list.get(i);
			}
			
		} System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		
		//list를 오름차순으로 정렬해주세요.
		
		for (int i = 0; i < list.size(); i++) {
			min = i;
			for(int j = i + 1; j < list.size(); j++){
	    		if(list.get(j) < list.get(min)){
	    			min = j;
	    		}
	    	}
//	    	int temp = list.get(i);
//	    	list.set(i, list.get(min));
//	    	list.set(min, temp);
			
			list.set(min,list.set(i, list.get(min)));
			
		}//System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> temp = list2.get(i);
			for(int j = 0; j < temp.size(); j++) {
				System.out.println(temp.get(j));
			}
				
		}
		
		list2.get(0).get(1); //20을 꺼내보자
		
		
		//학생 3명의 5과목에 대한 점수를 0~100사이의 점수로 발생시켜서 2차원 ArrayList에 저장해주세요.
						
		
		//3명의 학생의 5과목 점수를 랜덤으로 생성해주세요.
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			ArrayList<Integer> score = new ArrayList<>();
			for(int j = 0; j < 5; j++) {
				score.add((int)(Math.random()*101));
			}
			scores.add(score);
			System.out.println(score);
		}
		
		//각 학생별 합계와 평균을 구해주세요.
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
				
		for(int i = 0; i < scores.size(); i++){	
			sum = 0;
			ArrayList<Integer> score = scores.get(i);
			for(int j = 0; j < scores.size(); j++){
				sum += scores.get(j).get(i);
			}
			sums.add(sum);
			avgs.add((double)sum / scores.size());
			
		}
		System.out.println(sums);
		System.out.println(avgs);	
		
			
		

	}

}
