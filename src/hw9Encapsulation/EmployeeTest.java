package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("imran");
		emp1.setAge(35);
		emp1.setCitizen(true);
		emp1.setSex('M');
		System.out.println(String.format("I am %s, my age is %d, gender is: \'%s\' and am i a usa citizen? Ans: %b",
				emp1.getName(), emp1.getAge(), emp1.getSex(), emp1.isCitizen()));
	}

}
