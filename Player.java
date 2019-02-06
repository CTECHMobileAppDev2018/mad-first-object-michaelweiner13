// This is an example class for a player in a game
public class Player {

  // Initalize variables for the player's name and health
  // Set the variable to private to make sure the user cannot change the values
  // Values can be changed through setName(), getName(), setHealth(), getHealth()
  private String name;
  private int health;

  // Constructor
  // Called when someone creates a Player object
  Player() {
    this.health = 100;
  }

  // Setter method for the player's name
  public void setName(String playerName) {

    // Make sure the length of the name is longer than 0
    if (playerName.length() < 1) {
      this.name = "invalid";
      return;
    }

    // If the player's new name meets the error checking, change the player's name to the user's input
    this.name = playerName;
  }

  // Getter method for the player's name
  // Returns the player's name
  public String getName() {
    return this.name;
  }

  // Setter method for the player's health
  public void setHealth (int playerHealth) {
    // Checks to make sure the player's health is not trying to be set to anything less than 0
    if (playerHealth <= 0) {
      System.out.println("" + this.getName() + " is now dead. Whata shame...");
      this.health = 0;
    } else if (playerHealth > 100) { // Checks to make sure the player's health is not more than 100
      System.out.println("" + this.getName() + "'s health cannot be more than 100. You're no superhuman." + this.getName() + "'s health is now 100.");
      this.health = 100;
    } else { // Return the user's change to the player's health
      this.health = playerHealth;
    }
  }

  //Getter method for the player's health
  public int getHealth() {
    return this.health;
  }
}
