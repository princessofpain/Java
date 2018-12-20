package main.Mockito;

public class Family {
	private boolean isMarried;
	private int noOfKids;
	private int noOfSiblings;
	
	public Family(boolean isMarried, int noOfKids, int noOfSiblings) {
		this.isMarried = isMarried;
		this.noOfKids = noOfKids;
		this.noOfSiblings = noOfSiblings;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public int getNoOfKids() {
		return noOfKids;
	}
	
	public void setNoOfKids(int noOfKids) {
		this.noOfKids = noOfKids;
	}
	
	public int getNoOfSiblings() {
		return noOfSiblings;
	}
	
	public void setNoOfSiblings(int noOfSiblings) {
		this.noOfSiblings = noOfSiblings;
	}
}
