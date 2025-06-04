package Recursividade;

public class exponencial {

	static int exp(int a,int n) {
		if(n==0)
			return 1;
		return a * exp(a,n-1);
	}
	
	public static void main(String [] args) {
		System.out.println(exp(2,5));
		
	}
}
