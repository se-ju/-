package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
				
			AccessModifier am = new AccessModifier();
			
			System.out.println(am.publicVar);
			am.publicMethod();
			
			//System.out.println(am.protectedVar);
			//am.protecteMethod();
			
			//System.out.println(am.defaultVar);
			//am.defaultMethod();
			
			//System.out.println(am.privateVar); //다른 클래스로 넘어와서 에러
			//am.privateMathod();
			
			AccessTest at = new AccessTest();
			
			System.out.println(at.protectedVar);
			at.protecteMethod();

	}

}
