package assignment1;

public class LowerCaseName implements Mutation{

	
	public void mutate(Employee employee){
		
		String lowercasename = employee.getName().toLowerCase();	
		employee.setName(lowercasename);

	}
	
	}
