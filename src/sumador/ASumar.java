package sumador;

import java.util.Scanner;

public class ASumar {
	
	int i;
	public ASumar(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void laSuma(int i) {
		 while(i > 0) {

	            int resultado = i % 10;

	            i = i / 10;

	        }

	        System.out.println("La suma es: " + i);
		
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero para averiguar la suma de sus d�gitos: ");
		int num=sc.nextInt();
		laSuma(num);
	}
}
