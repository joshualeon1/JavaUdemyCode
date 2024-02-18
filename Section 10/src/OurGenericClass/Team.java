package OurGenericClass;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

	private String name;//Team's name
	int played = 0;//To keep track of number of matches played
	int won = 0;//To keep track of wins
	int lost = 0;//To keep track of losses
	int tied = 0;//To keep track of ties
	
	private ArrayList<T> members = new ArrayList<>();//ArrayList to hold players
	
	//Constructor for team
	public Team(String name) {
		this.name = name;
	}
	
	//The Getter method
	public String getName() {
		return name;
	}
	
	//If the 'player' object already exists within the 'Team' ArrayList, it won't be added and returns false, otherwise, they'll be added and returns true.
	//Since we're passing an UNKNOWN non-generic type as an argument 'T', we have to cast here on line 29 and on line 33 (recall our UdemyGenerics class)
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already on the team.");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + name);
			return true;
		}
	}
	
	//Returns the number of players in the Team(ArrayList)
	public int numPlayers() {
		return members.size();
	}
	
	//Saves our results and the opponents results (it saves the opponents results between lines 48-50)
	public void matchResult(Team<T> opponent, int ourScore , int theirScore) {
		
		String message ;
		
		if(ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if(ourScore == theirScore) {
			tied++;
			message = " drew with ";
		} else {
			lost++;
			message = " lost to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}
	}
	
	//Returns some ranking
	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking())
			return -1;//returns this if the first team ranked higher than the team passed as an argument
		else if(this.ranking() < team.ranking())
			return 1;//returns this if the first team ranked lower than the team passed as an argument
		return 0;//returns this if the both teams ranked the same
	}
	
}//end Team
