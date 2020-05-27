package sumador;

public class IZPfunciona {

	public static void main(String[] args) {
		ASumar as=new ASumar("5");
		
		System.out.println(as.mostrar());
ASumar a2=new ASumar("-8");
		
		System.out.println(as.mostrarSiNeg());
ASumar a3=new ASumar("185");
		
		System.out.println(as.mostrarSiMasNueve());
	}

}
