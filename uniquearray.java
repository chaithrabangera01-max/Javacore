package Frequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class uniquearray {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,1,3,4,7,8,9};
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int x:a) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(Entry<Integer,Integer> y:map.entrySet()) {
			if(y.getValue()==1) {
				System.out.println(y.getKey());
			}
		}
	}

}
