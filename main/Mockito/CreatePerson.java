package main.Mockito;

public class CreatePerson {

	public static void main(String[] args) {
		Person person1 = new Person("Peter", "Müller", Sex.MALE);		
		Family person1Family = new Family();
		person1Family.setMarried(true);
		person1Family.setNoOfKids(2);
		person1Family.setNoOfSiblings(0);
		PersonalInformation petersInformation = new PersonalInformation();
		petersInformation.setPerson(person1);
		petersInformation.setFamily(person1Family);
		
		Person person2 = new Person("Heidi", "Krause", Sex.FEMALE);
		Family person2Family = new Family();
		person2Family.setMarried(false);
		person2Family.setNoOfKids(0);
		person2Family.setNoOfSiblings(3);
		PersonalInformation heidisInformation = new PersonalInformation();
		heidisInformation.setPerson(person2);
		heidisInformation.setFamily(person2Family);
		
		if(person1.getLastName().charAt(0) > person2.getLastName().charAt(0)) {
			System.out.println(petersInformation.getPerson().getFirstName() + " has a higher alphabetical score for the first letter of the last name than " + heidisInformation.getPerson().getFirstName() + ". " + petersInformation.getPerson().getFirstName() + "`s last name is \"" + petersInformation.getPerson().getLastName() + "\".");
		} else {
			System.out.println(heidisInformation.getPerson().getFirstName() + " has a higher alphabetical score for the first letter of the last name than " + petersInformation.getPerson().getFirstName() + ". " + heidisInformation.getPerson().getFirstName() + "`s last name is \"" + heidisInformation.getPerson().getLastName() + "\".");
		}
		
		System.out.println(petersInformation.getPerson().getFirstName() + " has " + petersInformation.getFamily().getNoOfKids() + " kids and " + petersInformation.getFamily().getNoOfSiblings() + " siblings.");
		System.out.println(heidisInformation.getPerson().getFirstName() + " has " + heidisInformation.getFamily().getNoOfKids() + " kids and " + heidisInformation.getFamily().getNoOfSiblings() + " siblings.");
	}

}
