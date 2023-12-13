
package budget_Sahan;

public class budget {
	
	int budgetid;
	int eventid;
	double venuecost;
	double guestcost;
	double entertainmentcost;
	double photographycost;
	double totalcost;
	public budget(int budgetid, int eventid, double venuecost, double guestcost, double entertainmentcost,
			double photographycost, double totalcost) {
		
		
		this.budgetid = budgetid;
		this.eventid = eventid;
		this.venuecost = venuecost;
		this.guestcost = guestcost;
		this.entertainmentcost = entertainmentcost;
		this.photographycost = photographycost;
		this.totalcost = totalcost;
	}
	public int getBudgetid() {
		return budgetid;
	}
	public void setBudgetid(int budgetid) {
		this.budgetid = budgetid;
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public double getVenuecost() {
		return venuecost;
	}
	public void setVenuecost(double venuecost) {
		this.venuecost = venuecost;
	}
	public double getGuestcost() {
		return guestcost;
	}
	public void setGuestcost(double guestcost) {
		this.guestcost = guestcost;
	}
	public double getEntertainmentcost() {
		return entertainmentcost;
	}
	public void setEntertainmentcost(double entertainmentcost) {
		this.entertainmentcost = entertainmentcost;
	}
	public double getPhotographycost() {
		return photographycost;
	}
	public void setPhotographycost(double photographycost) {
		this.photographycost = photographycost;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	
	
	

}
