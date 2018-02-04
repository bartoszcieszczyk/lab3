package edu.agh.ics.lab3;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

//public class EuclideanDistance implements Distance {
public class EuclideanDistance<T extends Number> implements Distance<T> {
	
	private static Logger log = Logger.getLogger(EuclideanDistance.class);

//	@Override
//	public double distance(double[] vectorA, double[] vectorB) {
//		if(vectorA.length != vectorB.length) return -1;
//		double sum = 0;
//		for (int i = 0; i < vectorA.length; i++) {
//			sum += Math.pow(vectorA[i] - vectorB[i], 2);
//		}
//		return Math.sqrt(sum);
//	}
	
	public double distance(List<T> vectorA, List<T> vectorB) throws NotMatchingDimensionsException {
		if(vectorA.size() != vectorB.size()) {
			throw new NotMatchingDimensionsException(vectorA.size() + " not matches " + vectorB.size());
		}
		double sum = 0;
		for (int i = 0; i < vectorA.size(); i++) {
			sum += Math.pow((vectorA.get(i).doubleValue() - vectorB.get(i).doubleValue()), 2);
		}
		return Math.sqrt(sum);
	}
	
//	public static void main(String[] args) {
//		double[] vectorA = new double[] {0.0, 0.0};
//		double[] vectorB = new double[] {1.0, 1.0};
//		EuclideanDistance ed = new EuclideanDistance();
//		log.info(ed.distance(vectorA, vectorB));
//	}
	
		
	public static void main(String[] args) {
		List<Integer> vectorA = Arrays.asList(0, 0);
		List<Integer> vectorB = Arrays.asList(1, 1);
		EuclideanDistance<Integer> ed = new EuclideanDistance<>();
		try {
			log.info(ed.distance(vectorA, vectorB));
		}
		catch(NotMatchingDimensionsException e) {
			log.error("Problem with distance computation", e);
		}
	}
}
