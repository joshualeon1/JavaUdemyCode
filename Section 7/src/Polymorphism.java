//	06.02.2021
//	Polymorphism Video

class Movie {

	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here.";
	}

	public String getName() {
		return name;
	}

}

class Jaws extends Movie {
	
	public Jaws() {
		super("Jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lots of people.";
	}

}

class IndependenceDay extends Movie {
	
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet Earth.";
	}

}

class MazeRunner extends Movie {
	
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze.";
	}
	
}

class StarWars extends Movie {
	
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the universe.";
	}
	
}

class Forgetable extends Movie {
	
	public Forgetable() {
		super("Forgetable");
	}
	
	//No plot method
	
}

public class Polymorphism {

	public static void main(String[] args) {

		//Outputs 11 times, lets user know what number was generated, then, follow the code and I'm sure you could put one and one together to figure out how it works.
		//Probably reread the code a few times to get keep in mind for future use
		for(int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}

	}//end main
	
	public static Movie randomMovie() {
		
		int randomNumber = (int)(Math.random() * 5) +1;//We cast as int because 'Math.random()' generates a number of type double, also, 'Math.random() * 5' returns a number betwen 0-4 so we do '+1' to make it 1-5
		System.out.println("Random number generated was: " + randomNumber);
		switch(randomNumber) {
		case 1:
			return new Jaws();						//A break isn't need as we have a return here, using 'break' would be redundant.
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		}
		
		return null;
		
	}//end randomMovie()

}//end class
