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
public class AntTest {

  /**
   * Test method for {@link Ant#eat()}.
   */
  @Test
  public void testEat() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    boolean result = ant.eat();
    //Assert
    assertTrue(result);
  }

  /**
   * Test method for {@link Ant#eat()}.
   */
  @Test
  public void testEat_2() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    ant.eat();
    boolean result = ant.eat();
    //Assert
    assertTrue(result);
  }

  /**
   * Test method for {@link Ant#fight(java.lang.String)}.
   */
  @Test
  public void testFight() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    Critter.Attack result = ant.fight(" ");
    //Assert
    assertEquals(Critter.Attack.SCRATCH, result);
  }

  /**
   * Test method for {@link Ant#getColor()}.
   */
  @Test
  public void testGetColor() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    Color result = ant.getColor();
    //Assert
    assertEquals(Color.RED, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_True_Move_1() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.SOUTH, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_True_Move_2() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    ant.getMove();
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.EAST, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_True_Move_3() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    ant.getMove();
    ant.getMove();
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.SOUTH, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_False_Move_1() {
    //Arrange
    Ant ant = new Ant(false);
    //Act
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.NORTH, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_False_Move_2() {
    //Arrange
    Ant ant = new Ant(false);
    //Act
    ant.getMove();
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.EAST, result);
  }

  /**
   * Test method for {@link Ant#getMove()}.
   */
  @Test
  public void testGetMove_False_Move_3() {
    //Arrange
    Ant ant = new Ant(false);
    //Act
    ant.getMove();
    ant.getMove();
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.NORTH, result);
  }

  /**
   * Test method for {@link Ant#toString()}.
   */
  @Test
  public void testToString_true() {
    //Arrange
    Ant ant = new Ant(true);
    //Act
    String result = ant.toString();
    //Assert
    assertEquals("%", result);
  }

  /**
   * Test method for {@link Ant#toString()}.
   */
  @Test
  public void testToString_false() {
    //Arrange
    Ant ant = new Ant(false);
    //Act
    String result = ant.toString();
    //Assert
    assertEquals("%", result);
  }

  /**
   * Test method for {@link Ant#Ant(boolean)}.
   */
  @Test
  public void testAnt_True() {
    //Arrange
    //Act
    Ant ant = new Ant(true);
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.SOUTH, result);
  }


  /**
   * Test method for {@link Ant#Ant(boolean)}.
   */
  @Test
  public void testAnt_False() {
    //Arrange
    //Act
    Ant ant = new Ant(false);
    Critter.Direction result = ant.getMove();
    //Assert
    assertEquals(Critter.Direction.NORTH, result);
  }
}
