package OurGenericClass;

public class Main {

	public static void main(String[] args) {

		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		
		System.out.println(adelaideCrows.numPlayers() + "\n");
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		baseballTeam.addPlayer(pat);
		
		System.out.println();//For space
		
		//After video time-stamp 17:20
//		Team<String> brokenTeam = new Team<>("this won't work");
//		brokenTeam.addPlayer("no-one");
		
		Team<SoccerPlayer> soccerTeam = new Team<>("Some Soccer Team Name");
		soccerTeam.addPlayer(beckham);
		
		System.out.println();//For space
		
		//Code below was simply used to display how the method matchResult() works
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Gordon");
		melbourne.addPlayer(banks);
		
		System.out.println();//For space
		
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		
		adelaideCrows.matchResult(fremantle, 2, 1);
//		adelaideCrows.matchResult(baseballTeam, 1, 1);
		
		System.out.println();//For space
		
		System.out.println("Rankings:");
		System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
		System.out.println(melbourne.getName() + ": " + melbourne.ranking());
		System.out.println(fremantle.getName() + ": " + fremantle.ranking());
		System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
		
		System.out.println();//For space
		
		System.out.println(adelaideCrows.compareTo(melbourne));
		System.out.println(adelaideCrows.compareTo(hawthorn));
		System.out.println(hawthorn.compareTo(adelaideCrows));
		System.out.println(melbourne.compareTo(fremantle));
		
		//	GENERICS CHALLENGE CODE BELOW
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");//Notice how we pass in 'Team<FootballPlayer>' into 'League<>' as the type, since we ONLY want TEAM objects related to FOOTBALLPLAYER
		footballLeague.add(adelaideCrows);
		footballLeague.add(melbourne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);
		
//		footballLeague.add(baseballTeam);//This of course, ISN'T allowed as 'baseballTeam' isn't of the same type 'footballPlayer'
		
		System.out.println();//For space
		
		footballLeague.showLeagueTable();
		
	}//end Main

}//end Class
