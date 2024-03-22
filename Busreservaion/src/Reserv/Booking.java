package Reserv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String PassengerName;
	int BusNo;
	Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Passenger Name :");
		PassengerName =scanner.nextLine();
		System.out.println("Enter Bus No :");
		BusNo =scanner.nextInt();
		System.out.println("Enter Date dd-mm-yyyy:");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==BusNo ) {
				capacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.BusNo == BusNo && b.date.equals(date)) {
				booked++;
			}
				
		}
		 return booked<capacity ? true:false;
	}
}
