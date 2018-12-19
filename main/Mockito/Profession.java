package main.Mockito;

public class Profession {
	private int start;
	private int end;
	private String employer;
	private String jobTitle;
	
	void setStart(int start) {
		this.start = start;
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

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
