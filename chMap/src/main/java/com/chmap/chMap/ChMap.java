package com.chmap.chMap;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Set;

public class ChMap extends LinkedHashMap<String, Object> implements Serializable{
//	private static final long serialVersionUID = 4686410411375373904L;
	
	//LinkedHashMap set overwride
	public boolean set(String key, Object value) {
		boolean result = true;
		try {
			if(containsKey(key))
				put(key,value);
			else
				result = false;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public String getString(String key) {
		try {
			return get(key).toString();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int getInt(String key) {
		int result;
		try {
			return Integer.parseInt(get(key).toString());
		}catch (Exception e) {
			e.printStackTrace();
			return (Integer) null;
		}
	}
	
	public long getLong(String key) {
		try {
			return Long.parseLong(get(key).toString());
		} catch (Exception e) {
			e.printStackTrace();
			return (Long) null;
		}
	}
	
	public double getDouble(String key) {
		try {
			return Double.parseDouble(get(key).toString());
		} catch (Exception e) {
			e.printStackTrace();
			return (Double) null;
		}
	}
//	public boolean addMap(ChMap chMap) {
//		boolean result = true;
//		try {
//			chMap.forEach((k,v)->{
//				boolean isExists = containsKey(k);
//				
//				if(!isExists)
//					set(k,v);
//				else
//					set("dup_"+k,v);
//			});
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			result = false;
//		}
//		return result;
//	}
}
