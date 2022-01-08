package g_oop2;

public abstract class SampleAbstractParent {
	
	void method() {
		
	}
	
	//추상메서드, 하나만 가지고 있어도 추상메서드가 된다.
	
	//객체 생성을 해도 메서드를 사용할 수가 없어서 생성할 수가 없다.
	
	//부모클래스 역할을 하기 위해서 만든다.
	
	abstract void abstractMethod();

}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		
		
	}
	
}

