package musicalShow_Shehani;

public class show {
	
	private int ideventcreate;
	private String fullname;
	private String email;
	private String address;
	private String location;
	private String bandname;
	private double pricerange;
	private int ticket;
	public show(int ideventcreate, String fullname, String email, String address, String location, String bandname,
			double pricerange, int ticket) {
		super();
		this.ideventcreate = ideventcreate;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.location = location;
		this.bandname = bandname;
		this.pricerange = pricerange;
		this.ticket = ticket;
	}
	public int getIdeventcreate() {
		return ideventcreate;
	}
	public void setIdeventcreate(int ideventcreate) {
		this.ideventcreate = ideventcreate;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBandname() {
		return bandname;
	}
	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	public double getPricerange() {
		return pricerange;
	}
	public void setPricerange(double pricerange) {
		this.pricerange = pricerange;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
	
}
