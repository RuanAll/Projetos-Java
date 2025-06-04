package Recursividade;

public class fatorial {
	
	static int fatorial(int a) {
			if (a <= 1)
				return 1; 
			int resp = a * fatorial(a-1);
			return resp;
	}
	
	public static void main (String[] args) {
		
		System.out.println(fatorial(5));
	}
}
