package com.udemy.section12;

import java.util.*;

class Theatre {

	private final String theatreName;
	public List<Seat> seats = new ArrayList<>();

	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows -1);
		for (char row = 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
//		for(Seat seat : seats) {
//			System.out.print(".");
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//
//		if(requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//
//		return requestedSeat.reserve();
	}

	// for testing
	public void getSeats() {
		for(Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

	public class Seat implements Comparable<Seat> {
		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			} else {
				return false;
			}
		}

		public boolean cancel() {
			if(this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNumber + " cancelled.");
				return true;
			} else {
				return false;
			}
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
	}

}//Theatre

public class CollectionsOverview {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("Olympian", 8, 12);
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//		printList(seatCopy);

//		seatCopy.get(1).reserve();
//		if(theatre.reserveSeat("A02")) {
//			System.out.println("Please pay for A02");
//		} else {
//			System.out.println("Seat already reserved.");
//		}
		
//		Collections.shuffle(seatCopy);
//		System.out.println("Printing seatCopy");
//		printList(seatCopy);
//		System.out.println("Printing theatre.seats");
//		printList(theatre.seats);
		
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("Min seat number is: " + minSeat.getSeatNumber());
		System.out.println("Max seat number is: " + maxSeat.getSeatNumber());
		
		sortList(seatCopy);
		System.out.println("Printing sorted seatCopy");
		printList(seatCopy);
		
//		theatre.getSeats();
//		if(theatre.reserveSeat("H11")) {
//			System.out.println("Please pay.");
//		} else {
//			System.out.println("Sorry, seat is taken.");
//		}
//		if(theatre.reserveSeat("H11")) {
//			System.out.println("Please pay.");
//		} else {
//			System.out.println("Sorry, seat is taken.");
//		}

	}//Main
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("===========================================================================");
	}
	
	public static void sortList(List<? extends Theatre.Seat> list) {
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}

}//Class
