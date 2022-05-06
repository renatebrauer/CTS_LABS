package facade;

public class Flight {
	
	private String initalLocation;
	private String destination;
	Airline airline;
	
	public Flight(String initalLocation, String destination, Airline airline) {
		this.initalLocation=initalLocation;
		this.destination=destination;
		this.airline=airline;
	}

	public String getInitalLocation() {
		return initalLocation;
	}

	public void setInitalLocation(String initalLocation) {
		this.initalLocation = initalLocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [initalLocation=" + initalLocation + ", destination=" + destination + ", airline=" + airline
				+ "]";
	}

	
	
}
