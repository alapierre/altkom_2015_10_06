package pl.altkom.io.jpr.test;

public class Szachownica {
	
	public static void main(String[] args) {
		
		int ile = 10;
		
		boolean czarne = true;
		
		for(int j = 0; j < ile; j++) {
			for(int i = 0; i < ile; i++) {
				System.out.print(czarne ? "o" : "_");
				czarne = !czarne;
			}
			System.out.println();
			czarne = !czarne;
		}
		
	}
	

}
