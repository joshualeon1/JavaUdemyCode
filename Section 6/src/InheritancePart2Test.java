//	05.05.2021

public class InheritancePart2Test {

	public static void main(String[] args) {

		DodgeChallenger dodgeChallenger = new DodgeChallenger(36);
		dodgeChallenger.steer(45);
		System.out.println("------------------------------------------------");
		dodgeChallenger.accelerate(30);
		System.out.println("------------------------------------------------");
		dodgeChallenger.accelerate(20);
		System.out.println("------------------------------------------------");
		dodgeChallenger.accelerate(-42);

	}//end main

}//end class
