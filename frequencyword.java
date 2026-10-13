package Frequency;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
public class frequencyword {
	public static void main(String[] args) {
		String s="Helllo tony,tony says he is a Iron man";
		Map<String,Integer> map=new LinkedHashMap<>();
		for(String x:s.split(" ")) {
			map.put(x,map.getOrDefault(x, 0)+1);
			
		}
		for(Entry<String,Integer> y:map.entrySet()) {
			System.out.println(y.getKey() +"  "+y.getValue());
			
		}
	} 

}
