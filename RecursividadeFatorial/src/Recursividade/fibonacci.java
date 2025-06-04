package Recursividade;

public class fibonacci {

	static int fib(int n) {
		if (n <= 2)
			return 1;
		int resp = fib(n-1) + fib(n-2);
		return resp;
	}
	
	public static void main(String[] args) {
		for(int i=1; i <= 8; i++) {
		System.out.println(fib());
		int tot[] = {3,2,1};
		}
	}
}
