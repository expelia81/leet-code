class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        Map<String,Integer> prioMap = new HashMap<>();
        prioMap.put("IV",4);
        prioMap.put("IX",9);
        prioMap.put("XL",40);
        prioMap.put("XC",90);
        prioMap.put("CD",400);
        prioMap.put("CM",900);
        
        

		String result="0";
		for(String k : prioMap.keySet()){
			if(s.contains(k)){
				result=result+","+prioMap.get(k);
				s = s.replace(k,"");
			}
		}
		for (String k : map.keySet()) {
			while(s.contains(k)){
				result=result+","+map.get(k);
				s = s.replaceFirst(k,"");
			}
		}
        
        String[] arr = result.split(",");
        int value = 0;
        for(String t : arr) {
            value += Integer.valueOf(t);
        }
        
        return value;
    }
}