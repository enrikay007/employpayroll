package assignment1;

public class MinAge implements Combination{
	public int neutral(){
    	return 0;
	 
		/**
		 * combine(x, neutral()) = x = combine(neutral(), x).
		 * 
		 * @return The neutral element of the combination.
		 */
				
	}
	public int combine(int x, int y)
	{
		
		
      return  Math.min(x,y);
      /**
		 * 
		 * combine(combine(x,y),z) = combine(x,combine(y,z))
		 * 
		 * @return The combination of x and y.
		 */

	}

	public int projectInt(Employee employee){
	
		/**
		 * @param employee
		 *            An employee.
		 * @return The projection of the property that this combination is defined
		 *         on (e.g. salary or age).
		 */
	 return employee.getAge();
	 
	}
	

	
	
	
}
