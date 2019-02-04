public class StartGame {
  
  public static void main(String[] args) {
   
    // *******************
    // ******Players******
    // *******************
    // Create a player for Mr. B
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    
    // Print out player1's name using getName()
    System.out.println("Player1 name is: " + player1.getName());
    
    //Print out player1's health using getHealth()
    System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
    
    // Create a player for Michael
    Player player2 = new Player();
    player2.setName("Michael");
    
    // Print out player1's name using getName()
    System.out.println("Player2 name is: " + player2.getName());
    
    //Print out player2's health using getHealth()
    System.out.println(player2.getName() + "'s health is: " + player2.getHealth());
   
    
    // *******************
    // ******Weapons******
    // *******************
    // Create a new weapon object for a new weapon called "Gun"
    Weapon gun = new Weapon();
    gun.setName ("Gun"); // Set the name of the new weapon to the Gun
    
    // Print out the details of the gun to the user using getName() and getDamageDealt()
    System.out.println("The weapon: " + gun.getName() + " has been addded to the game. It does " + gun.getDamageDealt() + " damage to player's health.");
    
    
    // *******************
    // ******Actions******
    // *******************
    
  }  
}
