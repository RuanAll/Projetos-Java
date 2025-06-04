package Recursividade;

public class Fatorial {
	
	static int fat(int n) {
		if (n <= 1)
			return 1;
		int r = fat(n-1)*n;
		return r;
		
	}
	
	public static void main (String[] args) {
		
	System.out.println(fat(5));
		
	}
}

