package edu.agh.ics.lab3;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class MapExperiments {

	public static Logger log = Logger.getLogger(MapExperiments.class);
	
	public static void main(String[] args) {
		if(args.length == 0) {
			log.error("Provide at least one argument...");
			System.exit(-1);
		}
		Map<String, Integer> map = new TreeMap<>();
		for(int i = 0; i < args.length; i++) {
			String arg = args[i];
			if(map.containsKey(arg)) {
				map.put(arg, map.get(arg) + 1);
			} else {
				map.put(arg, 1);
			}
		}
		for(Entry<String, Integer> element : map.entrySet()) {
			log.info(element.getKey() + " : " + element.getValue());
		}
	}
}
