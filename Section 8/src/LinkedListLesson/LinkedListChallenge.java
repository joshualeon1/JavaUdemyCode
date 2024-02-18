package LinkedListLesson;
//	07.22.2021

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Song{
	
	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + " | Duration: " + duration;
	}
	
}//end Song

class Album{
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String title) {
		for(Song checkedSong: this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber-1;
		if((index >= 0) && (index <= this.songs.size())) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album.");
		return false;
	}
	
}//end album

public class LinkedListChallenge {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		
		Album album = new Album("Stormbringer", "Deep Purple");//Instantiating the 'album' (takes in the Album's name as the first parameter, and the Band's name that created the album as the second parameter)
		//Album 1 (which, in the 'album' arraylist, would be at index 0 | basically, everything following this, will be stored in a single object of type 'album' at album arraylist index 0)
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You can't do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gypsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		albums.add(album);
		
		//Album 2 (at 'album' arraylist index 1)
		album = new Album("For those about to rock", "AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		//the number withing '.get()' below, refers to a specific 'album' object, we've only created two above, so the only options are '0' and '1'
		albums.get(0).addToPlayList("You can't do it right", playList);
		albums.get(0).addToPlayList("Holy man", playList);
		albums.get(0).addToPlayList("Speed king", playList);//DNE
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(8, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList);//DNE
		
		play(playList);

	}//end main
	
	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist.");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Playlist complete.");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the start of the list.");
					}
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We have reached the end of the list.");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					}else if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;
			}
		}
	}//end play
	
	private static void printMenu() {
		System.out.println("Available actions:\nPress");
		System.out.println("0 - To quit");
		System.out.println("1 - To play next song");
		System.out.println("2 - To play previous song");
		System.out.println("3 - To replay the current song");
		System.out.println("4 - List songs in the playlist");
		System.out.println("5 - Print available actions");
		System.out.println("6 - Delete current song from playlist");
	}//end printMenu
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("=================================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=================================");
	}//end printList

}//end class
