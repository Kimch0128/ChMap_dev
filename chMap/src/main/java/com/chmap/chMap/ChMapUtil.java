package com.chmap.chMap;

import java.util.ArrayList;
import java.util.Arrays;

public class ChMapUtil{

	public static boolean isEmpty(ChMap chMap) {
		if(chMap == null || chMap.isEmpty())
			return true;
		return false;
	}
	
	public static <E> ArrayList<E> arrayToArrayList(E[] array){
		return new ArrayList<E>(Arrays.asList(array));
	}
}
