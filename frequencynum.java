package Frequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequencynum {
	public static void main(String[] args) {
		int num=1231234;
		Map<Integer,Integer> map=new LinkedHashMap<>();
		while(num!=0) {
			map.put(num%10,map.getOrDefault(num, 0)+1);
			num/=10;
		}
		for(Entry<Integer,Integer> y:map.entrySet()) {
			System.out.println(y.getKey()+": "+y.getValue());
			
		}
		
	}

}
