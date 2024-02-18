package OurGenericClass;

import java.util.ArrayList;
import java.util.Collections;

//Recall that '<T extends Team>' means that ONLY objects related to 'Team'(the class) are allowed to be passed as arguments
public class League<T extends Team>{
	
	private String name;
	private ArrayList<T> league = new ArrayList<T>();//ArrayList of the <T> object that is passed in of course, as they will all be objs of type 'Team' do to the Generics we use
	
	public League(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean add(T team) {
		if(league.contains(team))
			return false;
		league.add(team);
		return true;
	}
	
	public void showLeagueTable() {
		Collections.sort(league);
		System.out.println("League Table:");
		for(T t: league)
			System.out.println(t.getName() + ": " + t.ranking());
	}

}//end League
