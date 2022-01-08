package f_game2;

import e_oop.ScanUtil;

public class MyStadium { 
	
	public static void main(String[] args) {
		player m = null;		
		
		System.out.println("<<<<<< 야구선수 키우기 >>>>>>");
		System.out.println("--------------------------");
		
		System.out.println("원하는 유형을 선택해주세요.");
		System.out.print("1. 투수 \t2. 타자 \t");
		System.out.print(">  ");
		int num1 = ScanUtil.nextInt();
		System.out.println("--------------------------");
		System.out.print("이름을 지어주세요.\t");
		System.out.print(">  ");
		String name = ScanUtil.nextLine();
		
		
		// 투수, 타자 선택				
		if(num1==1)
			m = new pitcher(name);
		else if(num1==2)
			m = new hitter(name);
		
		boolean flag = true;
				
		while(flag) {
			System.out.println();
			System.out.println("─────────── 메뉴를 선택해주세요 ───────────");
			System.out.println("  0. 내 정보\n  1. 밥 먹기\n  2. 낮잠 자기\n  3. 밤에 자기\n  4. 운동 시키기\n  5. 경기 하기\n  6. 게임 끝내기");
			System.out.println("──────────────────────────────────────");
			System.out.print("\n> ");
			num1 = ScanUtil.nextInt();
			switch(num1) {
			case 0: m.showInfo(); break;
			case 1:
				System.out.println("\n----------------------------");
				System.out.println("\n《"+m.name+" 선수가 밥을 먹습니다.》");
				m.eat();
				m.pro();
				m.print();
				break;
						
			case 2:
				System.out.println("\n----------------------------");
				System.out.println("\n《"+m.name+" 선수가 낮잠을 잡니다.》");
				m.lowsleep();
				m.pro();
				m.print();
				break;
				
			case 3:
				System.out.println("\n----------------------------");
				System.out.println("\n《"+m.name+" 선수가 밤에 숙면을 취합니다.》");
				m.deepsleep();
				m.pro();
				m.print();
				break;	
						
			case 4:
				System.out.println("\n----------------------------");
				System.out.println("\n《"+m.name+" 선수가 운동을 합니다.》");
				m.exercise();
				m.pro();
				m.print();
				if(m.energy <= 0)
				{	System.out.println();
					System.out.println("《에너지가 부족하여 "+m.name+" 선수가 부상당했습니다.》");
					System.out.println("\n-------------- GAME OVER ---------------");
					flag = false;
				}
				break;
						
			case 5:
				System.out.println("\n《"+m.name+" 선수 경기에 출전합니다.》");
				m.play();
				m.print();
				if(m.energy <= 0)
				{	System.out.println();
					System.out.println("《에너지가 부족하여 "+m.name+" 선수가 교체당했습니다.》");
					System.out.println("\n--------------- GAME OVER ---------------");
					flag = false;
				}
				break;
						
			case 6:
				System.out.println("\n사용자 요청으로 게임이 종료됩니다.");
			flag = false;
			}
		}
	}

}
