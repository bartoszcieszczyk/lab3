package edu.agh.ics.lab3;

import java.util.List;

//public interface Distance { // interfejs funkcyjny - ma tylko jedn� klas�
public interface Distance<T extends Number> { // interfejs funkcyjny - ma tylko jedn� klas�
	
//	public double distance(double[] vectorA, double[] vectorB) throws NotMatchingDimensionsException;
	
	double distance(List<T> vectorA, List<T> vectorB) throws NotMatchingDimensionsException;

}
