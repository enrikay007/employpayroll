package assignment1;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class CombinationTest {

@Test
	public void test() {
	
//Test case 1 random ages and salaries		
	Random randomAges = new Random();
	int ageRange = randomAges.nextInt(40)+20;
	Random randomSalaries = new Random();
	int salaryRange = randomSalaries.nextInt(2000)+3000;
	
	Employee emp = genEmployee(ageRange, salaryRange);
	
	int expectedSalary = salaryRange;
	if(ageRange > 40) { expectedSalary += ageRange/2; }
	IncreaseSalary s = new IncreaseSalary();
	s.mutate(emp);
    assertEquals(expectedSalary, emp.getSalary() );


	assertEquals(expectedSalary, emp.getSalary() );
	
	
// Testcase 2 name assertequals	
	
	String expectedName = "john doe";
	
	LowerCaseName n = new LowerCaseName();
	n.mutate(emp);
	
	//assertEquals(expectedResult, add(10, 11));
	

	assertEquals(expectedName, emp.getName() );
	}
	
	
	private Employee genEmployee(int ageRange, int salaryRange){

		Employee employee = new Employee("John Doe",ageRange,salaryRange);
		
		
		return employee;
		
		 
	}
	
	
	
	
	
	
	
/**	
	private int add(int x, int y) { return x + y;
	}

**/
	
	
}

	