package javapractice;

public class SwitchCase {

	public static void main(String[] args) {
		
		char ch = 'a';
		char ch1 = Character.toUpperCase(ch);
		switch(ch1) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println("Given Character is Vowel");break;
			default:System.out.println("Given Char is not vowel");
		}
	}

}
