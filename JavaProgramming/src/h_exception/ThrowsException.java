package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		//메서드에 예외 선언하기
		
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void method() throws IOException {
		throw new IOException();
		
	}

}
