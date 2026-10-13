package Frequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class dublicatenumbers {
	public static void main(String[] args) {
		int num=123312434;
		Map<Integer,Integer> map=new LinkedHashMap<>();
		while(num!=0) {
			map.put(num%10,map.getOrDefault(num%10, 0)+1);
			num/=10;
		}
		for(Entry<Integer,Integer> y:map.entrySet()) {
			if(y.getValue()>1) {
				System.out.println(y.getKey());
			}
			
		}
		
	}

}
