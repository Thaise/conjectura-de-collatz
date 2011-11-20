package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dojo.ConjecturaDeCollatz;

public class ConjecturaDeCollatzTest {

	@Test
	public void calculaConjecturaDeCollatzComNumero13() {
		Object[] sequencia = ConjecturaDeCollatz.calculaSequenciaDaConjecturaDeCollatz(13);
		assertArrayEquals(new Object[] {13,40,20,10,5,16,8,4,2,1}, sequencia);
	}
	
	@Test
	public void calculaConjecturaDeCollatzComNumero50() {
		Object[] sequencia = ConjecturaDeCollatz.calculaSequenciaDaConjecturaDeCollatz(50);
		assertArrayEquals(new Object[] {50,25,76,38,19,58,29,88,44,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1}, sequencia);
	}
	
	@Test
	public void calculaConjecturaDeCollatzComNumero5() {
		Object[] sequencia = ConjecturaDeCollatz.calculaSequenciaDaConjecturaDeCollatz(5);
		assertArrayEquals(new Object[] {5,16,8,4,2,1}, sequencia);
	}
	
	@Test
	public void calculaConjecturaDeCollatzComNumero10() {
		Object[] sequencia = ConjecturaDeCollatz.calculaSequenciaDaConjecturaDeCollatz(10);
		assertArrayEquals(new Object[] {10,5,16,8,4,2,1}, sequencia);
	}

}
