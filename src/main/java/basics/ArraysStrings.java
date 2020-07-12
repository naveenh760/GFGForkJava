package basics;

import java.util.HashMap;
import java.util.Map;

public class ArraysStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int countSpecials(int a[],int k){
		int n = a.length;
        int f = (int)Math.floor(n/k);
        
        Map<Integer, Integer> freqMap = new HashMap<Integer,Integer>();
        for(int element: a) {
        	if(freqMap.containsKey(element)) {
        		freqMap.put(element, freqMap.get(element) + 1);
        	}
        	else {
        		freqMap.put(element,1);
        	}
        }
        int count = 0;
        for(int element: freqMap.values()) {
        	if(element == f) {
        		count++;
        	}
        }
        return count;
    }

}
