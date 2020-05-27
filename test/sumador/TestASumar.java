package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	 public void testUnDigito() {
        ASumar sumi = new ASumar("8");
        String o="8";
        String resultado = sumi.mostrar(o);
        assertEquals("8",resultado );
    }

}
