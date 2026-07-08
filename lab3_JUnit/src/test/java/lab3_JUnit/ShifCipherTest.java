package lab3_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lab3_JUnitTest.ShiftCipher;

class ShifCipherTest {
	
	ShiftCipher shiftcipher = new ShiftCipher();

	@Test
	void TC01() {
		assertEquals("ZVMADHYL", shiftcipher.shift("SOFTWARE",3));
	}
	@Test
	void TC02() {
		assertEquals("zvmadhyl", shiftcipher.shift("software",3));
	}
	@Test
	void TC03() {
		assertEquals("HELLO", shiftcipher.shift("HELLO",0));
	}
	@Test
	void TC04() {
		assertEquals("invalid", shiftcipher.shift("4567",0));
	}
	
}
