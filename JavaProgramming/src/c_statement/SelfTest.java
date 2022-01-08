package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		
		// 탄수화물 중독 자가진단 테스트 만들기
		
		Scanner s = new Scanner(System.in);
		
		int a = 0;
		String b = null;
		
		System.out.println("========== 탄수화물 중독 자가진단 (o/x) ==========");
		
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}
				
		System.out.print("밥, 빵, 과자 등의 음식을 먹기 시작하면 끝이 없다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}
				
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}
		
		System.out.print("정말 배가 고프지 않더라도 먹을 때가 있다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}
		System.out.print("스트레스를 받으면 자꾸 먹고 싶어진다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}	
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}		
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}		
		System.out.print("과자, 초콜릿 등의 단 음식은 상상만 해도 먹고 싶어진다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}		
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못 간다. (o/x)");
		b = s.nextLine();
		if (b.equals("o")){
			a++;
		}
		
		System.out.println("------------------진단결과------------------");
		
		if(7<=a){
	    	 System.out.println("xxxxxxxxxxxxxxxxxx 중독! xxxxxxxxxxxxxxxxxx");
	     }else if(4 <= a && a <= 6){ //else if(y<=6){
	    	 System.out.println("################## 위험! ##################");
	     }else
	    	 System.out.println("------------------ 안전! ------------------");
		
		//사용자의 입장에서 생각하기!!!
				
	 

	}

}
