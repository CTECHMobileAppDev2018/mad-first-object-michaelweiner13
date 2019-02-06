public class StartGame {

  public static void main(String[] args) {

    // *******************
    // ******Players******
    // *******************
    
    // Create an array called 'playerArray' that will store references to Player Objects
    Player[] playerArray = new Player[5];
    
    Player player0 = new Player(); // Create a player for Mr. B
    player0.setName("Mr. Bartucz"); // Set the name for player0
    playerArray[0] = player0; // Set the first reference in playerArray to player0 (a.k.a. "Mr. Bartucz")

    Player player1 = new Player(); // Create a player for Michael
    player1.setName("Michael"); // Set the name for player1
    playerArray[1] = player1; // Set the first reference in playerArray to player1 (a.k.a. "Michael")
    
    // Create a for-loop to loop through each reference stored in playerArray
    for (int i = 0; i < playerArray.length; i++) {
      if (playerArray[i] != null) { // Check to make sure that the current reference being looked at in 'playerArray' is not empty
       System.out.println("Player " + i + " is: " + playerArray[i].getName()); // Print the name of the player stored in the current reference
       System.out.println("" + playerArray[i].getName() + " has " + playerArray[i].getHealth() + " health."); // Printt the health fo the player in the current reference
       System.out.println(); // Print a blank line for formatting
      }
    }


    // *******************
    // ******Weapons******
    // *******************
    
    // Create a new weapon object for a new weapon called "Gun"
    Weapon gun = new Weapon();
    gun.setName ("Gun"); // Set the name of the new weapon to the Gun

    // Calls 'weaponAdded()' to inform the players of the game that a weapon has been added and what its damageDealt to other players is
    gun.weaponAdded();
    
    
    // ************************
    // ******Game Actions******
    // ************************
    
    // Calls 'damagePlayer()' to deal damage to the players when they are injured by the weapon
    gun.damagePlayer(player1);
    
    // Calls 'setDamageDealt' to the gun Weapon object to change the damage value it deals to players
    gun.setDamageDealt(70);

    // Calls 'damagePlayer()' to deal damage to the players when they are injured by the weapon
    gun.damagePlayer(player0);
    gun.damagePlayer(player1);  
  }
}
