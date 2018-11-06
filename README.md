# Java
A collection of simple Java applications.

## Technologies
I use Java 8, partially Swing and JUnit5 for testing.

## The applications
### Acronym
Convert an entered name to an acronym. I/O with JOptionPane. 
 
### AliqoutSum
Calculate the aliquot sum of a number and specify its type.

Functions:
- showNumberTypeOf()
	- function that handles the order of the lower functions

- isANaturalNumber()
	- checks if the entered number is a natural number (if it큦 smaller 1)

- calculateResult()
	- calculates the Aliquot Sum of the entered number
	- Aliquot Sum: the sum of all proper divisors of the entered number (not the number itself)

- checkAliquotSum()
	- Checks if the entered number is perfect, abundant or deficient by comparing with the Aliquot Sum
		- perfect: Aliquot Sum = entered number
		- abundant: Aliquot Sum > entered number
		- deficient: Aliquot Sum < entered number
	- Returns a String for the matching type

- isAnError()
	-  Returns an error message as String

- main()
	- I/O with JOptionPane
		- Entering the number
		- Show the result 

### DifferenceOfSquares
Calculate the difference between the square of the sum and the sum of the squares of n natural numbers.

### FactorRaindrops
Calculate all factors of a number with Swing I/O.

### ISBNVerifier
Check an ISBN-number if it큦 a valid 10-ISBN.

### LuhnAlgorithm
Check the validity of a number with the Luhn algorithm.

### Matrix
Convert a String to a matrix array.

### NumberReverse
Reverse a number as a String.

### NumberReverse2
Reverse a number with StringBuilder.

### NumberReverseSwing
Number Reverse with Swing I/O.

### Pangram
Check a String if it큦 a Pangram (contains all letters of the alphabet).

### PangramSwing
Check a String if it큦 a Pangram with Swing.

### ProteinTranslation
Translate RNA sequences to proteins.

### Proverbs
Blanks in a proverb are filled with varying keyboard input.

### RNATranscription
Convert a RNA string to a DNA string.

### Scrabble
Calculate the Scrabble score of a word with JOptionPane I/O.

### SecretHandshake
Generate a secret handshake through decimal to binary convertion.

### SpaceAgeSwing
Convert an age into the age on other planets with Swing I/O.

### StringReverse
Reverse a String.

### StringReverse2
Reverse a String with StringBuilder.

### StringReverseSwing
Reverse a String with StringBuilder and Swing I/O.

### SumOfMultiples
Calculate all multiples of a number and show their total sum.

## Unit Tests
The associated Unit Tests for all applications can be found in the "test" folder. The naming is based on the name of the class + "Test".

## How to set it up
- Download or clone the repo. 
- Open / import the repo in an IDE, I use Eclipse.
- Run the application (Eclipse): 
	- Open an application (main folder).
	- Press ctrl + F11 or the run button
- Run the test (Eclipse): 
	- Open a test file (test folder).
	- Press the right button of your mouse and navigate to "Run as".
	- Click on "JUnit Test"