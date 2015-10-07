package pl.altkom.io.jpr.test;

import java.io.IOException;

public class Test {

	String name;

	public static void main(String[] args) throws IOException {

		int[] tab = new int[10];

		Object[] o = new Object[10];

		o[0] = new String("");
		o[1] = new Matrix(1, 2);
		o[2] = 1;
		o[3] = 1.3;

		for (Object tmp : o) {
			System.out.println(tmp != null ? tmp.getClass() : "null");
			
		}

	}
}
