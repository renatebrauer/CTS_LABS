package facade;

public class Facade {

	public static void reservation(String initialLocation, String destination) {
		
		//the person would do these tasks on his own
		Airline company=new Airline("CTS flights");
		Flight toGo= company.flightBooking(initialLocation, destination);
		Flight back= company.flightBooking(destination, initialLocation);
		Hotel hotel=new Hotel("CTS Hotel");
		hotel.roomBooking(destination);
	}
	
}
