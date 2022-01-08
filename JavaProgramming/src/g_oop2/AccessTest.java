package g_oop2;

public class AccessTest {

	public static void main(String[] args) {
				
			AccessModifier am = new AccessModifier();
			
			System.out.println(am.publicVar);
			am.publicMethod();
			
			System.out.println(am.protectedVar);
			am.protecteMethod();
			
			System.out.println(am.defaultVar);
			am.defaultMethod();
			
			//System.out.println(am.privateVar); //다른 클래스로 넘어와서 에러
			//am.privateMathod();

	}

}
