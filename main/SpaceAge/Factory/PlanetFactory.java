package main.SpaceAge.Factory;

public class PlanetFactory {
	public Planet getPlanet(String planetType) {
		switch(planetType.toLowerCase()) {
			case "mercury": return new Mercury();
			case "venus": 	return new Venus();
			case "mars":	return new Mars();
			case "jupiter":	return new Jupiter();
			case "saturn":	return new Saturn();
			case "uranus":	return new Uranus();
			case "neptune":	return new Neptune();
			default: 		return null;
		}
	}
}
