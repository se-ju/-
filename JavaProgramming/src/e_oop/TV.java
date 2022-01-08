package e_oop;

public class TV {

	/*
	 * 메서드 
	 * 전원 : 켜고 끄기(1개)
	 * 채널 : 직접입력, 올리거나 내리기(3개)
	 * 음량 : 올리거나 내리기(2개)
	 */
	
	boolean power = false;
	int channel = 1;
	int volume = 5;
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100; 
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	//final이 붙으면 값을 바꿀 수 없게 한다. 변수가 아닌 상수다.
	//상수는 모두 대문자를 이용해서 만든다.
		
	void tvPower() {
		power = !power;
		System.out.println("TV : " + (power ? "ON" : "OFF"));
	}
		
	void numChannel(int chnnel) {
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
                		//전역변수와 지역변수를 비교하기 위해 전역변수 앞에 this
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void upChannel() {
		numChannel(channel + 1); //코드를 재사용 한다.
	}
	
	void downChannel() {
		numChannel(channel - 1);		
	}
	
	
	void upVolumn() {
		if(power) {
			if(volume < MAX_VOLUME) {
				volume++;
			}
			showVolume();
		}
	}
	
	void downVolumn() {
		if(power) {
			if(MIN_VOLUME < volume) {
				volume--;
			}
			showVolume();
		}		
	}
	
	void showVolume(){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("●");
			}else{
				System.out.print("○");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
	    TV tv = new TV();
	    
	    while(true) {
	    	System.out.println("1.전원 2.채널변경 3.채널+ 4.채널-");
	    	System.out.println("5.볼륨+ 6.볼륨- 0.종료>");
	        int input = ScanUtil.nextInt();
			
			switch(input){
			case 1: tv.tvPower(); break;
			case 2:
				System.out.println("변경할 채널 입력>");
				int ch = ScanUtil.nextInt();
				tv.numChannel(ch);
				break;
			case 3: tv.upChannel(); break;
			case 4: tv.downChannel(); break;
			case 5: tv.upVolumn(); break;
			case 6: tv.downVolumn(); break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
	    }
	}


}
