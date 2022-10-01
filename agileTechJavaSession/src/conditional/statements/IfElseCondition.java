package conditional.statements;

public class IfElseCondition {

	public static void main(String[] args) {

		int age = 60;
		
		if(age<18) {
			System.out.println("This person is minor");
		}
		else if(age>18 && age<30) {
			System.out.println("This person is young");
		}else if(age>30 && age<50) {
			System.out.println("This person is middle aged");
		}else {
			System.out.println("This person old aged");
		}
		}
}
