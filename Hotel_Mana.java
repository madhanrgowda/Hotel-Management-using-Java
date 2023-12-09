package cal;

import java.util.ArrayList;
import java.util.Scanner;


class Reservation
{
	private String guestName;
	private int roomNumbers;
	private int numberOfNights;
	
	
	
	public Reservation(String guestName2, int roomNumbers2, int numberOfNights2) {
		// TODO Auto-generated constructor stub
		this.guestName=guestName;
		this.numberOfNights=numberOfNights;
		this.roomNumbers=roomNumbers;
	}

	public String getGuestName() {
		return guestName;
	}

	public int getRoomNumbers() {
		return roomNumbers;
	}
	
	public int getNumberOfNights() {
		return numberOfNights;
	}
	
	
	
	@Override
	public String toString() {
		return "Reservation [guestName=" + guestName + ", roomNumbers=" + roomNumbers + ", numberOfNights="
				+ numberOfNights + "]";
	}
	
	
}


		

