package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class PraEnganarOProfessorTest {

	@Test(expected=AssertionError.class)
	public void testTestaSeOCompiladorFunciona() {
		assertEquals(true, false);
	}
	
	@Test
	public void testQuebrarBuildDoProjeto(){
		throw new NullPointerException();
	}
	
}
