package tol.sqat.tdd.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tol.sqat.tdd.RomanConverter;

public class RomanConverterTest {
	RomanConverter converter;
	@Before
	public void setUp() {
		converter = new RomanConverter();
	}
	
	@Test
	public void shouldReturnOne() {

		assertEquals("I",converter.toRoman(1));
	}
	
	
	@Test
	public void shouldReturnTwo() {
	
		assertEquals("II",converter.toRoman(2));
	}
	
	@Test
	public void shouldReturnThree() {

		assertEquals("III",converter.toRoman(3));
	}
	
	@Test
	public void shouldReturnFour() {

		assertEquals("IV",converter.toRoman(4));
	}
	
	@Test
	public void shouldReturnFive() {

		assertEquals("V",converter.toRoman(5));
	}

	@Test
	public void shouldReturnSix() {
		RomanConverter converter = new RomanConverter();
		assertEquals("VI",converter.toRoman(6));
	}
	
	@Test
	public void shouldReturnSeven() {
		RomanConverter converter = new RomanConverter();
		assertEquals("VII",converter.toRoman(7));
	}
	
	@Test
	public void shouldReturneight() {
		RomanConverter converter = new RomanConverter();
		assertEquals("VIII",converter.toRoman(8));
	}
	
	@Test
	public void shouldReturnNine() {
		RomanConverter converter = new RomanConverter();
		assertEquals("IX",converter.toRoman(9));
	}
	
	@Test
	public void shouldReturnTen() {
		RomanConverter converter = new RomanConverter();
		assertEquals("X",converter.toRoman(10));
	}
	
	@Test
	public void shouldReturnEleven() {
		RomanConverter converter = new RomanConverter();
		assertEquals("XI",converter.toRoman(10));
	}
	@Test
	public void shouldReturnTwelve() {
		RomanConverter converter = new RomanConverter();
		assertEquals("XII",converter.toRoman(10));
	}
	@Test
	public void shouldReturnThirteen() {
		RomanConverter converter = new RomanConverter();
		assertEquals("XIII",converter.toRoman(10));
	}
}
