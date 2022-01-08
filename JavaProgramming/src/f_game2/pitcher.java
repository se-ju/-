package f_game2;

public class pitcher extends player{
	
	public int count;
	public pitcher(String name) 
	{
		this.name = name;
		type = "투수";		
		pro = 0; 
		energy = 100;
		count = 0; 
		System.out.println(" " + type + "\n" + " " + this.name +" 생성!");
	}
	
	@Override
	public void eat() // 밥먹기
	{
		energy += 10;
		count++;
		System.out.println("\n" + "에너지가 +10 되었습니다!");
	}
	
	@Override
	public void lowsleep() // 낮잠
	{
		energy += 5;		
		System.out.println("\n" + "에너지가 +5 되었습니다!");
	}
	
	@Override
	public void deepsleep() // 밤에 자기 
	{
		energy += 15;
		count++;
		System.out.println("\n" + "에너지가 +15 되었습니다!");
	}
	
	@Override
	public void exercise() // 운동
	{
		energy -= 10;
		exp += 5;
		control += 10;
		contact += 5;
		count++;
		System.out.println("\n" + "에너지가 -10 되었습니다!");
		System.out.println("경험이 +5 되었습니다!");
		System.out.println("제구능력이 +5 되었습니다!");
		System.out.println("컨택능력이 +1 되었습니다!");

	}
	
	@Override
	public void play() // 경기하기
	{
		energy -= 15;
		exp += 20;
		control += 10;
		count++;
		System.out.println("\n" + "에너지가 -15 되었습니다!");
		System.out.println("경험이 +20 되었습니다!");
		System.out.println("제구능력이 +10 되었습니다!");		
	}
	
	@Override
	public void pro() // 경력 년수 추가
	{
		if(count > 5) 
		{
			pro++;
			count = 0;
			System.out.println("\n" + this.name + " 선수의 프로 경력이 +1 되었습니다!");
		}
	}
	
	
	
	@Override
	public void print() // 현재 상태출력 하기
	{
		System.out.println("\n▷ " + this.name + " 선수 현재 경력  : 프로 " + pro + "년차");
		System.out.println("▷ " + this.name + " 선수 현재 에너지 : " + energy);
		System.out.println("▷ " + this.name + " 선수 현재 경험치 : 경험 > " + exp 
							+ ", 제구능력 > " + control + ", 컨택능력 > " + contact);
		
	} 
		

}