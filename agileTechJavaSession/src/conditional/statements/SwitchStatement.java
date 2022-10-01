package conditional.statements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int day = 5;
		
		switch(day) {
		
		case 1:
			System.out.println("Sunday");break;			
		case 2:
			System.out.println("Monday");break;
		case 3:
			System.out.println("Tuesday");break;
		case 4:
			System.out.println("Wensday");break;
		case 5:
			System.out.println("Thursday");break;
		case 6:
			System.out.println("Friday");break;
		default:System.out.println("Saturday");
		}
	}

}
