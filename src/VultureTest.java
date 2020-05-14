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
public class VultureTest {

  /**
   * Test method for {@link Vulture#eat()}.
   */
  @Test
  public void testEat_First_time() {
    //Arrange
    Vulture vult = new Vulture();
    //Act
    boolean result = vult.eat();
    //Assert
    assertTrue(result);
  }

  /**
   * Test method for {@link Vulture#eat()}.
   */
  @Test
  public void testEat_Second_Time() {
    //Arrange
    Vulture vult = new Vulture();
    //Act
    vult.eat();
    boolean result = vult.eat();
    //Assert
    assertFalse(result);
  }

  /**
   * Test method for {@link Vulture#eat()}.
   */
  @Test
  public void testEat_After_Fight() {
    //Arrange
    Vulture vult = new Vulture();
    //Act
    vult.eat();
    vult.fight("%");
    boolean result = vult.eat();
    //Assert
    assertTrue(result);
  }

  /* Tested in Bird test
   *
   * Test method for {@link Vulture#fight(java.lang.String)}.
   *
  @Test
  public void testFight() {  }
  */

  /**
   * Test method for {@link Vulture#getColor()}.
   */
  @Test
  public void testGetColor() {
    //Arrange
    Vulture vult = new Vulture();
    //Act
    Color result = vult.getColor();
    //Assert
    assertEquals(Color.BLACK, result);
  }

  /**
   * Test method for {@link Vulture#getColor()}.
   */
  @Test
  public void testGetColor_After_Move() {
    //Arrange
    Vulture vult = new Vulture();
    //Act
    vult.getMove();
    Color result = vult.getColor();
    //Assert
    assertEquals(Color.BLACK, result);
  }

  /* Tested in Bird test
   * 
   * Test method for {@link Vulture#getMove()}.
   *
  @Test
  public void testGetMove() {
    fail("Not yet implemented");
  }
  */

  /* Tested in Bird test
   * 
   * Test method for {@link Vulture#toString()}.
   *
  @Test
  public void testToString() {
    fail("Not yet implemented");
  }
  */

}
