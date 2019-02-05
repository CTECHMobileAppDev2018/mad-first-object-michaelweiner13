public class Weapon {

  // Initalize 2 private variables to store data about the Weapon
  // Set to private to prevent tampering from the user
  // Values can be set and received through setName(), getName(), setDamageDealt(), and getDamageDealt()
  private String weaponName;
  private int damageDealt;

  // Constructor
  // All weapons will start with 35 health damage
  Weapon() {
    this.damageDealt = 35;
  }

  // Setter method for the name of the weapon
  // Sets the name of the weapon to the user's input if it passes basic error checking
  public void setName(String newWeaponName) {

    // Make sure the length of the new name for the weapon is not blank
    if (newWeaponName.length() < 1) {
      System.out.println("Your weapon's name cannot be blank. Your weapon's name has not been changed.");
      return;
    }

    // If the user's new weapon name meets the error checking, change the weapon name to the user's input
    this.weaponName = newWeaponName;
  }

  // Getter method for the name of the weapon
  // Returns the name of the weapon
  public String getName() {
    return this.weaponName;
  }

  // Setter method for the damage of the weapon
  public void setDamageDealt(int damageDone) {
    if (damageDone < 1) { // Checks to make sure that the user's damange change does at least 1 health damage
      System.out.println("Your weapon's damange cannot be less than 1. Your weapon's damage dealt to players is now 1.");
      this.damageDealt = 1;
    } else if (damageDone > 100) {
      System.out.println("Your weapon's damange cannot be more than 1. Your weapon's damage dealt to players is now 100.");
      this.damageDealt = 100;
    } else { // If user's new damageDone value passes error checking, set the weapon's damage to the user's value
      this.damageDealt = damageDone; 
      System.out.println("The weapon - " + this.getName() + " - now does " + this.getDamageDealt() + " damage to players.");
      System.out.println();
    }
  }

  // Getter method to return what the damage of the weapon is
  public int getDamageDealt() {
    return this.damageDealt;
  }
  
  // Creates a method called 'weaponAdded()'
  // Prints the details of a wepaon and its damage dealt to inform the players in the game
  public void weaponAdded() {
    System.out.println("The weapon - " + this.getName() + " - has been addded to the game. It does " + this.getDamageDealt() + " damage to player's health.");
    System.out.println();
  }

  // Create method called 'damagePlayer'
  // Takes a player as an argument
  // Damages the player's health based the weapon object's 'damageDealt' value
  public void damagePlayer (Player userPlayer) {
    System.out.println("The weapon - " +this.getName() + " - has damaged " + userPlayer.getName() + " for " + this.getDamageDealt() + ".");
    userPlayer.setHealth(userPlayer.getHealth() - this.damageDealt);
    System.out.println("" + userPlayer.getName() + " now has " + userPlayer.getHealth() + " health.");
    System.out.println();
  }
}
