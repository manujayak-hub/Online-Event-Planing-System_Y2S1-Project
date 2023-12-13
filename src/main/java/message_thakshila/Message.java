package message_thakshila;

public class Message {
	private int messageid;
	private String customername;
	private String customeremail;
	private String messagedescription;
	int eventid;
	
	
	public Message(int messageid, String customername, String customeremail, String messagedescription, int eventid) {
		super();
		this.messageid = messageid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.messagedescription = messagedescription;
		this.eventid = eventid;
	}


	public int getMessageid() {
		return messageid;
	}


	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public String getCustomeremail() {
		return customeremail;
	}


	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}


	public String getMessagedescription() {
		return messagedescription;
	}


	public void setMessagedescription(String messagedescription) {
		this.messagedescription = messagedescription;
	}


	public int getEventid() {
		return eventid;
	}


	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	
	
	
	


	
	
	
	
	


	


}
