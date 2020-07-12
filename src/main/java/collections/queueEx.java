package collections;

import java.util.Queue;

public class queueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
 //      return  Collections.frequency(q, k);
       return (int) q.stream().filter(e-> e== k).count();
    }

}
