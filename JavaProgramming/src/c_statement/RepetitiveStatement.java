package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		
		/*
		 *  반복문
		 *  - for문
		 *  - while문
		 *  - do-while문
		 *  
		 *  for문
		 *  - for(초기화; 조건식; 증감식){}
		 *  - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 */

		for(int i = 1/*초기화*/; i <= 10/*조건식*/; i++/*조건식*/){
		    System.out.println(i);
		//for문 안에 int i;는 지역변수이기 때문에 for문 밖에서 사용을 못한다.
		} 
		//i라는 변수의 값을 1부터 시작해서 10이 될 때까지 1씩 증가한다.1~10까지 출력
		//비슷한 문장이 반복될 때 사용
		
		//초기화 : 조건식과 증감식에 사용할 변수 초기화
	    //조건식 : 연산결과가 true이면 블럭안의 내용을 수행
	    //조건식 : 변수를 증가/감소시켜 반복문을 제어

		int sum = 0; //1부터 10까지 합계를 저장
				
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum); //55 출력

		//위의 식을 반복문을 통해서 출력
		sum = 0;
		for(int i = 1/*초기화*/; i <= 10/*조건식*/; i++/*조건식*/){
			sum += i;
		}
		System.out.println(sum); //55 출력
		
		//문제1)100부터 1까지 더하는 for문
		sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >= 1; i--){
			sum += i;
		}
		System.out.println(sum);
				
		//문제1)1부터 100까지 짝수의 합을 출력해주세요.
		sum = 0;
		for(int i = 2; i <= 100; i += 2){
		    sum += i;
		}
		System.out.println(sum);
		
		//문제2)1부터 100까지 홀수의 합을 출력해주세요.
		sum = 0;
		for(int i = 1; i <= 100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		    
		
		    System.out.println("---------------------------");
		//구구단 2단
		for(int i = 1; i <= 9; i++){
			System.out.println(2 + " X " + i + " = " + i * 2 );
		}
		    
		    System.out.println("---------------------------");
		//구구단 9단
		for(int i = 1; i <= 9; i++){
			System.out.println(9 + " X " + i + " = " + i * 2 );
		}
		
		    System.out.println("---------------------------");
		//구구단 전체(세로)
		for(int i = 2; i <= 9; i++){
		    for(int u = 1; u <= 9; u++){
			    System.out.println(i + " * " + u + " = " + i * u);
			}
		    System.out.println("---------------------------");
		}	
		
		    System.out.println("---------------------------");
		//구구단 전체(가로)	
		for(int i = 1; i <= 9; i++){
		  	for(int j = 2; j <=9; j++){
		  		System.out.print(i + " * " + j + " = " + i * j + "\t" + " |  ");
		    }
		  	    System.out.println(" ");
		}
		
		/*
		 * while
		 * - while(조건식){}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.(횟수를 잘 모를 때)
		 */
		
		System.out.println("---------------------------");
		 
		 int a = 1;
		 //a에 2씩 곱해서 1000이상이 되려면 몇번을 곱해야 하는가?
		 int count = 0;
		 while(a < 1000) {
			 a *= 2;
			 count++;
			 System.out.println(count + " : " + a);
		 }
		 
		
		 /*
		  * do-while(조건식);
		  * - do{}while(조건식);
		  * - 최소한 한번의 수행을 보장한다.
		  */
		  
		  System.out.println("---------------------------");
		  //숫자맞추기 게임
//		  int answer =(int)(Math.random() * 100) + 1;
//		  int input = 0;
//		  Scanner s = new Scanner(System.in);
//		  do {
//			  System.out.println("1~100 사이의 수를 입력해주세요 : ");
//			  input = Integer.parseInt(s.nextLine());
//			  if(answer < input){
//		    		System.out.println(input + " 보다 작습니다.");
//		    	}else if(input < answer){
//		    		System.out.println(input + " 보다 큽니다.");
//		    	}else{
//		    		System.out.println("정답입니다!!");
//		    	}
//		  }while(input != answer);

		  
//			이름붙은 반복문 - 유용하게 이용하니 꼭 알아두기
		  outer : for(int i = 2; i <= 9; i++){
		    	for(int j = 1; j <= 9; j++){
		    		if(j == 5){
		            break; // 가장 가까운 반복문 하나를 빠져나간다.
			        //break outer; //outer라는 이름의 반복문을 빠져나간다.
		            //continue; // 가장 가까운 반복문의 현재 반복 회차를 빠져나간다.
			        //continue outer; // outer라는 이름의 현재 반복회차를 빠져나간다.
		    		}
		    		System.out.println(i + " * " + j + " = " + i * j);
		    	}
		    	System.out.println();
		    }
	   

		  System.out.println("---------------------------");
//		  System.out.println("*****");
//		  System.out.println("*****");
//		  System.out.println("*****");
		  
		  for(int i = 1; i <=3; i++){
			 	for(int j = 1; j <=5; j++){
			    		System.out.print("*");
			    	}	
			    	System.out.println();
			}
	
		  System.out.println("---------------------------");		  
//		  System.out.println("*");
//		  System.out.println("**");
//		  System.out.println("***");
//		  System.out.println("****");
//		  System.out.println("*****");
//		  
		  for(int i = 1; i <= 5; i++){
			 	for(int j = 1; j <= i; j++){
			    		System.out.print("*");
			    	}
			    	System.out.println();
		    }

		  System.out.println("---------------------------");
//		  System.out.println("*****");
//		  System.out.println("****");		  
//		  System.out.println("***");
//		  System.out.println("**");
//		  System.out.println("*");
		  
		  for(int i = 5; i >= 1; i--){
				for(int j = 1; j <= i; j++){
			    		System.out.print("*");
			    	}
			    	System.out.println();
			}
	}

}
