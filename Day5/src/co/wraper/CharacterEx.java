package co.wraper;

public class CharacterEx {

	public static void main(String[] args) {
		
		boolean isLetter=Character.isLetter('c');
		System.out.println("Character.isLetter('c'):" + isLetter);
		
		boolean isDigit=Character.isDigit('c');
		System.out.println("Character.isDigit('c'):" + isDigit);
		
		boolean isWhitespace=Character.isWhitespace(' ');
		System.out.println("Character.isWhitespace(' '):"+isWhitespace);
		
		boolean isUpperCase=Character.isUpperCase('c');
		System.out.println("Character.isUpperCase('c'):"+isUpperCase);
		
		boolean isLowerCase=Character.isLowerCase('c');
		System.out.println("Character.isLowerCase('c'):"+isLowerCase);
		
		char toUpperCase=Character.toUpperCase('c');
		System.out.println("Character.toUpperCase('c'):"+toUpperCase);
		
		char toLowerCase=Character.toLowerCase('A');
		System.out.println("Character.toLowerCase('A'):"+toLowerCase);
		
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println(Character.MIN_CODE_POINT);

	}

}
