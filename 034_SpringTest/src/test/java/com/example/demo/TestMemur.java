package com.example.demo;

import static org.mockito.Mockito.*;

import org.junit.Test;

import com.furkankara.Emniyet;
import com.furkankara.Polis;

public class TestMemur {

	@Test
	public void polisGoreviniTestEt() {
		Emniyet mockGorevNesnesi = mock (Emniyet.class);
		
		Polis polis = new Polis(mockGorevNesnesi);
		polis.calis();
		
		verify(mockGorevNesnesi , times(14)).gorevVer();
		
	}
	
	@Test
	public void ogretmeniGorevTestEt() {
		
	}
	
	
	
}
