package it.unipd.mtss;

import static org.junit.Assert.assertTrue;
import java.util.Optional;

import org.junit.Test;

public class IntegerToRomanTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
	public void testPrimi3Numeri(){
		assertTrue(  "I".equals(IntegerToRoman.convert(1).get()));
		assertTrue( "II".equals(IntegerToRoman.convert(2).get()));
		assertTrue("III".equals(IntegerToRoman.convert(3).get()));
	}

	@Test
	public void testPrimi6Numeri(){
		assertTrue("IV".equals(IntegerToRoman.convert(4).get()));
		assertTrue( "V".equals(IntegerToRoman.convert(5).get()));
		assertTrue("VI".equals(IntegerToRoman.convert(6).get()));
	}

	@Test
	public void testNumero10(){
		assertTrue("X".equals(IntegerToRoman.convert(10).get()));
	}

	@Test
	public void testNumero9(){
		assertTrue("IX".equals(IntegerToRoman.convert(9).get()));
	}

	@Test
	public void testNumero256(){
		assertTrue("CCLVI".equals(IntegerToRoman.convert(256).get()));
	}

	@Test
	public void testNumero128(){
		assertTrue("CXXVIII".equals(IntegerToRoman.convert(128).get()));
	}

	@Test
	public void testNumero12(){
		assertTrue("XII".equals(IntegerToRoman.convert(12).get()));
	}

	@Test
	public void testNumero144(){
		assertTrue("CXLIV".equals(IntegerToRoman.convert(144).get()));
	}

	@Test
	public void testNumeroNegativo(){
		assertTrue(Optional.empty().equals(IntegerToRoman.convert(-1)));
	}

	@Test
	public void testNumeroAppenaTroppoGrande(){
		assertTrue(Optional.empty().equals(IntegerToRoman.convert(1001)));
	}

	@Test
	public void testNumeroTroppoGrande(){
		assertTrue(Optional.empty().equals(IntegerToRoman.convert(9998)));
	}

}
