package edu.agh.ics.lab3;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

public class ArrayListExperiments {

	public static Logger log = Logger.getLogger(ArrayListExperiments.class);

	public static int SIZE = 10_000_000;

	public static void main(String[] args) {
		
		/*
		List<Integer> ListA = new ArrayList<>();
		log.info("Size: " + ListA.size());
		long start = System.currentTimeMillis();
		for (int i = 0; i < SIZE; i++)
			ListA.add(1);
		long end = System.currentTimeMillis();
		log.info("ArrayList : " + (end - start)/1000.0 + " [s]");
		log.info("Size: " + ListA.size());
		*/
		
		
		/*
		List<Integer> ListB = new ArrayList<>(SIZE); // prealokacja capacity na stercie
		log.info("Size: " + ListB.size());
		long start = System.currentTimeMillis();
		for (int i = 0; i < SIZE; i++)
			ListB.add(1);
		long end = System.currentTimeMillis();
		log.info("ArrayList : " + (end - start)/1000.0 + " [s]");
		log.info("Size: " + ListB.size());
		*/
		

		List<Integer> ListC = new LinkedList<>();
		log.info("Size: " + ListC.size());
		long start = System.currentTimeMillis();
		for (int i = 0; i < SIZE; i++)
			ListC.add(1);
		long end = System.currentTimeMillis();
		log.info("LinkedList : " + (end - start)/1000.0 + " [s]");
		log.info("Size: " + ListC.size());
		
	}

}
