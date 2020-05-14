import java.awt.Color;

/**
 * This critter is a Butterfly and is run by CritterMain
 * 
 * @author Justin
 */
public class Butterfly extends Critter {

  private int move = -1; // Used to keep track of how many moves have been made

  /**
   * Returns the Color of the Butterfly
   * 
   * @return Butterflies are Yellow
   */
  public Color getColor() {
    return Color.YELLOW;
  }

  /**
   * Gets the direction that the Butterfly will move
   * 
   * @return Butterflies fly N once and then alternate between E and W
   */
  public Direction getMove() {
    move = (move + 1) % 4;
    if (move % 2 == 0) { // Every other move will be North
      return Direction.NORTH;
    }
    // If it's an odd move then if it's 1 it will go west and East if 3
    return (move == 3) ? Direction.EAST : Direction.WEST;
  }

  /**
   * Returns the String used to display the butterfly
   * 
   * @return Butterflies alternate between "x" and "-"
   */
  @Override
  public String toString() {
    return move % 2 == 0 ? "-" : "x";
  }
}
