package pl.altkom.io.jpr.test;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] tab1 = {1, 3, 5, 12, 4, 123,54};
		int[] tab2 = new int[10];
		
		int[][] tab3 = {{1, 2, 3}, 
				{1, 3}, 
				{1}, 
				{}, 
				{1,4,2,3,4,2,2}};
		
//		for(int i = 0; i < tab.length; i++) {
//			tab2[i] = tab[i];
//		} 
		
		System.arraycopy(tab1, 0, tab2, 0, tab1.length);
		
		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
		
		tab2[1] = 1;
		
		System.out.println(Arrays.toString(tab1));
		System.out.println(Arrays.toString(tab2));
	}
	
}
