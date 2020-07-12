package collections;

import java.util.ArrayList;
import java.util.Collections;

public class listEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
    	int freq = Collections.frequency(clist, c);
        if(freq > 0)
        System.out.println(freq);
        else
        System.out.println("Not Present");
        
    }
    
 // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
        
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        
        Collections.sort(list);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        int ind = list.indexOf(val);
        if(ind >= 0) {
        	System.out.println(ind);
        	flag = 1;
        }
        if(flag == -1){
            System.out.println("-1");
        }
        
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());
    }

}
