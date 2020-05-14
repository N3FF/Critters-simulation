import java.awt.Color;
import java.util.Random;

/**
 * This critter is a Husky and is run by CritterMain
 * 
 * @author Justin
 */

public class Husky extends Critter {

  private Direction[] direction = // Contains the possible directions the Husky could move
      {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
  private int mateTime = 0; // Determine how long the Hippos should stay together before leaving
  private static final int MAX_MATE_TIME = 1; // The maximum amount of time the Huskies can stay
                                              // together
  private boolean hungry = true; // Huskies start out hungry

  /**
   * Lets you know if the Husky is hungry or not
   * 
   * @return Huskies alternate between hungry and not hungry
   */
  public boolean eat() {
    hungry = hungry ? false : true;
    return hungry;
  }

  /**
   * Huskies are awesome and will fight as needed
   * 
   * @param Opponent the Husky has encountered.
   * @return Returns the attack needed based on the Husky's opponent.
   */
  public Attack fight(String opponent) {
    switch (opponent) {
      case "%":
        return Attack.ROAR; // If the opponent is an Ant Roar
      case "0":
      case "^":
      case ">":
      case "V":
      case "<":
        return Attack.SCRATCH; // If the opponent is a Full hippo or a Bird Scratch
      default:
        return Attack.POUNCE; // If it's something else than Pounce
    }
  }

  /**
   * Gets the color of the Husky
   * 
   * @return Huskies are Purple of course!
   */
  public Color getColor() {
    Color purple = new Color(128, 0, 128); // Create the color purple
    return purple;
  }

  /**
   * Huskies are smart and try and run from Hippos. When there are no Hippos nearby the Huskies will
   * try and mate.
   * 
   * @return Returns the direction the Husky will move.
   */
  public Direction getMove() {
    // Used to make Huskies move randomly
    Random rand = new Random();
    // Gets the String value of the characters to the N S E W
    String north = this.getNeighbor(Direction.NORTH);
    String south = this.getNeighbor(Direction.SOUTH);
    String east = this.getNeighbor(Direction.EAST);
    String west = this.getNeighbor(Direction.WEST);

    // Try and parse the string to an int. If it parses it's a hippo
    int intN = tryParseInt(north);
    int intS = tryParseInt(south);
    int intE = tryParseInt(east);
    int intW = tryParseInt(west);

    // This if determines if the Husky is surrounded by enemies
    if (north != " " && north != "." && north != "H" && south != " " && south != "." && south != "H"
        && east != " " && east != "." && east != "H" && west != " " && west != "." && west != "H") {
      // If surrounded just run somewhere
      return direction[rand.nextInt(3)];
    } else if (intN > 0) {
      // If there is a hungry Hippo to the N S E or W run in the opposite direction
      return Direction.SOUTH;
    } else if (intS > 0) {
      return Direction.NORTH;
    } else if (intE > 0) {
      return Direction.WEST;
    } else if (intW > 0) {
      return Direction.EAST;
    } else if (north == "H" && mateTime < MAX_MATE_TIME) {
      // If there is a Husky to the N S E or W and it hasn't mated in it's last move
      // then it will move towards that Husky to try and mate
      mateTime++;
      return Direction.NORTH;
    } else if (south == "H" && mateTime < MAX_MATE_TIME) {
      mateTime++;
      return Direction.SOUTH;
    } else if (east == "H" && mateTime < MAX_MATE_TIME) {
      mateTime++;
      return Direction.EAST;
    } else if (west == "H" && mateTime < MAX_MATE_TIME) {
      mateTime++;
      return Direction.WEST;
    } else {
      // If there is nothing nearby then look for a mate and move randomly
      mateTime = 0;
      return direction[rand.nextInt(3)];
    }
  }

  /**
   * Returns the String used to display the Husky
   * 
   * @return Hippos are displayed as an "H"
   */
  @Override
  public String toString() {
    return "H";
  }

  /**
   * Tries to turn the string into an integer
   * 
   * @param string takes in a string
   * @return Returns the integer if it can or -1 if it can't
   */
  private int tryParseInt(String string) {
    try {
      return Integer.parseInt(string);
    } catch (NumberFormatException e) {
      return -1;
    }
  }
}
