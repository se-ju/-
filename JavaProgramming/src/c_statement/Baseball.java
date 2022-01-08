package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		/*
		 * 123
		 * 135 : 1S 1B 10
		 * 
		 * 
		 * 345 : 0S 1B 2O
		 * 478 : 2S 0B 1O
		 * 471 : 1S 0B 2O
		 * 578 : 1S 0B 20
		 * 473 : 1S 0B 2O
		 * 428 : 3S
		 */
         
		/*
		 * ex) 123 (내가 입력한 숫자)
         * 135 : 1S 1B 1O (랜덤으로 뽑은 숫자와 비교)
         * 스트라이크 : 숫자와 위치가 동일할 때
         * 볼 : 숫자는 같지만 위치가 다를 때
         * 아웃 : 숫자 3개가 볼이나 스트라이크가 아닐 경우
         * 세자리의 스트라이크를 맞춰야 게임 종료!
         * 
         * <만들 순서>
         * 1. 랜덤 숫자 발생 (1~9자리의 세자리 숫자, 중복안됨)
         * 2. 사용자한테 입력받기
         * 3. 정답이랑 비교하고 -> S B O 만들기
		 */
		
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("<<<<<<<<<<<<<<<<<< 오늘의 스코어 >>>>>>>>>>>>>>>>>>");
//		System.out.println(" ");
//		
//		int random1 = (int)(Math.random() * 9) + 1;
//		int random2 = (int)(Math.random() * 9) + 1;
//		if(random1 == random2) {
//			random2 = (int)(Math.random() * 9) + 1;
//		}
//		int random3 = (int)(Math.random() * 9) + 1;
//		while(random3 == random1 || random3 == random2){
//			random3 = (int)(Math.random() * 9) + 1;
//		}
//				
//		System.out.print(" 1스트라이크: " + random1);
//		System.out.print(" , " + " " + "2스트라이크: " + random2);
//		System.out.println(" , " + " " + "3스트라이크 아웃!: " + random3);
//		
//		int strike = 0;
//		int ball = 0;
//		int out = 0;
//		
//		System.out.println(" ");
//		
//		System.out.println(" =============== 숫자 KBO 플레이 볼! ==============");	
//		
//		do{
//			   System.out.println("중복되지 않는 숫자 세개를 입력해주세요.");
//			   System.out.print("첫번째 숫자>");
//			   int an1 = Integer.parseInt(s.nextLine());
//			   System.out.print("두번째 숫자>");
//			   int an2 =  Integer.parseInt(s.nextLine());
//			   System.out.print("세번째 숫자>");
//			   int an3 = Integer.parseInt(s.nextLine());
//			    
//			   if(random1 == an1){
//			      strike += 1;
//			   }else if(random1 == an2 || random1 == an3){
//			      ball += 1;
//			   }else{
//			      out += 1;
//			   }
//			      
//			   if(random2 == an2){
//			      strike += 1;
//			   }else if(random2 == an3 || random2 == an1){
//			      ball += 1;
//			   }else{
//			      out += 1;
//			   }
//			         
//			   if(random3 == an3){
//			      strike += 1;
//			   }else if(random3 == an2 || random3 == an1){
//			      ball += 1;
//			   }else{
//			      out += 1;
//			   }
//			      
//			   if(strike == 3){
//			      System.out.println("WIN");
//			   }else{
//			      System.out.println(strike + "strike " + ball + "ball " +  out + "out");
//			   }
//			}while(strike < 3); //do-while문은 실행후 조건식 확인, 값이 더해져서 나오기에 취지와 맞지않다.
		
		
		
		     /*선생님 풀이 : 두와일 사용한 이유는 랜덤상태에서 돌아가는지 안돌아가는지 확인하기 위해
		      *          사용자에게 입력을 받기위해 스케너 입력, 카운트 변수를 만들어 사용자가 몇 번째에 
		      *          맞추는지 확인하기 위해 사용했다. 사용자에게 3자리 숫자를 입력 받는다.
		      *          한번에 입력을 받은뒤 쪼개는 방법, 10으로 나누고 또 10으로 나누고 또 
		      *          10으로 나누어서  숫자 3개를 구한다.
		      */         
				
		int a1 = (int)(Math.random() * 9) + 1;
		int a2;
		int a3;
				
		do{
			a2 = (int)(Math.random() * 9) + 1;
		}while(a1==a2);
				
		do{
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1==a3 || a2==a3);
				
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("3자리 숫자>");
			int input = Integer.parseInt(sc.nextLine());
			int i3 = input % 10; 
			input /= 10; 
			int i2 = input % 10;
			input /= 10; 
			int i1 = input % 10;
		    	//각 자리 숫자 구하는 법
					
			int strike = 0;
			int ball = 0;
			int out = 0;
					
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
					
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
					
			out = 3 - strike - ball;
					
			System.out.println(++count + "차 시도 (" + i1 + i2 + i3 + " ) :" 
			        + strike + "S " + ball + "B " + out + "O");
					
			System.out.println("---------------------------");
			if(strike == 3){
				System.out.println("정답입니다!!");
				break;
			}
		 }
		
		
			
		
		
		
			
		    	
		    	
	}

}
