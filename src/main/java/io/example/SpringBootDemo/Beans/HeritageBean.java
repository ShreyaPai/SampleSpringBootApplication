package io.example.SpringBootDemo.Beans;

public class HeritageBean {
	
	private int monumentId;
	private String monumentName;
	private String monumentLocation;
	public int getMonumentId() {
		return monumentId;
	}
	public void setMonumentId(int monumentId) {
		this.monumentId = monumentId;
	}
	public String getMonumentName() {
		return monumentName;
	}
	public void setMonumentName(String monumentName) {
		this.monumentName = monumentName;
	}
	public String getMonumentLocation() {
		return monumentLocation;
	}
	public void setMonumentLocation(String monumentLocation) {
		this.monumentLocation = monumentLocation;
	}
	public HeritageBean(int monumentId, String monumentName, String monumentLocation) {
		super();
		this.monumentId = monumentId;
		this.monumentName = monumentName;
		this.monumentLocation = monumentLocation;
	}
	public HeritageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
