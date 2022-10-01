package conditional.statements;

public class NestedIfElseCondition {

	public static void main(String[] args) {

		int age = 18;
		if (age <= 18) {
			System.out.println("This person is minor");
			if (age <= 18 && age > 15) {
				System.out.println("This is junior college student");
				if(age==18) {
					System.out.println("This minor is eligible for voting");
				}else {
					System.out.println("this minor is not eligible for voting");
				}
			} else if (age < 15 && age > 5) {
				System.out.println("This is School Boy");
			} else {
				System.out.println("This is a kid");
			}
		} else if (age > 18 && age < 30) {
			System.out.println("This person is young");
						
		} else if (age > 30 && age < 50) {
			System.out.println("This person is middle aged");
		} else {
			System.out.println("This person old aged");
		}
	}
}
