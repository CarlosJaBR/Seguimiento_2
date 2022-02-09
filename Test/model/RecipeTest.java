package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class RecipeTest {

	
	private Recipe recipe; 
	
	private void setupStage1() {
		recipe = new Recipe(); 
	}
	
	private void setupStage2() throws NegativeNumberException{
		
		recipe = new Recipe();
		
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
		
		
	}
	
	@Test
	public void testAddIngredient() throws NegativeNumberException {
		
		setupStage1(); 
		recipe.addIngredient("Sal", 12);
		
		//System.out.println(recipe.getIngredients().size());
		
		assertNotNull(recipe); 
		assertEquals(1,recipe.getIngredients().size());
		assertEquals("Sal", recipe.getIngredients().get(0).getName());
		assertEquals(12,recipe.getIngredients().get(0).getWeight());
	}
	@Test 
	public void testAddIngredient2() throws NegativeNumberException {
		
		setupStage2(); 
		
		recipe.addIngredient("Pimienta", 6);
		int index = recipe.getIngredients().size()-1;
		
		assertNotNull(recipe);
		assertEquals(4,recipe.getIngredients().size()); 
		assertEquals("Pimienta", recipe.getIngredients().get(index).getName());
		assertEquals(6,recipe.getIngredients().get(index).getWeight());
		
	}
	@Test
	public void testAddIngredient3() throws NegativeNumberException {
		setupStage2();
		recipe.addIngredient("Ajo", 21);
		assertNotNull(recipe);
	    assertEquals(3,recipe.getIngredients().size());
		assertEquals("Ajo", recipe.getIngredients().get(1).getName());
		assertEquals(79,recipe.getIngredients().get(1).getWeight());
	}
	
	@Test 
	public void testRemoveIngredient() throws NegativeNumberException {
		setupStage2();
		recipe.removeIngredient("Ajo");
		assertNotNull(recipe);
		assertEquals(2,recipe.getIngredients().size());
		assertEquals("Cebolla", recipe.getIngredients().get(0).getName());
		assertEquals("Arroz", recipe.getIngredients().get(1).getName());
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/
}
