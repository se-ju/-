package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		  int money = (int)(Math.random()*500)*10;
		  int[] coin = {500,100,50,10};
		  
		  System.out.println("거스름돈 : " + money);
		  
		  /*
		   * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		   * 
		   * 거스름돈 : 2860원
		   * 500원 : 5개
		   * 100원 : 3개
		   * 50원 : 1개
		   * 10원 : 1개
		   */
		  
		  // 500원 나눠서 빼기 -> 100원 나눠서 빼기 
		  // -> 50원 나눠서 빼기 -> 10원 나눠서 빼기
//		  int count = money / coin[0];
//		  money = money % coin[0];
//		  System.out.println("필요한 동전은 " + coin[i] + "원, " + count + "개 입니다.");
//		  
//		  count = money / coin[1];
//		  money = money % coin[1];
//		  System.out.println("필요한 동전은 " + coin[i] + "원, " + count + "개 입니다.");
//		  
//		  count = money / coin[2];
//		  money = money % coin[2];
//		  System.out.println("필요한 동전은 " + coin[i] + "원, " + count + "개 입니다.");
//		  
//		  count = money / coin[3];
//		  money = money % coin[3];
//		  System.out.println("필요한 동전은 " + coin[i] + "원, " + count + "개 입니다.");
		  		  

		  for (int i = 0; i < coin.length; i++) {
			  int count = money / coin[i];//변수 값이 차례대로 나누어 질 수 있도록 한다.
			  money = money % coin[i];//나머지값 에 변수 값이 구해져서 0이 될 때 까지 반복한다.
		      System.out.println("필요한 동전은 " + coin[i] + "원, " + count + "개 입니다.");
		  }   
		     		  		  
		  
//		  for (int i = 0; i < coin.length; i++) {
//			  int count = money / coin[i]; //변수 값의 500원을 시작으로 나누어 준다.
//			  money = money % coin[i]; //나머지가 나오면 다음 변수 값으로 0이 될 때까지 반복한다.
//			  System.out.println(coin[i] + "원" + count + "개");
//		  }
		  
		  			  
//		  for (int i = 0; i < coin.length; i++) {
//			  int count = money / coin[i]; //변수 값의 500원 부터 시작해서 나누어 준다.
//			  money = money % coin[i]; //나머지 변수 값을 차례로 나누어 준다.
//			  System.out.println(coin[i] + "원" + count + "개");
//		  }
		  
		  		  
//		  for (int i = 0; i < coin.length; i++) {
//			   int count = money / coin[i]; //변수 0에 들어있는 500원 부터 나누어준다.
//			   money = money % coin[i]; //나머지를 다음 변수로 또 나눌 수 있게 한다.
//			   System.out.println(coin[i] + "원" + count + "개");
//		  }
          
		  int[] arr = new int[20];
		  for (int i = 0; i < arr.length; i++) {
			  arr[i] = (int)(Math.random() * 5) + 1;
		  }
		  System.out.println(Arrays.toString(arr));
		  
		  /*
		   * 1~5의 숫자가 발생된 횟수 만큼 *을 사용해 그래프를 그려주세요.
		   * 
		   * 1 : *** 3
		   * 2 : **** 2
		   * 3 : ** 2
		   * 4 : ***** 5
		   * 5 : ****** 6
		   */
		  
		  
		  //1부터 5까지 표시할 수 있는 새로운 배열을 생성한다.5개
		  //배열의 개수를 반복하면서 세어준다.
		  //새로 지정한 변수 값으로 기존 랜덤 변수에 지정된 해당 값을 빼준다. 5까지 반복한다.
		  //랜덤 변수값에서 1을 찾아 개수를 구한다.
		  //다음 숫자의 개수를 찾는다. 5까지 반복을 한다.(for문 사용)
		  //별의 개수를 뺀 다음 개수를 뒤에 적어준다.
		  
		  int[] counts = new int[5]; //1부터 5까지 표시할 수 있는 새로운 배열을 생성한다.5개
		  for (int i = 0; i < arr.length; i++) {
			  counts[arr[i]-1]++; //배열의 개수를 반복하면서 세어준다.
		  }
		  for (int i = 0; i < counts.length; i++) {
			  System.out.print(i + 1 + " : ");
			  for(int j = 0; j < counts[i]; j++) {
				  System.out.print("*");
			  }
			  System.out.println(" " + counts[i]);
		  }
		  
		  
		  arr = new int[10];
		  for(int i = 0; i <arr.length; i++){
		  arr[i] = (int)(Math.random()*5)+1;
		  }
		  System.out.println(Arrays.toString(arr));
		  /*
		   * 1~5의 랜던한 값이 1개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		   * [2,2,2,4,1,1,4,2,1,2] 
		   * [2,4,1]
		   * 순서가 바뀌면 안된다.랜덤한 배열값이 나오게 된다.
		   */
		   
		  //5까지 나오기에 최대 5까지의 새로운 변수 배열을 만든다.
		  //처음 나온 수의 값과 같은 중복값이 나오지 않을 때까지 반복해서 출력한다.
		  //다음 나온 수도 전과 같은 방법으로 반복해준다.
		  //boolean으로 true false 판단하여 반복한다.
		  //
		  		  
		  int[] temp = new int[5];
		  int count = 0;
		  for (int i = 0; i < arr.length; i++) {
			  boolean flag = true;
			  for (int j = 0; j < temp.length; j++) {
				  if(arr[i] == temp[j]) {
					  flag = false;  
				  }
			  }
			  if(flag) {
				  temp[count++] = arr[i];
			  }
				   
			 }
			 int[] result = new int[count];
			 for(int i = 0; i < result.length; i++) {
				 result[i] = temp[i];
			 }
			 System.out.println(Arrays.toString(result));
			  
		  
		  
	}

}
