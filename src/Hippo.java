import java.awt.Color;
import java.util.Random;

/**
 * This critter is a Hippo and is run by CritterMain
 * 
 * @author Justin
 */

public class Hippo extends Critter {

  private int hunger; // Keeps track of how hungry the Hippo is
  private Color color; // Keeps track of the Hippos color
  private Direction[] direction = // Contains the Directions the Hippo can travel
      {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

  /**
   * Hippos will eat as much as their hunger will allow. When their hunger reaches 0 they will no
   * longer eat.
   * 
   * @param hunger how many times the Hippo will eat.
   */
  public Hippo(int hunger) {
    this.hunger = hunger;
    // If the Hippo is hungry make it gray
    // If the Hippo isn't hungry make it white
    this.color = hunger > 0 ? Color.GRAY : Color.WHITE;
  }

  /**
   * Determines if the Hippo is hungry or not. If hunger is greater than 0 the Hippo will keep
   * eating. Once the Hippo is full it will turn White.
   * 
   * @return Returns if the Hippo is hungry or not.
   */
  public boolean eat() {
    if (hunger > 0) {
      hunger--; // Each time the Hippo eats remove 1 from it's hunger
      if (hunger == 0) { // The Hippo isn't hungry anymore
        this.color = Color.WHITE; // Full Hippos turn white
      }
      return true;
    }
    return false;
  }

  /**
   * Determines how the Hippo will attack it's opponent.
   * 
   * @param opponent The opponent the Hippo has encountered.
   * @return Returns the type of attack the Hippo will use.
   */
  public Attack fight(String opponent) {
    // If hungry scratch, otherwise Pounce
    return (hunger > 0) ? Attack.SCRATCH : Attack.POUNCE;
  }

  /**
   * Returns the current color of the Hippo.
   * 
   * @return Hippos are White if full and gray if hungry.
   */
  public Color getColor() {
    return color;
  }

  /**
   * Gets the Hippos next move direction.
   * 
   * @return Hippos will randomly move in a direction
   */
  public Direction getMove() {
    Random r = new Random();
    // Returns a direction at a random index between 0 and 3
    return direction[r.nextInt(3)];
  }

  /**
   * Returns the String used to display the Hippo
   * 
   * @return Hippos are displayed as their hunger level 0-9
   */
  @Override
  public String toString() {
    return hunger + "";
  }
}
