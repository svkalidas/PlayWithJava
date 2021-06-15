package com.ksv.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringSplitLogic {

	public static void main(String[] args) {
		String input = "6[a]2[2[6[x]3[z]]]";
		//System.out.println(processString(input));
		//aaaaaaxxxxxxzzzxxxxxxzzzxxxxxxzzzxxxxxxzzz
		//System.out.println(decryptString(input));
		
		String input1 = "6[a]2[2[6[x]3[z]]]2[3[b]2[R]]2[WW]";
		System.out.println(decryptString(input1));
	}
	
	private static String processString(String input){
		String outPut="";
		if(input != null && !input.isEmpty()){
			String temp="";
			String data = "";
			int count;
			for(int i = 0; i<input.length(); i++){
				data = input.substring(i,i+1);
				try{
					count = Integer.parseInt(data);
					for(int j = 0; j<count; j++){
						outPut +=temp;
					}
					temp = "";
				}catch(Exception e){
					temp = !"[".equals(data)&& !"]".equals(data)?(temp+data):temp;
				}
				
			}
		}
		return outPut;
	}
	
	private static String decryptString(String input) {
		
		Map<StringBuilder, List<Object>> dataMap = new LinkedHashMap();
		
		if(!StringUtils.isEmpty(input)) {
				
				List<StringBuilder> lastCount = new ArrayList<>();
				List<Object> lastCombination = new ArrayList<>();
				
				String count = "";
				String tempValue = "";
			
			for(int i =0; i<input.length(); i++) {
				String temp = String.valueOf(input.charAt(i));
				if(NumberUtils.isNumber(temp)){
					if(!StringUtils.isEmpty(count)) {
						lastCount.add(new StringBuilder(count));
						count = "";
					}
					count = count + temp;
				}else{
					if("[".equals(temp) ) {
						continue;
					}else {
						if(NumberUtils.isNumber(temp)){
							if(!StringUtils.isEmpty(count)) {
								lastCount.add(new StringBuilder(count));
								count = "";
							}
							
							count = count+temp;
							
						}else if("]".equals(temp)){
							
							if(count.isEmpty() && tempValue.isEmpty()) {
								
								if(lastCount.size() > 1) {
									Map<StringBuilder, List<Object>> map = new HashMap<>();
									List<Object> elements = new ArrayList<>(lastCombination);
									lastCombination.clear();
									map.put(new StringBuilder(lastCount.remove(lastCount.size() - 1)), elements);
									lastCombination.add(map);
 								}else {
 									List<Object> elements = new ArrayList<>(lastCombination);
									lastCombination.clear();
 									dataMap.put(new StringBuilder(lastCount.remove(0)), elements);
 								}
								
							}else {
								
								if(lastCount.isEmpty()) {
									List<Object> element = new ArrayList<>();
									element.add(tempValue);
									tempValue = "";
									dataMap.put(new StringBuilder(count), element);
								}else {
									
									Map<StringBuilder, List<Object>> map = new HashMap<>();
									List<Object> elements = new ArrayList<>();
									elements.add(tempValue);
									map.put(new StringBuilder(count), elements);
									lastCombination.add(map);
									tempValue = "";
								}
								count = "";
							}
						}else {
							tempValue = tempValue+temp;
						}
						
					}
					
				}
			}
			
		}
		return processData(dataMap);
		
	}
	
	
	private static String processData(Map<StringBuilder, List<Object>> dataMap) {

		String outPut ="";
		String outPut1 ="";
		String outPut2 = "";
		for(Map.Entry<StringBuilder, List<Object>> data : dataMap.entrySet()) {
			for (Object obj : data.getValue()) {
				if (obj instanceof Map) {
					outPut2 = StringUtils.isEmpty(outPut2)?processData((Map<StringBuilder, List<Object>>) obj):outPut2+processData((Map<StringBuilder, List<Object>>) obj);
				} else {
					outPut1 = (String) obj;
				}
			}
			int count = Integer.parseInt(data.getKey().toString());
			if(StringUtils.isEmpty(outPut1) && !StringUtils.isEmpty(outPut2)) {
				outPut1 = outPut2;
				count = count >=1?count-1:count;
			}
			for(int i = 0; i<count;i++) {
				outPut2 += outPut1;
			}
			outPut1 = "";
			outPut +=outPut2;
			outPut2 = "";
		}
		return outPut;
	}
	
	
}
