import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Justin
 *
 */
public class ButterflyTest {

  /**
   * Test method for {@link Butterfly#getColor()}.
   */
  @Test
  public void testGetColor() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    Color result = butt.getColor();
    // Assert
    assertEquals(Color.YELLOW, result);
  }

  /**
   * Test method for {@link Butterfly#getMove()}.
   */
  @Test
  public void testGetMove_1() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    Critter.Direction result = butt.getMove();
    // Assert
    assertEquals(Critter.Direction.NORTH, result);
  }

  /**
   * Test method for {@link Butterfly#getMove()}.
   */
  @Test
  public void testGetMove_2() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    butt.getMove();
    Critter.Direction result = butt.getMove();
    // Assert
    assertEquals(Critter.Direction.WEST, result);
  }

  /**
   * Test method for {@link Butterfly#getMove()}.
   */
  @Test
  public void testGetMove_3() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    butt.getMove();
    butt.getMove();
    Critter.Direction result = butt.getMove();
    // Assert
    assertEquals(Critter.Direction.NORTH, result);
  }

  /**
   * Test method for {@link Butterfly#getMove()}.
   */
  @Test
  public void testGetMove_4() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    butt.getMove();
    butt.getMove();
    butt.getMove();
    Critter.Direction result = butt.getMove();
    // Assert
    assertEquals(Critter.Direction.EAST, result);
  }

  /**
   * Test method for {@link Butterfly#toString()}.
   */
  @Test
  public void testToString_No_Move() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    String result = butt.toString();
    // Assert
    assertEquals("x", result);
  }

  /**
   * Test method for {@link Butterfly#toString()}.
   */
  @Test
  public void testToString_One_Move() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    butt.getMove();
    String result = butt.toString();
    // Assert
    assertEquals("-", result);
  }

  /**
   * Test method for {@link Butterfly#toString()}.
   */
  @Test
  public void testToString_Two_Moves() {
    // Arrange
    Butterfly butt = new Butterfly();
    // Act
    butt.getMove();
    butt.getMove();
    String result = butt.toString();
    // Assert
    assertEquals("x", result);
  }

}
