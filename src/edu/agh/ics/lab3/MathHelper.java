package edu.agh.ics.lab3;

public class MathHelper {

	public static final double PI = 3.14159;
	
	public static boolean isArithmetic(double... ds) { // dowolna liczba argumentow okreslonego typu
		if (ds.length < 2) {
			return true;
		}
		
		double sub = ds[1] - ds[0];
		for (int i = 1; i < ds.length - 1; i++) {
			if (ds[i + 1] - ds[i] != sub) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isGeometric(double... ds) {
		if (ds.length < 2) {
			return true;
		}
		
		if (ds[0] == 0) {
			return false;
		}
		
		double div = ds[1] / ds[0];
		for (int i = 1; i < ds.length - 1; i++) {
			if (ds[i + 1] / ds[i] != div) {
				return false;
			}
		}
		return true;
	}
	
	public static double harmonicMean(double... ds) {
		double denom = 0.0;
		for (double item : ds) {
			if (item == 0) {
				System.out.println("Jeden z argumentów jest równy zero. Nie dzielimy przez zero.");
				return 0.0;
			}
			else {
				denom += 1 / item;
			}
		}
		return ds.length / denom;
	}
	
	public static void main(String[] args) {
		System.out.println(isArithmetic());
		System.out.println(isArithmetic(1));
		System.out.println(isArithmetic(1,1));
		System.out.println(isArithmetic(1,3,5));
		System.out.println(isArithmetic(1,3,8));
		System.out.println(isGeometric());
		System.out.println(isGeometric(1));
		System.out.println(isGeometric(1,1));
		System.out.println(isGeometric(1,3,9));
		System.out.println(isGeometric(0,0,0));
		System.out.println(isGeometric(1,3,8));
		System.out.println(harmonicMean(2,7,15,18,14,11,20));
		System.out.println(harmonicMean(2,4,6));
	}
}
