package Frequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class uniqueString {
	public static void main(String[] args) {
		String s="Helllo tony tony tony says he is a Iron man";
		Map<String,Integer> map=new LinkedHashMap<>();
		for(String x:s.split("\\s+")) {
			map.put(x,map.getOrDefault(x, 0)+1);
			
		}
		for(Entry<String,Integer> y:map.entrySet()) {
			if(y.getValue()==1) {
				System.out.println(y.getKey());
			}
		}
	}

}
