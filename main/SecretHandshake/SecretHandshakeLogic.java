package main.SecretHandshake;

public class SecretHandshakeLogic {
	
	public String decimalToBinary(int num) {
		StringBuilder result = new StringBuilder();
		int rest;
		
		do {
			rest = num % 2;			
			result.append(zeroOrOne(rest));
			num = num / 2;
		} while(num > 0);
		
		return result.toString();
	}
	
	Integer zeroOrOne(int rest) {
		if(rest == 0) {
			return 1;
		} else if (rest == 1) {
			return 0;
		} else {
			return null;
		}
	}
}
