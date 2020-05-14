import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

/**
 * Unit test for Critter Stone. It doesn't
 * do any special construction, so there are 
 * just method tests here.
 * 
 * @author Amelia
 * @version 20170405 initial version
 */
public class StoneTest {

	/**
	 * Test method for {@link Stone#fight(java.lang.String)}.
	 */
	@Test
	public void testFightOnce() {
		// ARRANGE
		Stone stone = new Stone();
		// ACT
		Critter.Attack fight = stone.fight("L");
		// ASSERT
		assertEquals(Critter.Attack.ROAR, fight);
	}

	/**
	 * Make sure fight doesn't change when called over and over.
	 * (Stones always react the same, but check anyway).
	 * We already know it's ROAR from the other test, so
	 * just check that it doesn't change.
	 * Test method for {@link Stone#fight(java.lang.String)}.
	 */
	@Test
	public void testFightMany() {
		// ARRANGE
		Stone stone = new Stone();
		// ACT
		Critter.Attack fight = stone.fight("L");
		// two more before we check again.
		// note we don't have to save their return values.
		stone.fight("%"); 
		stone.fight("S");
		Critter.Attack fight2 = stone.fight("S");
		// ASSERT
		assertEquals(fight, fight2);
	}

	/**
	 * Stones don't care if they are fighting ghosts (nulls)
	 * Test method for {@link Stone#fight(java.lang.String)}.
	 */
	@Test
	public void testFightNull() {
		// ARRANGE
		Stone stone = new Stone();
		// ACT
		Critter.Attack fight = stone.fight(null);
		// ASSERT
		assertEquals(Critter.Attack.ROAR, fight);
	}

	/**
	 * Stones never change color. Could test getColor then 
	 * take other actions like move or fight and re-test color.
	 * Test method for {@link Stone#getColor()}.
	 */
	@Test
	public void testGetColor() {
		// ARRANGE
		Stone stone = new Stone();
		// ACT
		Color color = stone.getColor();
		// ASSERT
		assertEquals(Color.GRAY, color);
	}

	/**
	 * Stones toString never changes. Could test that by
	 * getting value, making moves/eating, and re-getting the value.
	 * Test method for {@link Stone#toString()}.
	 */
	@Test
	public void testToString() {
		// ARRANGE
		Stone stone = new Stone();
		// ACT
		String name = stone.toString();
		// ASSERT
		assertEquals("S", name);
	}

}
