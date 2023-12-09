package cal;

import java.util.ArrayList;
import java.util.Scanner;


public class DemoProject {
	
	private ArrayList<Reservation> reservations=new ArrayList<>();
    public void addReservation(String guestName,int roomNumbers,int numberOfNights)
    {
    	Reservation reservation = new Reservation(guestName,roomNumbers,numberOfNights);
    	reservations.add(reservation);
    	System.out.println("reservation  added successfully");
    }
    public void viewResveration()
    {
    	if(reservations.isEmpty())
    	{
	    	System.out.println("no reservation found !!!!!!");

    	}
    	else
    	{
	    	System.out.println("list of reservation");
	    	for(Reservation toString:reservations)
	    	{
		    	System.out.println(toString);
	    	}

    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProject d= new DemoProject();
		Scanner scanner =new Scanner(System.in);
		
		while(true)
		{
	    	System.out.println("################## Welcome to TAJ HOTEL ###################");
	    	System.out.println("********************* Hotel Reservation System Menu ****************************");
	    	System.out.println("Click 1 to add Reservation ");
	    	System.out.println("Click 2 to  View Reservation ");
	    	System.out.println("Click 3 to Exit ");
	    	System.out.println("Enter your choice");
	    	
	    	int choice=scanner.nextInt();
	    	switch (choice) {
			case 1: 
		    	System.out.println("Enter the Guest Name");
		    	String guestName=scanner.next();
		    	System.out.println("Enter the Room Number");
		    	int roomNumbers=scanner.nextInt();
		    	System.out.println("Enter the Number of Nights ");
		    	int numberOfNights=scanner.nextInt();
		    	d.addReservation(guestName, roomNumbers, numberOfNights);
		    	break;
		    	
		    case 2:
		    	d.viewResveration();
		    	break;
		    		
		    case 3:
		    	System.out.println("Thank you");
			    scanner.close();
			    System.exit(0);

			
			default:
				System.out.println("invalid choice , plz check");
				break;
		    
			}
	    	}
	    	

	}

	    	
}

//	private void viewResveration() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void addReservation(String guestName, int roomNumbers, int numberOfNights) {
//		// TODO Auto-generated method stub
//		
//	}


