package basics;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		printInFormat(6, 6);

	}

	static void IOFunction() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			System.out.println(sc.nextInt());
			System.out.println(sc.nextFloat());
			System.out.println(sc.nextLong());
			System.out.println(sc.nextByte());
			sc.nextLine();
			System.out.println(sc.nextLine());

		}

	}

	static void getInput() {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // Taking the number of testcases
		while (t-- > 0) {
			int a = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();

			// Your code here

			System.out.println(a);
			System.out.println(s);
		}

	}
	
	static void printInFormat(float a, float b){
       float result = a / b ;
       System.out.print(result + " ");
       System.out.format("%.3f", result);
    }    

}
