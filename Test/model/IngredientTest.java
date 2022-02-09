package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {

	
	private Ingredient ingredient; 
	
	private void setupStage1() {
		ingredient = new Ingredient("Tomate",245);
	}
	
	@Test 
	public void testAddWeight() {
		setupStage1();
		//Primer prueba check.
		try {
			ingredient.addWeight(54);
		}catch(NegativeNumberException e){
			e.printStackTrace();
		}
		assertTrue(ingredient.getWeight()==299);
		
	}
	
	@Test
	public void testAddWeight2() {
		setupStage1(); 
		//Segunda prueba check
		try {
			ingredient.addWeight(-100);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		assertEquals(ingredient.getWeight(),245); //Acá tambien puede ser con assertTrue, es una expresión booleana.
		
	}
	
	
	@Test
	public void testRemoveWeight() {
		setupStage1(); 
		//Tercera prueba check
		try {
			ingredient.removeWeight(45);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(ingredient.getWeight()==200); 
		
	}
	
	@Test
	public void testRemoveWeigth2() {
		setupStage1();
		try {
			ingredient.removeWeight(-100);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		
		assertTrue(ingredient.getWeight()==245);
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

}
