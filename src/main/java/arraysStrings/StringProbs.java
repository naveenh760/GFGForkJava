package arraysStrings;

public class StringProbs {

	public static void main(String[] args) {
		String s = "xxyyxxyyxyxyxyxyyxyxy";
		follPatt(s);

	}

	static void checkString(String s) {
		int v = 0;
		int c = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else if (ch != ' ') {
				c++;
			}
		}

		if (v > c)
			System.out.print("Yes");
		else if (c > v)
			System.out.print("No");
		else
			System.out.print("Same");

		System.out.println();
	}

	static void follPatt(String s) {

		int xc = 0;
		int yc = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'x' && (i == 0 || s.charAt(i-1) == 'y')) {
				if(xc == yc) {
					xc = 0;
					yc = 0;
					xc++;
				}
				else {
					break;
				}
			}
			else if( s.charAt(i) == 'x') {
				xc++;
			}
			else if( s.charAt(i) == 'y') {
				yc++;
			}
		}
		if(xc == yc) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}

		System.out.println();
	}

}
