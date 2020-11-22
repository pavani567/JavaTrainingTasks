package com.suite;
import static org.junit.Assert.*;

import org.junit.Test;
public class Some1 {
	String message="pavani";
	Some s=new Some();
	@Test
	 void testPrintMessage() {
		assertEquals(message,s.printMessage());
	}
}
