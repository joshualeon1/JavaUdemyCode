package LinkedListLesson;
//	07.21.2021

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        
        visit(placesToVisit);
        
		/*placesToVisit.add("Sydney");		//index 0
		placesToVisit.add("Melbourne");		//index 1
		placesToVisit.add("Brisbane");		//index 2
		placesToVisit.add("Perth");			//index 3
		placesToVisit.add("Canberra");		//index 4
		placesToVisit.add("Adelaide");		//index 5
		placesToVisit.add("Darwin");		//index 6
		
		printList(placesToVisit);
		
		//inserting
		placesToVisit.add(1, "Alice Springs");	//will be inserted at index 1 and all elements, starting AT INDEX 1 will be moved, one more index higher
		printList(placesToVisit);
		
		//removing an element
		placesToVisit.remove(4);				//removing what is at index 4 (which is the location 'Perth' )
		printList(placesToVisit);*/

	}//end main
	
	/* --->	IMPORTANT NOTE: Concerning 'Iterator' AND 'ListIterator' a major difference is that 'Iterator' can ONLY traverse in a list FORWARD, while 'ListIterator' has more functionality as it is able to
	 * --->	traverse FORWARD AND BACKWARDS																																									*/
	
	
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i= linkedList.iterator();			//We're using an 'iterator' which is also a part of LinkedList (still have to import it, no problem)
		while(i.hasNext()) {								//while an element in the linkedList is pointing to something else, we show the current record
			System.out.println("Now visiting " + i.next());	//here, 'i.next()' is to say, equivalent to 'i++' and changes 'i' value
		}
		System.out.println("======================================");
	}//end printList
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();//a different iterator, think of the previous as used in place of for loops, this is for when adding elements/items before and/or after an index
		//NOTE: the 'stringListIterator' isn't automatically pointing at any element in the linkedList yet, it only starts looking at the first element on line 64 when we use the '.next()'
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);//if this line sets 'comparison' to 0, it means that what we're comparing it to is EQUAL to what is at the current index we're viewing, if it is
																	// instead set to any num > 0, it means it's value is greater than what we're current viewing ex.(A > B), lastly, if 'comparison' < 0, then you get it
			if(comparison == 0) {
				//means they're equal, do not add
				System.out.println(newCity + " is already included as a destination.");
				return false;
			} else if(comparison > 0) {
				//newCity should appear before this one
				//Brisbane (element being compared to) -> Adelaide (element we're trying to add for example)	(alphabetical)
				stringListIterator.previous();	//as the '.next()' was previously used, and now, alphabetically, we want to go back and insert 'Adelaide' BEFORE 'Brisbane' we use: '.previous()'
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0) {
				//move on to next city (meaning you don't need to add anything AND once we find the place it should be added to ALPHABETICALLY, it will be added on line 80)
			}
		}
		stringListIterator.add(newCity);
		return true;
	}//end addInOrder
	
	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No cities in the itenerary.");
		}else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();//clear input line
			switch(action) {
			case 0:
				System.out.println("Holiday (Vacation) over.");
				quit = true;
				break;
			case 1:
				if(!goingForward) {					//It would be better to rewatch LinkedList Part 3 as a refresher, but basically, lines 100 - 105 make the listIterator go ahead and point towards the next element
					if(listIterator.hasNext()) {	//rahter than the current one as we are going forward in this part of the menu. As to avoid unwanted repeated output.
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next());
				}else {
					System.out.println("Reach the end of the list.");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous());
				}else {
					System.out.println("We are at the start of the list.");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}
	}//end visit
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - To quit");
		System.out.println("1 - Go to next city");
		System.out.println("2 - Go to previous city");
		System.out.println("3 - Print Menu Options");
	}

}//end class
