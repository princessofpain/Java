package main.Mockito;

public class Profession {
	private int start;
	private int end;
	private String employer;
	private String jobTitle;
	
	public Profession(String jobTitle, String employer, int start) {
		this.jobTitle = jobTitle;
		this.employer = employer;
		this.start = start;
	}
	
	public Profession(String jobTitle, String employer, int start, int end) {
		this.jobTitle = jobTitle;
		this.employer = employer;
		this.start = start;
		this.end = end;
	}
	
	int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getEmployer() {
		return employer;
	}

	public String getJobTitle() {
		return jobTitle;
	}
}
