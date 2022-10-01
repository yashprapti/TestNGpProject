package javapractice;

public class ObjectCreation {
	
	
	
	int age;
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		System.out.println(age);
		return age;
	}
	
	public static void main(String[] args) {
		ObjectCreation obj1 = new ObjectCreation();
		obj1.setAge(25);
		obj1.getAge();
		ObjectCreation obj2 = new ObjectCreation();
		obj2.setAge(30);
		obj2.getAge();
	}

}
