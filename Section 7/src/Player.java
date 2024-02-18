//	05.31.2021
//	Encapsulation video, this class is the 'non-encapsulation' example

public class Player {

	public String fullName;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if(this.health <= 0) {
			System.out.println("Player knocked out.");
			//Reduce number of lives remaining for the player
		}
	}
	
	public int healthRemaining() {
		return this.health;
	}
	
}//end class
