package com.gk.jinkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculTest {
	
	 @Test
	    public void testOpposeDeX() {
	        Calcul calc = new Calcul();
	        int x = 5;
	        int opposeResult = calc.opposeDeX(x);
	        assertEquals(-x, opposeResult);
	    }

	    @Test
	    public void testXPuissance2() {
	    	Calcul calc = new Calcul();
	        int x = 3;
	        int puissance2Result = calc.xPuissance2(x);
	        assertEquals(x * x, puissance2Result);
	    }

}
