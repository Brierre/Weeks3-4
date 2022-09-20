package week02;

public class DataTypeSize {

	public static void main(String[] args) {
		//declare variables, declare a space in computer memory large enough to hold a double value and call it dblVariable
		double dblVariable; //semicolon terminates the line, indicates to compiler the end of the instruction
		int intVariable = 10; //initialization
		float fltVariable = 20.50000000000f; //the f at the end is because it wants us to change it to double and we need to keep it as float and treat the variable as a float
		
		System.out.println("The value of intVariable is " + intVariable + ".");
		
		//widening or upgrading
		dblVariable = intVariable;
		System.out.println("The value of dblVariable is " + dblVariable + ".");
		dblVariable = fltVariable;
		System.out.println("The value of dblVariable is " + dblVariable + ".");
			
//		narrowing is not allowed
//		intVariable = dblVariable; bad line of code, will error
//		fltVariable = dblVariable;
		
	}
	
	
}
