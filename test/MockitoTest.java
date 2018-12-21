package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.Mockito.CheckExperience;
import main.Mockito.DegreeType;
import main.Mockito.Education;
import main.Mockito.PersonalInformation;
import main.Mockito.Profession;

class MockitoTest {
	
	PersonalInformation pI = Mockito.mock(PersonalInformation.class);
	CheckExperience check = new CheckExperience();
	
	@Test
	void highestDegreeIsFound() {
		Education degree1 = new Education(DegreeType.DOCTORAL, 1.0, "Harvard University", 2002, 2007);
		Education degree2 = new Education(DegreeType.MASTER, 1.0, "Harvard University", 1999, 2002);
		ArrayList<Education> allDegrees = new ArrayList<Education>();
		allDegrees.addAll(Arrays.asList(degree1, degree2));
		
		when(pI.getEducation()).thenReturn(allDegrees);
		
		DegreeType expected = DegreeType.DOCTORAL;
		DegreeType actual = check.getHighestDegree(pI.getEducation()).getDegree();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void lastJobIsFound() {
		Profession job1 = new Profession("Housekeeper", "Adlon Hotel", 2010, 2016);
		Profession job2 = new Profession("Bartender", "The Roots", 2016, 2018);
		ArrayList<Profession> allJobs = new ArrayList<Profession>();
		allJobs.addAll(Arrays.asList(job1, job2));
		
		when(pI.getProfession()).thenReturn(allJobs);
		
		Profession expected = job2;
		Profession actual = check.getLastJob(allJobs);
		
		assertEquals(expected, actual);
	}
}
