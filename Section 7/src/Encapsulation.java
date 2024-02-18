//	05.31.2021

public class Encapsulation {

	public static void main(String[] args) {

		/*
		Player player = new Player();

		//We don't have a default Constructor, so we manually instantiate them here
		player.fullName = "Tim";
		player.health = 20;
		player.weapon = "Sword";

		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());

		damage = 11;
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());
		 */
		
		EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");//If health > 100, validation fails, health is default set to 100
		System.out.println("Initial health is " + player.getHealth());	//Here, we can't access the field variable 'health' directly as we could above

	}//end main

}//end class
