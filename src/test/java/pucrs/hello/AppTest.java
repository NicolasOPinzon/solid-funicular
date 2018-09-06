package pucrs.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testGetSaudacaoOlaMundo() {
		String expected = "Olá, mundo!";
		String actual = pucrs.hello.App.getSaudacao();
		assertEquals(expected, actual);
	}

}
