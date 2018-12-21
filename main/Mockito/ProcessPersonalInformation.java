package main.Mockito;

import java.util.Calendar;

import main.Mockito.Domicile.Domicile;
import main.Mockito.Domicile.DomicileFactory;

public class ProcessPersonalInformation {

	public static void main(String[] args) {
		Person person1 = new Person("Peter", "Müller", Sex.MALE);		
		Family person1Family = new Family(true, 2, 0);
		Education person1Degree1 = new Education(DegreeType.ASSOCIATE, 3.3, "Los Angeles City College", 1991, 1993);
		PersonalInformation person1Information = new PersonalInformation();
		person1Information.setPerson(person1);
		person1Information.setFamily(person1Family);
		person1Information.addEducation(person1Degree1);
		Profession person1Profession1 = new Profession("Waitor", "Jimmy´s Pizza House", 1990, 1993);
		Profession person1Profession2 = new Profession("Waitor", "Asado NY", 1993, 1995);
		Profession person1Profession3 = new Profession("Manager", "Asado NY", 1996);
		person1Information.addProfession(person1Profession1, person1Profession2, person1Profession3);
		DomicileFactory domicileFactory = new DomicileFactory();
		Domicile domicilePerson1 = domicileFactory.getDomicile("house");
		domicilePerson1.setBasicInformation(6, 150, "Los Angeles", 2);
		person1Information.setDomicile(domicilePerson1);
		
		PersonalInformation person2Information = new PersonalInformation();
		Person person2 = new Person("Heidi", "Krause", Sex.FEMALE);
		person2Information.setPerson(person2);
		Family person2Family = new Family(false, 0, 3);
		person2Information.setFamily(person2Family);
		Education person2Degree1 = new Education(DegreeType.ASSOCIATE, 2.5, "Boston College", 2002, 2005);
		Education person2Degree2 = new Education(DegreeType.BACHELOR, 2.8, "University Of California", 2005, 2008);
		Education person2Degree3 = new Education(DegreeType.MASTER, 2.0, "University Of California", 2008, 2010);
		person2Information.addEducation(person2Degree1, person2Degree2, person2Degree3);
		Profession person2Profession1 = new Profession("Working Student", "Microsoft", 2009, 2010);
		Profession person2Profession2 = new Profession("Junior Project Manger", "Microsoft", 2010, 2012);
		Profession person2Profession3 = new Profession("Project Manger", "SAP", 2012, 2018);
		person2Information.addProfession(person2Profession1, person2Profession2, person2Profession3);
		Domicile domicilePerson2 = domicileFactory.getDomicile("flat");
		domicilePerson2.setBasicInformation(2, 40, "San Francisco", 7);
		person2Information.setDomicile(domicilePerson2);
		
		ProcessPersonalInformation process = new ProcessPersonalInformation();
		System.out.println(process.lastNameHasHigherAlphabeticalScore(person1Information, person2Information));
		System.out.println();
		
		System.out.println(process.printFamilyInformation(person1Information));
		System.out.println(process.printFamilyInformation(person2Information));
		System.out.println();
		
		System.out.println(process.printHighestDegree(person1Information));
		System.out.println(process.printHighestDegree(person2Information));
		System.out.println();

		System.out.println(process.printLastJob(person1Information));
		System.out.println(process.printLastJob(person2Information));
		System.out.println();
		
		System.out.println(process.printDomicileInformation(person1Information));
		System.out.println(process.printDomicileInformation(person2Information));
		
		domicilePerson2 = domicileFactory.getDomicile("house");
		domicilePerson2.setBasicInformation(4, 100, "San Francisco", 1);
		person2Information.setDomicile(domicilePerson2);
		
		System.out.println();
		System.out.println(process.printDomicileInformation(person2Information));
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
		CheckExperience check = new CheckExperience();
		Education highestDegree = check.getHighestDegree(pInformation.getEducation());
		
		return pInformation.getPerson().getFirstName() + "s highest degree is \"" + highestDegree.getDegree() + "\".";
	}
	
	public String printLastJob(PersonalInformation pInformation) {
		CheckExperience check = new CheckExperience();
		Profession lastJob = check.getLastJob(pInformation.getProfession());
		String lastOrActual = printLastOrActual(lastJob);
				
		return pInformation.getPerson().getFirstName() + " " + lastOrActual + " " + lastJob.getJobTitle() + " at " + lastJob.getEmployer() + "." ;
	}
	
	public String printDomicileInformation(PersonalInformation pInformation) {
		String domicileType = pInformation.getDomicile().getType();
		String type = pInformation.getPerson().getFirstName() + " lives in a " + domicileType + ". ";
		String noOfRooms = "The " + domicileType + " has " + pInformation.getDomicile().getNumberOfRooms() + " rooms. ";
		String sizeAndLocation = "It has " + pInformation.getDomicile().getSize() + " squaremeters and is located in " + pInformation.getDomicile().getLocation() + ".";
		
		return type + noOfRooms + sizeAndLocation;
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
	
	String printLastOrActual(Profession lastProfession) {
		if(isThisYear(lastProfession.getEnd())) {
			return "is currently working as";
		} else {
			return "was most recently working as a";
		}
	}
	
	boolean isThisYear(int end) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		if(end == currentYear) {
			return true;
		} else {
			return false;
		}
	}
}
