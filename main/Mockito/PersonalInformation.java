package main.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import main.Mockito.Domicile.Domicile;

public class PersonalInformation {
	private Person person;
	private Family family; 
	private ArrayList<Education> education = new ArrayList<Education>();
	private ArrayList<Profession> profession = new ArrayList<Profession>();
	private Domicile domicile;
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Family getFamily() {
		return family;
	}
	
	public void setFamily(Family family) {
		this.family = family;
	}
	
	public ArrayList<Education> getEducation() {
		return education;
	}
	
	public void addEducation(Education... education) {
		this.education.addAll(Arrays.asList(education));
	}
	
	public ArrayList<Profession> getProfession() {
		return profession;
	}
	
	public void addProfession(Profession... profession) {
		this.profession.addAll(Arrays.asList(profession));
	}

	public Domicile getDomicile() {
		return domicile;
	}

	public void setDomicile(Domicile domicile) {
		this.domicile = domicile;
	}
}
