package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.Mockito.CheckExperience;
import main.Mockito.DegreeType;
import main.Mockito.Education;
import main.Mockito.PersonalInformation;

class MockitoTest {

	@Test
	void highestDegreeIsFound() {
		PersonalInformation pI = Mockito.mock(PersonalInformation.class);
		Education degree1 = new Education(DegreeType.DOCTORAL, 1.0, "Harvard University", 2002, 2007);
		Education degree2 = new Education(DegreeType.MASTER, 1.0, "Harvard University", 1999, 2002);
		ArrayList<Education> allDegrees = new ArrayList<Education>();
		allDegrees.addAll(Arrays.asList(degree1, degree2));
		when(pI.getEducation()).thenReturn(allDegrees);
		
		DegreeType expected = DegreeType.DOCTORAL;
		CheckExperience check = new CheckExperience();
		DegreeType actual = check.getHighestDegree(pI.getEducation()).getDegree();
		
		assertEquals(expected, actual);
	}

}
