package ChooseEvent;

public class event {
	
	private int idevent;
	private int cusid;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String eventype;
	private	String eventdate;
	private	String venue;
	private int guests;
	private String theme;
	private double budget;
	private String servicesreuired;
	private String specialRequests;
	private	String odetails;
	
	
	public event(int idevent, int cusid, String firstName, String lastName, String email, String phone, String address,
			String eventype, String eventdate, String venue, int guests, String theme, double budget,
			String servicesreuired, String specialRequests, String odetails) {
		
		this.idevent = idevent;
		this.cusid = cusid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.eventype = eventype;
		this.eventdate = eventdate;
		this.venue = venue;
		this.guests = guests;
		this.theme = theme;
		this.budget = budget;
		this.servicesreuired = servicesreuired;
		this.specialRequests = specialRequests;
		this.odetails = odetails;
	}


	

	public int getIdevent() {
		return idevent;
	}




	public void setIdevent(int idevent) {
		this.idevent = idevent;
	}




	public int getCusid() {
		return cusid;
	}


	public void setCusid(int cusid) {
		this.cusid = cusid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEventype() {
		return eventype;
	}


	public void setEventype(String eventype) {
		this.eventype = eventype;
	}


	public String getEventdate() {
		return eventdate;
	}


	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
	}


	public int getGuests() {
		return guests;
	}


	public void setGuests(int guests) {
		this.guests = guests;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}


	public String getServicesreuired() {
		return servicesreuired;
	}


	public void setServicesreuired(String servicesreuired) {
		this.servicesreuired = servicesreuired;
	}


	public String getSpecialRequests() {
		return specialRequests;
	}


	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}


	public String getOdetails() {
		return odetails;
	}


	public void setOdetails(String odetails) {
		this.odetails = odetails;
	}
	
	
	
	
	
}
