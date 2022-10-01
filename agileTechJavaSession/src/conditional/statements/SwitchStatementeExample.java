package conditional.statements;

public class SwitchStatementeExample {

	public static void main(String[] args) {
		
		char ch = 'a';
		char ch1 = Character.toUpperCase(ch);
		System.out.println(ch1);
		switch(ch1) {
		case 'A': 
		case 'E':
		case 'I': 
		case 'O':
		case 'U': System.out.println("Given Character is Vowel");break;
		default:System.out.println("Given Character is consonent");
			
		}
	}

}
