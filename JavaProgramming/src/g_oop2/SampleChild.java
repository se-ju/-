package g_oop2;

public class SampleChild extends SampleParent{
	
	void dhiltMethod() {
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //상속받은 변수
		System.out.println(method(7,13)); //상속받은 메서드
	}
	
	// 오버라이딩
	// super, super() 부모클래스의 생성자를 호출하는 것
	// 다형성 
	
	// 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것
	@Override  //어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것
	int method(int a, int b) {
		return a * b;
	}
	
	// super, super()
	
		int var;
		
		void test(double var) {
			System.out.println(var); //지역변수
			System.out.println(this.var); //전역변수(인스턴스 변수)
			System.out.println(super.var); //부모클래스의 전역변수
			
			System.out.println(this.method(10, 20)); //자식 클래스이 메서드
			System.out.println(super.method(10, 20)); //부모 클래스의 메서드
		}
		
		SampleChild(){
			super(); //부모클래스의 생성자 호출, 생성자의 첫줄에서만 사용할 수 있다.
		}
		
		public static void main(String[] args) {
			SampleChild sc = new SampleChild();
			
			SampleParent sp = (SampleParent)new SampleChild(); //이름만 sampleparent고 samplechild 이다.
			
			//SampleChild sc2 = (SampleChild)new SampleParent(); 안되는 것, 형변환해서 억지로 할 수 있지만 에러가 난다. 
			
			SampleChild sc3 = (SampleChild)sp;
		}

}
