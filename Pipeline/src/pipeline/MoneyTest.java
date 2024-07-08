package pipeline;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MoneyTest {

	@Test
	public void testSimpleAdd() {
		Money m12CHF = new Money(12, "CHF"); // cr�ation de donn�es 
		Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(26, "CHF");
		Money result = m12CHF.add(m14CHF); // ex�cution de la m�thode test�e 
		assertTrue(result.equals(expected)); // comparaison
	}	
	
	@Before
	public void testbefore() {
		System.out.print("Apres");
	}

}
