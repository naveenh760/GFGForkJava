package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class setsMapsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long commonSum(int arr1[], int arr2[]) {
		Set<Integer> a1 = new HashSet<Integer>();
		Set<Integer> a2 = new HashSet<Integer>();
		for(int num: arr1) {
			a1.add(num);
		}
		for(int num: arr2) {
			a2.add(num);
		}
		a1.retainAll(a2);
		int result = a1.stream().reduce(0,  (a,b) -> a + b);
		return result;
		
	}
	
	
	public static int LargButMinFreq(int arr[], int n)
    {
		int res = 0;
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for(int item: arr) {
        	if(map.containsKey(item)){
        		map.put(item, map.get(item) + 1);
        	}
        	else {
        		map.put(item,1);
        	}
        	
        }
        
        int minFreq = Collections.min(map.values());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	if(entry.getValue() == minFreq) {
        		res = entry.getKey();
        		break;
        	}
        }
        
        return res;
    }
	
	 // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k)
    {
       IntStream stream = Arrays.stream(arr).filter(element -> element >= k).sorted();
       int[] sorted = stream.toArray();
       if(sorted.length > 0) {
    	   for(int element: sorted) {
    		   System.out.print(element + " ");
    	   }
       }
       else {
    	   System.out.println("-1");
       }
    }
    
    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k)
    {
    	IntStream stream = Arrays.stream(arr).filter(element -> element < k).sorted();
    	int[] sorted = stream.toArray();
    	if(sorted.length > 0) {
     	   for(int element: sorted) {
     		   System.out.print(element + " ");
     	   }
        }
        else {
     	   System.out.println("-1");
        }
        
    }
    
    public static int sumExists(int arr[], int n, int sum)
    {
    	int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int element: arr) {
        	if(set.contains(sum - element)) {
        		res = 1;
        		break;
        	}
        	set.add(element);
        }
        return res;
    }
    
    public static void Election2019(String party[], int seats[], int n)
    {
       Map<String, Integer> seatsMap = new TreeMap<String, Integer>();
       int maxSeats = Integer.MIN_VALUE;
       for(int i = 0; i < party.length; i++) {
    	   seatsMap.put(party[i], seats[i]);
    	   maxSeats = Math.max(maxSeats, seats[i]);
       }
       for(Map.Entry<String, Integer> entry: seatsMap.entrySet()) {
    	   System.out.println(entry.getKey() + " " + entry.getValue());
       }
       System.out.println(maxSeats);
    }
}