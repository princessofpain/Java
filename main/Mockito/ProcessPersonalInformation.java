package main.Mockito;

import java.util.ArrayList;

public class ProcessPersonalInformation {

	public static void main(String[] args) {
		ProcessPersonalInformation process = new ProcessPersonalInformation();
		
		Person person1 = new Person("Peter", "Müller", Sex.MALE);		
		Family person1Family = new Family(true, 2, 0);
		Education person1Degree1 = new Education(DegreeType.ASSOCIATE, 3.3, "Los Angeles City College", 1991, 1993);
		PersonalInformation person1Information = new PersonalInformation();
		person1Information.setPerson(person1);
		person1Information.setFamily(person1Family);
		person1Information.addEducation(person1Degree1);
		
		Person person2 = new Person("Heidi", "Krause", Sex.FEMALE);
		Family person2Family = new Family(false, 0, 3);
		Education person2Degree1 = new Education(DegreeType.ASSOCIATE, 2.5, "Boston College", 2002, 2005);
		Education person2Degree2 = new Education(DegreeType.BACHELOR, 2.8, "University Of California", 2005, 2008);
		Education person2Degree3 = new Education(DegreeType.MASTER, 2.0, "University Of California", 2008, 2010);
		PersonalInformation person2Information = new PersonalInformation();
		person2Information.setPerson(person2);
		person2Information.setFamily(person2Family);
		person2Information.addEducation(person2Degree1);
		person2Information.addEducation(person2Degree2);
		person2Information.addEducation(person2Degree3);
		
		System.out.println(process.lastNameHasHigherAlphabeticalScore(person1Information, person2Information));
		System.out.println();
		
		System.out.println(process.printFamilyInformation(person1Information));
		System.out.println(process.printFamilyInformation(person2Information));
		System.out.println();
		
		System.out.println(process.printHighestDegree(person1Information));
		System.out.println(process.printHighestDegree(person2Information));
	}
	
	public String lastNameHasHigherAlphabeticalScore(PersonalInformation person1, PersonalInformation person2) {
		if(person1.getPerson().getLastName().charAt(0) > person2.getPerson().getLastName().charAt(0)) {
			return person1.getPerson().getFirstName() + " has a higher alphabetical score for the first letter of the last name than " + person2.getPerson().getFirstName() + ". " + person1.getPerson().getFirstName() + "`s last name is \"" + person1.getPerson().getLastName() + "\".";
		} else {
			return person2.getPerson().getFirstName() + " has a higher alphabetical score for the first letter of the last name than " + person1.getPerson().getFirstName() + ". " + person2.getPerson().getFirstName() + "`s last name is \"" + person2.getPerson().getLastName() + "\".";
		}
	}
	
	public String printFamilyInformation(PersonalInformation pInformation) {
		StringBuilder familyInformation = new StringBuilder();
		familyInformation.append(pInformation.getPerson().getFirstName() + " has " + pInformation.getFamily().getNoOfKids() + " kids and " + pInformation.getFamily().getNoOfSiblings() + " siblings.");
		
		if(isAMan(pInformation) && isMarried(pInformation)) {
			familyInformation.append(" He is married.");
		} else if(isAMan(pInformation) && !isMarried(pInformation)){
			familyInformation.append(" He is not married.");
		} else if(!isAMan(pInformation) && isMarried(pInformation)) {
			familyInformation.append(" She is married.");
		} else if(!isAMan(pInformation) && !isMarried(pInformation)) {
			familyInformation.append(" She is not married.");
		}
		
		return familyInformation.toString();
	}
	
	public String printHighestDegree(PersonalInformation pInformation) {
		ArrayList<Education> allDegrees = pInformation.getEducation();
		CheckExperience check = new CheckExperience();
		Education highestDegree = check.getHighestDegree(allDegrees);
		
		return pInformation.getPerson().getFirstName() + "s highest degree is \"" + highestDegree.getDegree() + "\".";
	}
	
	boolean isAMan(PersonalInformation pInformation) {
		if(pInformation.getPerson().getSex() == Sex.MALE) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean isMarried(PersonalInformation pInformation) {
		if(pInformation.getFamily().isMarried() == true) {
			return true;
		} else {
			return false;
		}
	}
}
