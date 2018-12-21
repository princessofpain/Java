package main.Mockito.Domicile;

public class DomicileFactory {
	public Domicile getDomicile(String type) {
		switch(type.toLowerCase()) {
			case "house":	return new House();
			case "flat":	return new Flat();
			default:		return null;
		}
	}
}
