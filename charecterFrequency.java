package Frequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class charecterFrequency {
	public static void main(String[] args) {
		String s="aabbccdd";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char x:s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for(Entry<Character,Integer> y:map.entrySet()) {
			System.out.println(y.getKey() + "  "+y.getValue());
			
		}
	
	}

}
