package e_oop;

public class AirCon {

	
	
	/*
	 * 메서드 
	 * 전원 : 켜고 끄기(1개)
	 * 풍량 : 입력,올리거나 내리기(3개)
	 * 온도 : 올리거나 내리기(2개)
	 */
	
	boolean power = false;
	int wind = 1;
	int temper = 27;
	
	final int MIN_WIND = 1;
	final int MAX_WIND = 50; 
	final int MIN_TEMPER = 17;
	final int MAX_TEMPER = 27;
	
	void airconPower() {
		power = !power;
		System.out.println("작동 :  " + (power ? "ON" : "OFF"));
	}
	
	void numWind(int wind) {
		if(power) {
			if(MIN_WIND <= wind && wind <= MAX_WIND) {
				this.wind = wind;
			}
			System.out.println("풍량 :  " + this.wind);
		}
	}
	
	void windUp() {
		numWind(wind + 1);
	}
	
	void windDown() {
		numWind(wind - 1);
	}
	
	void temperUp() {
		if(power) {
			if(temper < MAX_TEMPER) {
				temper ++;
			}
			temperShow();
		}
	}
	
	void temperDown() {
		if(power) {
			if(MIN_TEMPER < temper) {
				temper --;
			}
			temperShow();
		}
	}
	
	void temperShow() {
		System.out.print("온도 :  ");
		for(int i = MIN_TEMPER + 1; i <= MAX_TEMPER; i++){
			if(i <= temper){
				System.out.print("●");				
			}else{
				System.out.print("○");				
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		AirCon air = new AirCon();
		
		while(true) {
			System.out.println("1.전원   2.풍량변경   3.풍량+  4.풍량-");
			System.out.println("5.온도+   6.온도-  0.종료");
			int input = ScanUtil.nextInt();
			
			switch(input) {
			
			case 1: air.airconPower(); break;
			
			case 2:
				System.out.print("변경할 풍량 입력>  ");
				int ch = ScanUtil.nextInt();
				air.numWind(ch);
				break;
				
			case 3: air.windUp(); break;
			
			case 4: air.windDown(); break;
			
			case 5: air.temperUp(); break;
			
			case 6: air.temperDown(); break;
			
			case 0:
				
				System.out.println("종료되었습니다.");
				System.exit(0);	
			}
		}
		
		
		
	}
	
	
	
	
}
