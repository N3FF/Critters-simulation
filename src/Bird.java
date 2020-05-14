import java.awt.Color;

/**
 * This critter is an Bird and is run by CritterMain.
 * 
 * @author Justin
 */
public class Bird extends Critter {

  private int move = 0; // The position in the direction array
  private int step = 0; // How many steps have been taken in each direction
  private boolean firstMove = true; // Checks if this is the first time the bird has moved
  private Direction[] direction = // Holds the movement pattern of the bird
      {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

  /**
   * Determines the type of attack the Bird will be returning to it's Opponent.
   * 
   * @param opponent attacking this Bird
   * @return Birds Roar at Ants and Pounce on everything else.
   */
  public Attack fight(String opponent) {

    if (opponent == "%") { // If oppenent = Ant Roar
      return Attack.ROAR;
    }
    return Attack.POUNCE; // Else Pounce
  }

  /**
   * Tells you what color the Ant is
   * 
   * @return Birds are Blue
   */
  public Color getColor() {
    return Color.BLUE;
  }

  /**
   * Birds fly in a circle moving going NNN EEE SSS WWW
   * 
   * @return the direction the Bird will move.
   */
  public Direction getMove() {

    if (!firstMove) { // Starts the bird off looking north
      step = (step + 1) % 3; // Every cycles through 3 steps
      if (step == 0) { // On the first step of each cycle change direction
        move = (move + 1) % 4; // Cycles through N E S W
      }
    } else {
      firstMove = false;
    }
    // Uses "move" as the index of the array to determine the direction
    return direction[move];
  }

  /**
   * Depending on the direction that the bird is flying, the Bird's display will change.
   * 
   * @return the string used for to display the Bird.
   */
  @Override
  public String toString() {
    switch (direction[move]) {
      case NORTH:
        return "^";
      case SOUTH:
        return "V";
      case EAST:
        return ">";
      case WEST:
        return "<";
      default:
        break;
    }
    return "ERROR"; // If for some crazy reason the switch statement fails
  }
}
