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
      System.out.println("Your weapons damange cannot be less than 1. Your weapon's damage dealt to players is now 1.");
      this.damageDealt = 1;
    } else if (damageDone > 100) {
      System.out.println("Your weapons damange cannot be more than 1. Your weapon's damage dealt to players is now 100.");
      this.damageDealt = 100;
    } else { // If user's new damageDone value passes error checking, set the weapon's damage to the user's value
      this.damageDealt = damageDone;
    }
  }
  
  // Getter method to return what the damage of the weapon is
  public int getDamageDealt() {
    return this.damageDealt;
  }
  
  public void playerShot (Player userPlayer) {
   userPlayer.setHealth( userPlayer.getHealth() - this.damageDealt); 
  }
  
}