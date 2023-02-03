package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(); 
		emp1.setName("imran");
		emp1.setAge(35);
		emp1.setCitizen(true);
		emp1.setSex('M');
		
		System.out.println(String.format("I like the articles %s writes on %d other strings", emp1.getName(), emp1.getAge()));
	}

}
