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
public class HippoTest {

  /**
   * Test method for {@link Hippo#eat()}.
   */
  @Test
  public void testEat_Till_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    hip.eat();
    boolean result = hip.eat();
    //Assert
    assertFalse(result);
  }

  /**
   * Test method for {@link Hippo#eat()}.
   */
  @Test
  public void testEat_Before_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    boolean result = hip.eat();
    //Assert
    assertTrue(result);
  }

  /**
   * Test method for {@link Hippo#eat()}.
   */
  @Test
  public void testEat_While_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    hip.eat();
    boolean result = hip.eat();
    //Assert
    assertFalse(result);
  }

  /**
   * Test method for {@link Hippo#fight(java.lang.String)}.
   */
  @Test
  public void testFight_Hungry() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    Critter.Attack result = hip.fight(" ");
    //Assert
    assertEquals(Critter.Attack.SCRATCH, result);
  }

  /**
   * Test method for {@link Hippo#fight(java.lang.String)}.
   */
  @Test
  public void testFight_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    hip.eat();
    Critter.Attack result = hip.fight(" ");
    //Assert
    assertEquals(Critter.Attack.POUNCE, result);
  }

  /**
   * Test method for {@link Hippo#getColor()}.
   */
  @Test
  public void testGetColor_Hungry() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    Color result = hip.getColor();
    //Assert
    assertEquals(Color.GRAY, result);
  }

  /**
   * Test method for {@link Hippo#getColor()}.
   */
  @Test
  public void testGetColor_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    hip.eat();
    Color result = hip.getColor();
    //Assert
    assertEquals(Color.WHITE, result);
  }

  /**
   * Test method for {@link Hippo#toString()}.
   */
  @Test
  public void testToString_Hungry() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    String result = hip.toString();
    //Assert
    assertEquals("2", result);
  }

  /**
   * Test method for {@link Hippo#toString()}.
   */
  @Test
  public void testToString_Full() {
    //Arrange
    Hippo hip = new Hippo(2);
    //Act
    hip.eat();
    hip.eat();
    String result = hip.toString();
    //Assert
    assertEquals("0", result);
  }

  /**
   * Test method for {@link Hippo#Hippo(int)}.
   */
  @Test
  public void testHippo_Hungry() {
    //Arrange
    //Act
    Hippo hip = new Hippo(2);
    Color result = hip.getColor();
    //Assert
    assertEquals(Color.GRAY, result);
  }

  /**
   * Test method for {@link Hippo#Hippo(int)}.
   */
  @Test
  public void testHippo_Full() {
    //Arrange
    //Act
    Hippo hip = new Hippo(0);
    Color result = hip.getColor();
    //Assert
    assertEquals(Color.WHITE, result);
  }

}
