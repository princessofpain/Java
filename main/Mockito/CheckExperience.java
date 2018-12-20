package main.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckExperience {
	
	public Education getHighestDegree(ArrayList<Education> education) {
		Education highestDegree = education.get(0);
		
		for(Education degree: education) {
			DegreeType actualDegree = degree.getDegree();
			DegreeType highestDegreeYet = highestDegree.getDegree();
			
			if(actualDegree == DegreeType.DOCTORAL) {
				return degree;
			} else if(actualDegree == DegreeType.MASTER && highestDegreeYet == DegreeType.BACHELOR || highestDegreeYet == DegreeType.ASSOCIATE) {
				highestDegree = degree;
			} else if(actualDegree == DegreeType.BACHELOR && highestDegreeYet == DegreeType.ASSOCIATE) {
				highestDegree = degree;
			} else if(highestDegreeYet == DegreeType.ASSOCIATE) {
				highestDegree = degree;
			} 
		}

		return highestDegree;
	}
	
	public Profession getLatestJob(ArrayList<Profession> profession) {
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