package sumador;

import java.util.Scanner;

public class ASumar {
	
	int i;
	String s;
	public ASumar(int i) {
		// TODO Auto-generated constructor stub
	}

	public ASumar(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void laSuma(int i) {
		 int resultado = 0;
		 int sum=0;
		while(i > 0) {

	           
	            	resultado=i % 10;

	            i = i / 10;
	            sum=sum+resultado;
	                
	           
	        }
		
		 System.out.println("La suma es: " +sum);
		
		if(i<0){
	        	System.out.println(" ");
	        }

	        
	       	
		
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para averiguar la suma de sus dígitos: ");
		int num=sc.nextInt();
		laSuma(num);
	}

	public String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
}
