package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		} //강제로 예외 발생시키기
		
		
//		throw new NullPointerException();
		
//		String str = null;
//		
//		str.equals("");
		
		
//		throw new IndexOutOfBoundsException();
//		
//		int[] arr = new int[5];
//		
//		System.out.println(arr[5]);
		

	}

}
