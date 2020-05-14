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
public class BirdTest {

  /**
   * Test method for {@link Bird#fight(java.lang.String)}.
   */
  @Test
  public void testFight_Ant() {
    //Arrange
    Bird bird = new Bird();
    //Act
    Critter.Attack result = bird.fight("%");
    //Assert
    assertEquals(Critter.Attack.ROAR, result);
  }

  /**
   * Test method for {@link Bird#fight(java.lang.String)}.
   */
  @Test
  public void testFight() {
    //Arrange
    Bird bird = new Bird();
    //Act
    Critter.Attack result = bird.fight(" ");
    //Assert
    assertEquals(Critter.Attack.POUNCE, result);
  }

  /**
   * Test method for {@link Bird#getColor()}.
   */
  @Test
  public void testGetColor() {
    //Arrange
    Bird bird = new Bird();
    //Act
    Color result = bird.getColor();
    //Assert
    assertEquals(Color.BLUE, result);
  }

  /**
   * Test method for {@link Bird#getMove()}.
   */
  @Test
  public void testGetMove_N() {
    //Arrange
    Bird bird = new Bird();
    //Act
    bird.getMove();
    Critter.Direction result = bird.getMove();
    //Assert
    assertEquals(Critter.Direction.NORTH, result);
  }

  /**
   * Test method for {@link Bird#getMove()}.
   */
  @Test
  public void testGetMove_E() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 4;i++){
    bird.getMove();
    }
    Critter.Direction result = bird.getMove();
    //Assert
    assertEquals(Critter.Direction.EAST, result);
  }

  /**
   * Test method for {@link Bird#getMove()}.
   */
  @Test
  public void testGetMove_S() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 7;i++){
    bird.getMove();
    }
    Critter.Direction result = bird.getMove();
    //Assert
    assertEquals(Critter.Direction.SOUTH, result);
  }

  /**
   * Test method for {@link Bird#getMove()}.
   */
  @Test
  public void testGetMove_W() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 10;i++){
    bird.getMove();
    }
    Critter.Direction result = bird.getMove();
    //Assert
    assertEquals(Critter.Direction.WEST, result);
  }

  /**
   * Test method for {@link Bird#toString()}.
   */
  @Test
  public void testToString_N() {
    //Arrange
    Bird bird = new Bird();
    //Act
    String result = bird.toString();
    //Assert
    assertEquals("^", result);
  }
  
  /**
   * Test method for {@link Bird#toString()}.
   */
  @Test
  public void testToString_E() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 4;i++){
    bird.getMove();
    }
    String result = bird.toString();
    //Assert
    assertEquals(">", result);
  }
  
  /**
   * Test method for {@link Bird#toString()}.
   */
  @Test
  public void testToString_S() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 7;i++){
    bird.getMove();
    }
    String result = bird.toString();
    //Assert
    assertEquals("V", result);
  }
  
  /**
   * Test method for {@link Bird#toString()}.
   */
  @Test
  public void testToString_W() {
    //Arrange
    Bird bird = new Bird();
    //Act
    for(int i = 0; i < 10;i++){
    bird.getMove();
    }
    String result = bird.toString();
    //Assert
    assertEquals("<", result);
  }

}
