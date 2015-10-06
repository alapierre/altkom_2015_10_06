package pl.altkom.io.jpr.test;

public class Matrix {

	private double[][] tab;
	
	public Matrix(int rows, int cols) {
		
		tab = new double[rows][cols];
		
	}
	
	public void setValueAt(int row, int col, double value) {
		tab[row-1][col-1] = value;
	}
	
	public double getValueAt(int row, int col) {
		return tab[row-1][col-1];
	}
	
	public static void main(String[] args) {
		
		Matrix a = new Matrix(5, 5);
		
		a.setValueAt(1, 1, 5.2);
		
		System.out.println("wartosc z macierzy: " + a.getValueAt(1, 1));
		
		a.print();
		a.add(3);
		
		System.out.println();
		
		a.print();
		
	}
	
	public void print() {
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print( "(" + i + "," +j + ")" + tab[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void add(double value) {
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = tab[i][j] + value;
				//tab[i][j] =+ value;
			}
			
		}
		
		
	}
	
	
}
