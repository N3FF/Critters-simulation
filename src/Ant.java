import java.awt.Color;

/**
 * This critter is an Ant and is run by CritterMain
 * 
 * @author Justin
 *
 */
public class Ant extends Critter {

  private boolean walkSouth; // Determines if it's a south or north moving ant
  private int move = -1; // Makes the Ant's first move N or S. If 0 it move east first.

  /**
   * @param walkSouth True if the ant moves South, False if North.
   */
  public Ant(boolean walkSouth) {
    this.walkSouth = walkSouth;
  }

  /**
   * Tells you if the Ant is hungry or not.
   * 
   * @return Ants always eat
   */
  public boolean eat() {
    return true; // Returns true since Ants are always hungry
  }

  /**
   * Determines what type of attack to use on it's opponent.
   * 
   * @param opponent attacking this Ant
   * @return Ants always attack with a scratch
   */
  public Attack fight(String opponent) {
    return Attack.SCRATCH; // Ants will scratch their opponents
  }

  /**
   * Tells you what color the Ant is
   * 
   * @return Ants are Red
   */
  public Color getColor() {
    return Color.RED;
  }

  /**
   * Ants alternate between moving South and East if it's a South walking ant. Ants alternate
   * between moving North and East if it's a North walking ant
   * 
   * @return The direction the ant is moving.
   */
  public Direction getMove() {
    move = (move + 1) % 2; // Causes move to alternate between 0 and 1
    if (move == 0) { // Moves South if it's a South ant or North if it's a North ant
      return walkSouth ? Direction.SOUTH : Direction.NORTH;
    } else { // If it's not moving North or South the ant is moving East
      return Direction.EAST;
    }
  }

  /**
   * Returns the String used to display the Ant in the critter display
   * 
   * @return Ants are "%"
   */
  @Override
  public String toString() {
    return "%";
  }
}
