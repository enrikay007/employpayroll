package assignment1;
import java.util.List;

public class IncreaseSalary implements Mutation{
	
	
	
	public void mutate(Employee employee){
	
	//int employeeAge = employee.getAge();
	
	//int salary = employee.getSalary() +employee.getAge()/2;
	
	if (employee.getAge() > 40){
		int salary = employee.getSalary() +employee.getAge()/2;
		employee.setSalary(salary);
	}
	
	
	} 	
	
	}

	

