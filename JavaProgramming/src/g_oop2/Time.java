package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		if (hour < 0) {
			this.hour = 0;
		}else if (hour > 23) {
			this.hour = 0;
//			this.hour = hour % 24;
		}else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		if (minute < 0) {
			this.minute = 0;
		}else if (minute > 59) {
			this.minute = 0;
			setHour(hour + 1);
//			this.minute = 59;
//			this.minute = minute % 60;
//			setHour(this.hour+minute/60);
		}else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		if (second < 0) {
			this.second = 0;
		}else if (second > 59) {
			this.second = 0;
			setMinute(minute + 1);
//			this.second = 59;
//			this.second = second % 60;
//			setMinute(this.minute+second/60);
		}else {
			this.second = second;
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second ;
	}
	
	
	void clock() {
		while(true) {
			System.out.println(toString());
			stop();
			
			setSecond(second + 1);
		}
	}
	
	private void stop() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
