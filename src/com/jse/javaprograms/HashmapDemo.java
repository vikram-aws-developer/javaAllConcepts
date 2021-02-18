package com.jse.javaprograms;

import java.util.HashMap;
import java.util.Map;

class HashmapDemo {

	public static void main(String[] args) {
		
	//int num[] = {1,2,3,3,5,1,6,4,10,1,7,8,1,2,1};
		String num =  "Siva venkata vara Prasad Pattela";
	char[] name = num.trim().toUpperCase().toCharArray();
	Map<Character,Integer> map = new HashMap<>();
	
	/*
	 * for(int i=0;i<num.length;i++) {
	 * //System.out.println("begin"+num[i]+""+map.containsKey(num[i]));
	 * if(!map.containsKey(num[i])) { map.put(num[i],1); } else { map.put(num[i],
	 * map.get(num[i])+1); }
	 * 
	 * }
	 */
	
	for(int i =0; i< name.length; i++) {
		if(!map.containsKey(name[i])) {
			map.put(name[i], 1);
		} else {
			map.put(name[i], map.get(name[i])+1);
		}
	}
	
	System.out.println(""+map);
	
		
	}

}
