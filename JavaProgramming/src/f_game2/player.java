package f_game2;

public class player {
	
	//각 종류별로 클래스를 만드는 것이 좋다.
	//직접 생성자 파라미터 초기화보다는 직접초기화 하는 것이 좋다.
	
	public String type;
	public String name;	
	public int pro;
	public int exp;
	public int control;
	public int contact;
	public int energy;
	int count;
			
	
	public player() 
	{	
		System.out.println("\n☆☆☆☆☆☆☆☆☆☆ GAME START ☆☆☆☆☆☆☆☆☆☆☆");
	}
	
	public void showInfo(){
		System.out.println("\n◁◁◁◁◁◁◁◁◁◁◁◁◁ 내 정보 ▷▷▷▷▷▷▷▷▷▷▷▷▷");
		System.out.println("이름 : " + name);
		System.out.println("경력 : 프로 " + pro + "년차");
		System.out.println("경험치 : 경험 > " + exp + ", 제구능력 > " + control + ", 컨택능력 > " + contact);
		System.out.println("에너지 : " + energy);
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
			}

	public void eat() // 밥먹기
	{
		energy += 15;
		count++;
		
	}
	
	public void lowsleep() // 낮잠
	{
		energy += 5;
		
	}
	
	public void deepsleep() // 밤에 자기 
	{
		energy += 15;
		count++;
	}
	
	public void exercise() // 운동
	{
		energy -= 15;
		exp += 5;
		control += 15;
		contact += 15;
		count++;
	}
	
	public void play() // 경기하기
	{
		energy -= 10;
		exp += 20;
		control += 10;
		contact += 10;
		count++;
	}
	
	public void pro() // 경력 년수 추가
	{
		if(count > 5) 
		{
			pro++;
			count = 0;
			System.out.println("\n" + this.name +"선수 프로 경력이 +1 되었습니다!");
		}
	}
 		
	public void print() // 현재 상태출력 하기
	{
		System.out.println("\n▷ "+this.name+"의 현재 경력  : 프로 " + pro + "년차");
		System.out.println("▷ "+this.name+"의 현재 에너지 : " + energy);
		System.out.println("▷ "+this.name+"의 현재 경험치 : " + "경험 > "  + exp + ", " 
							+ " 제구능력 > " + control + ", "+ " 컨택능력 > " + contact);

	}

	
}
