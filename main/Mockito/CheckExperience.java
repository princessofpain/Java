package main.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckExperience {
	ArrayList<Education> education = new ArrayList<Education>();
	ArrayList<Profession> profession = new ArrayList<Profession>();
	
	public CheckExperience(Education... education) {
		this.education.addAll(Arrays.asList(education));
	}
	
	public CheckExperience(Profession... profession) {
		this.profession.addAll(Arrays.asList(profession));
	}
	
	Education getHighestDegree() {
		Education highestDegree = null;
		
		for(Education degree: education) {
			DegreeType actualDegree = degree.getDegree();
			DegreeType highestDegreeYet = highestDegree.getDegree();
			
			if(actualDegree == DegreeType.DOCTORAL) {
				return degree;
			} else if(actualDegree == DegreeType.MASTER && highestDegreeYet == DegreeType.BACHELOR || highestDegreeYet == DegreeType.ASSOCIATE) {
				highestDegree = degree;
			} else if(actualDegree == DegreeType.BACHELOR && highestDegreeYet == DegreeType.ASSOCIATE) {
				highestDegree = degree;
			} else if(highestDegreeYet == DegreeType.ASSOCIATE && highestDegreeYet == null) {
				highestDegree = degree;
			} 
		}

		return highestDegree;
	}
	
	Profession getLatestJob() {
		Profession latestJob = null;
		int latestStart = 0;
		
		for(Profession job: profession) {
			if(job.getStart() > latestStart) {
				latestJob = job;
				latestStart = job.getStart();
			}
		}

		return latestJob;
	}
}