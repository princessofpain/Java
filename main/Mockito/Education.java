package main.Mockito;

public class Education {

	private DegreeType degree;
	private double finalGrade;
	private String institution;
	private int start;
	private int end;
	
	public Education(DegreeType degree, double finalGrade, String institution, int start, int end) {
		this.degree = degree;
		this.finalGrade = finalGrade;
		this.institution = institution;
		this.start = start;
		this.end = end;
	}
	
	void setDegree(DegreeType degree) {
		this.degree = degree;
	}
	
	public DegreeType getDegree() {
		return degree;
	}
	
	void setFinalGrad(double finalGrade) {
		this.finalGrade = finalGrade;
	}
	
	double getFinalGrade() {
		return finalGrade;
	}
	
	void setInstitution(String institution) {
		this.institution = institution;
	}
	
	String getInstitution() {
		return institution;
	}
	
	void setStart(int start) {
		this.start = start;
	}
	
	int getStart() {
		return start;
	}
	
	void setEnd(int end) {
		this.end = end;
	}
	
	int getEnd() {
		return end;
	}
}
