package sumador;

import java.util.Scanner;

public class ASumar {
	
	
	static String s;
	

	public ASumar(String res) {
		this.s=res;
	}

	public static String laSuma(int i) {
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

		s=Integer.toString(sum);
	      return s; 
	       	
		
	}
	
	public String mostrar() {
        String numero = s;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        } 
        return null;
}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero para averiguar la suma de sus d�gitos: ");
		int num=sc.nextInt();
		laSuma(num);
		
		
	}

	
}
