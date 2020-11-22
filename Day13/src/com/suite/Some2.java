package com.suite;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Some2 {
	String message="pavani";
	Some s=new Some();
	@Test
	void testAppendMessage() {
		assertEquals(message,s.appendMessage());
	}
}
