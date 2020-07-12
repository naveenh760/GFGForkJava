package classes;

import java.util.Arrays;
import java.util.Comparator;

public class PairSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 static void sortPairs(Pair arr[], int N){
		  Comparator<Pair> compLambda = (Pair p1, Pair p2) -> Integer.compare(p1.x, p2.x);
	        Arrays.sort(arr,compLambda);
	        
	        for(int i = 0;i<N;i++){
	            System.out.print(arr[i].x + " " + arr[i].y + " ");
	        }
	        System.out.println();
	    }

}


class Pair{
	int x;
	int y;
	
	public Pair(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
