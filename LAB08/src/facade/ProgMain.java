package facade;

public class ProgMain {

	public static void main(String[] args) {
		
		//the person would do these tasks on his own
//		Airline company=new Airline("CTS flights");
//		Flight toGo= company.flightBooking("Bucharest", "Cluj");
//		Flight back= company.flightBooking("Cluj", "Bucharest");
//		Hotel hotel=new Hotel("CTS Hotel");
//		hotel.roomBooking("Cluj");
		
		//Facade
		Facade.reservation("Bucharest", "Cluj");
		


	}

}
