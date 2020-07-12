package arraysStrings;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void interchange(int a[][], int r, int c) {

		int first = 0;
		int last = c - 1;
		for (int i = 0; i < r; i++) {
			int temp = a[i][first];
			a[i][first] = a[i][last];
			a[i][last] = temp;
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int columnWithMaxZero(int a[][],int n){
        int maxCount = 0;
        int maxColumn = 0;
        for(int c = 0 ; c < n; c++){
            int count = 0;
            for(int r = 0; r < n; r++){
                if(a[r][c] == 0){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxColumn = c;
            }
        }
        return maxColumn;
        
    }

}
