import java.awt.Color;

/**
 * This critter is a Vulture and is run by CritterMain
 * 
 * @author Justin
 *
 */

public class Vulture extends Bird {

  private boolean hungry = true; // Vultures start off hungry

  /**
   * Determines if the Vulture is hungry or not
   * 
   * @return Vultures will only eat after fighting
   */
  public boolean eat() {
    if (hungry) {
      hungry = false;
      return true;
    }
    return false;
  }

  /**
   * Determines the type of attack the Vulture will be returning to it's Opponent. Once a Vulture
   * gets in a fight it will get hungry.
   * 
   * @param opponent attacking this Vulture
   * @return Vultures Roar at Ants and Pounce on everything else just like birds.
   */
  public Attack fight(String opponent) {
    hungry = true;
    return super.fight(opponent); // Uses the Birds attack method
  }

  /**
   * Tells you what color the Vulture is
   * 
   * @return Vulture are Black
   */
  public Color getColor() {
    return Color.BLACK;
  }

  /**
   * Vultures fly in a circle moving going NNN EEE SSS WWW
   * 
   * @return the direction the Vulture will move.
   */
  public Direction getMove() {
    return super.getMove(); // Uses the Bird's move style
  }

  /**
   * Depending on the direction that the Vulture is flying, the Vulture's display will change.
   * 
   * @return the string used for to display the Vulture.
   */
  @Override
  public String toString() {
    return super.toString(); // Uses the same display as a Bird
  }

}
