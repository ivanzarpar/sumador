package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	 public void testNegativo() {
		
	        ASumar sumi = new ASumar("-8");
	        String resultado = sumi.mostrarSiNeg();
	        assertEquals(" ",resultado );
	}

}
