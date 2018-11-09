package main;

/*	Program to convert a String to a matrix array
 * 	Input is given, output via console
 */

public class Matrix {
	
	public static void main(String[] args) {
		Matrix ma = new Matrix();
		String str = "9 8 7\n5 3 2\n6 6 7";
		
		ma.printOriginalString(str);
		ma.buildMatrixArray(str);
	}
	
	void printOriginalString(String str) {
		System.out.println(str);
		System.out.println();
	}
	
	void buildMatrixArray(String str) {
		StringBuilder cleanedUpString = removeAllUnecessaryCharacters(str);
		char[][] matrix = createMatrixArray(cleanedUpString);
		printMatrixArray(matrix);
	}
	
	StringBuilder removeAllUnecessaryCharacters(String str) {
		StringBuilder strBuild = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '1' && str.charAt(i) <= '9')
				strBuild.append(str.charAt(i));
		}
		
		return strBuild;
	}
	
	char[][] createMatrixArray(StringBuilder cleanedUpInput) {
		char[][] matrix = new char[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int row = 0; row < 3; row++) {
				matrix[i][row] = cleanedUpInput.charAt(0);
				cleanedUpInput.deleteCharAt(0);
			}
		}
		
		return matrix;
	}
	
	void printMatrixArray(char[][] matrix) {
		
		for(char[] row : matrix) {
			for(char letter : row) {
				System.out.print(letter + " ");
			}
			System.out.println();
		}
	}
}
