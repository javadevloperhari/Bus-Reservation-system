package Reserv;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {
	public static void main(String[] args) {
		
		
		ArrayList <Bus> buses=new ArrayList<Bus>();
		ArrayList <Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,4));
		buses.add(new Bus(2,false,12));
		buses.add(new Bus(3,true,24));
		buses.add(new Bus(4,true,10));
		buses.add(new Bus(5,false,35));
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		int useropt=1;
		Scanner scanner=new Scanner(System.in);
		
		while(useropt==1) {
			System.out.println("Enter 1 To Book and 2 To Exit.");;
			useropt = scanner.nextInt();
			if(useropt==1) {
				System.out.println("......BOOKING......");
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					
					System.out.println("Your Booking Is Confirmed");
				}
				else {
						System.out.println("Sorry . Bus Is Full. Try another bus or date");
					}
					
			}
			}
	}
}
